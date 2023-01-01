/*
Design and implement in Java to find all Hamiltonian Cycles in a connected undirected Graph G of n
vertices using backtracking principle.
 */

import java.util.Scanner;

public class Hamiltonian 
{
    static int n;
    static int[][] mat = new int[10][10];
    static int[] x = new int[10];

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of cities: ");
        n=in.nextInt();

        System.out.println("Enter the matrix: ");
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=n;j++)
            {
                mat[i][j]=in.nextInt();
            }
        }
        x[1]=1;
        hamiltonian(2);
        
    }

    private static void hamiltonian(int k)
    {
        do
        {
            nextVal(k);
            if(x[k]==0)
                return;
            if(k==n)
            {
                System.out.println("Solution");
                for(int i=1;i<=n;i++)
                {
                    System.out.print(x[i]+"->");
                }
                System.out.println("1");
            }
            else hamiltonian(k+1);
        }while(true);


    }

    private static void nextVal(int k)
    {
        int i;
        do
        {
            x[k]=(x[k]+1)%(n+1);
            if(x[k]==0)
                return;
            if(mat[x[k-1]][x[k]]==1)
            {
                for(i=1;i<k;i++)
                {
                    if(x[i]==x[k])
                        break;
                }
                if(i==k)
                {
                    if((k<n)||((k==n)&&(mat[x[n]][x[1]]==1)))
                    {
                        return;
                    }
                }
            }
        }while(true);
    }
}

/*
OUTPUT:

Enter the number of cities:
4
Enter the matrix:
1 1 1 1
1 1 1 1
1 1 1 1
1 1 1 1
Solution
1->2->3->4->1
Solution
1->2->4->3->1
Solution
1->3->2->4->1
Solution
1->3->4->2->1
Solution
1->4->2->3->1
Solution
1->4->3->2->1
 */