/*
Find Minimum Cost Spanning Tree of a given connected undirected graph using Kruskal's algorithm.
Use Union-Find algorithms in your program.
 */

import java.util.Scanner;

public class Kruskal
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of vertices: ");
        int n=in.nextInt();
        int[][] mat = new int[n][n];
        System.out.println("Enter the matrix: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j]=in.nextInt();
            }
        }

        int[] edge = new int[20];
        int[] source = new int[20];
        int[] dest = new int[20];
        int k=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((mat[i][j]!=0)&&(mat[i][j]!=999))
                {
                    edge[k]=mat[i][j];
                    source[k]=i;
                    dest[k]=j;
                    k++;
                }

            }
        }

        for(int i=0;i<k-1;i++)
        {
            for(int j=0;j<k-i-1;j++)
            {
                if(edge[j]>edge[j+1])
                {
                    swap(edge, j);
                    swap(source, j);
                    swap(dest, j);
                }
            }
        }

        System.out.println("Solution: ");
        int mincost=0;
        int[] parent = new int[n+1];
        for(int i=0;i<n;i++)
            parent[i]=-1;

        for(int i=0;i<k;i++)
        {
            int a=find(parent, source[i]);
            int b=find(parent, dest[i]);

            if(a!=b)
            {
                mincost=mincost+edge[i];
                union(a,b, parent);
                System.out.print("("+source[i]+","+dest[i]+")\t");
            }
        }
        System.out.println("Minimum Cost: "+mincost);

    }

    private static void union(int a, int b, int[] parent)
    {
        parent[a]=b;
    }

    private static int find(int[] parent, int i)
    {
        if(parent[i]==-1)
            return i;
        return find(parent, parent[i]);
    }

    private static void swap(int[] arr, int j)
    {
        int temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
    }
}


/*
OUTPUT:

Enter the number of vertices:
5
Enter the matrix:
0 5 7 999 2
5 0 999 6 3
7 999 0 4 4
5 6 4 0 4
2 3 4 4 0
Solution:
(0,4)	(1,4)	(2,3)	(2,4)	Minimum Cost: 13
 */