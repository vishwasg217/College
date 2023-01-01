/*
Implement in Java, the 0/1 Knapsack problem using
(a) Dynamic Programming method
(b) Greedy method.
 */

import java.util.Scanner;

public class DynamicKnapsack
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of objects: ");
        int n= in.nextInt();
        int[] w = new int[n+1];
        int[] p =new int[n+1];
        System.out.println("Enter the weight of each object: ");
        for(int i=1;i<=n;i++)
        {
            w[i]=in.nextInt();
        }
        System.out.println("Enter the profit of each object: ");
        for(int i=1;i<n+1;i++)
        {
            p[i]= in.nextInt();
        }
        System.out.println("Enter the capacity of knapsack: ");
        int cap= in.nextInt();

        ks(n, w, p, cap);
    }

    private static void ks(int n, int[] w, int[] p, int cap)
    {
        int[][] mat = new int[n+1][cap+1];

        for(int i=0;i<=cap;i++)
        {
            mat[0][i]=0;
        }
        for(int i=0;i<=n;i++)
        {
            mat[i][0]=0;
        }

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=cap;j++)
            {
                if(j>=w[i])
                {
                    mat[i][j]=Math.max(mat[i-1][j], p[i]+mat[i-1][j-w[i]]);
                }
                else
                {
                    mat[i][j]=mat[i-1][j];
                }
            }
        }

        System.out.println("Solution Matrix: ");
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("Optimal solution: "+mat[n][cap]);
    }
}

/*
OUTPUT:

Enter the number of objects:
4
Enter the weight of each object:
2 1 3 2
Enter the profit of each object:
12 10 20 15
Enter the capacity of knapsack:
5
Solution Matrix:
0	0	0	0	0	0
0	0	12	12	12	12
0	10	12	22	22	22
0	10	12	22	30	32
0	10	15	25	30	37
Optimal solution: 37
 */