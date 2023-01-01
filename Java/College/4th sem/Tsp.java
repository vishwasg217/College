/*
Write Java programs to (a) Implement All-Pairs Shortest Paths problem using Floyd's algorithm.
(b) Implement Travelling Sales Person problem using Dynamic programming.
 */

import java.util.Scanner;

public class Tsp
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of cities: ");
        int n=in.nextInt();
        int[][] cost = new int[n+1][n+1];
        System.out.println("Enter the cost adjacency matrix: ");
        int[] set = new int[n+1];
        for (int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                cost[i][j]=in.nextInt();
            }
            set[i]=1;
        }


        int mincost = g(1, n-1, set, cost, n);
        System.out.println("Minimal cost of optimal tour: "+mincost);
    }

    private static int g(int i, int s, int[] set, int[][] mat, int n)
    {
        int[] newset = new int[n+1];
        int[] selected = new int[n+1];
        for(int j=1;j<=n;j++)
        {
            newset[j]=set[j];
        }
        newset[i]=0;
        if(s==0)
            return mat[i][1];

        for(int k=0, j=2;k<s;j++)
        {
            if(newset[j]==1)
            {
                selected[k]=mat[i][j]+g(j, s-1, newset, mat, n);
                k++;
            }
        }

        int min = 999;
        for(int j=0;j<s;j++)
        {
            if(selected[j]<min)
            {
                min = selected[j];
            }
        }

        return min;
    }
}


/*
OUTPUT:

Enter number of cities:
4
Enter the cost adjacency matrix:
0 10 15 20
5 0 9 10
6 13 0 12
8 8 9 0
Minimal cost of optimal tour: 35
 */