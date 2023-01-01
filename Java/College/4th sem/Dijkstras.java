/*
From a given vertex in a weighted connected graph, find the shortest paths to other vertices using
Dijkstra's algorithm.
Write the program in Java.
 */

import java.util.Scanner;

public class Dijkstras
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the matrix: ");
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
        System.out.println("Enter the source vertex: ");
        int sv = in.nextInt();

        dijkstras(mat, n, sv);
    }

    private static void dijkstras(int[][] mat, int n, int sv)
    {
        int[] dist = new int[n];
        int[] visited = new int[n];

        for(int i=0;i<n;i++)
        {
            dist[i]=mat[sv][i];
            visited[i]=0;
        }

        visited[sv]=1;

        for(int i=0;i<n-1;i++)
        {
            int min=999;
            int unvis=0;
            for(int j=0;j<n;j++)
            {
                if(dist[j]<min && visited[i]==0)
                {
                    min = dist[i];
                    unvis = i;
                }
            }

            visited[unvis]=1;

            for(int v=0;v<n;v++) {
                if (dist[v] > dist[unvis] + mat[unvis][v]) {
                    dist[v] = dist[unvis] + mat[unvis][v];
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            System.out.println("The shortest path between vertex "+sv+ " and "+i+" is: "+dist[i]);
        }

    }
}
/*
OUTPUT:

Enter the size of the matrix:
5
Enter the matrix:
0 3 999 7 999
3 0 4 2 999
999 4 0 5 6
7 2 5 0 4
999 999 6 4 0
Enter the source vertex:
0
The shortest path between vertex 0 and 0 is: 0
The shortest path between vertex 0 and 1 is: 3
The shortest path between vertex 0 and 2 is: 7
The shortest path between vertex 0 and 3 is: 5
The shortest path between vertex 0 and 4 is: 9
 */