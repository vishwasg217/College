import java.util.Scanner;

public class prob5
{
    /*
Find Minimum Cost Spanning Tree of a given connected undirected
graph using Prim's algorithm
 */



        public static void main(String[] args)
        {
            int n=0, i,j,sv;
            Scanner in = new Scanner(System.in);
            n=in.nextInt();
            int m=in.nextInt();
            int[][] mat= new int[n][n];
            System.out.println("Enter the matrix: ");
            for(i=0;i<n;i++)
            {

                    int a=in.nextInt();
                    int b=in.nextInt();
                    int l=in.nextInt();
                    mat[a][b]=l;

            }
            System.out.println("The matrix is: ");
            for(i=0;i<mat.length;i++)
            {
                for(j=0;j<mat[i].length;j++)
                {
                    System.out.print(mat[i][j]+"  ");
                }
                System.out.println();
            }
            System.out.println("Enter the source vertex: ");
            int[] vis = new int[n];
            sv=in.nextInt();
            vis[sv]=1;
            for(i=0;i<n;i++)
            {
                if(vis[i]!=1)
                {
                    vis[i]=0;
                }
            }
            gprims(mat, vis, n);



        }

        private static void gprims(int[][] a, int[] vis, int n)
        {
            int i, j, k, cost=0, min, s=0, d=0;
            for(i=1;i<n;i++)
            {
                int max=0;
                for(j=0;j<n;j++)
                {
                    if(vis[j]==1)
                    {
                        for(k=0;k<n;k++)
                        {
                            if((vis[k]==0)&&(a[j][k]!=999))
                            {
                                if(max<a[j][k])
                                {
                                    min=a[j][k];
                                    s=j;
                                    d=k;
                                }
                            }
                        }
                    }
                }
                vis[d]=1;
                System.out.println("("+s+","+d+")   ");
                cost=cost+max;
            }
            System.out.println("Minimal cost: "+cost);
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
The matrix is:
0  5  7  999  2
5  0  999  6  3
7  999  0  4  4
5  6  4  0  4
2  3  4  4  0
Enter the source vertex:
0
(0,4)
(4,1)
(4,2)
(2,3)
Minimal cost: 13
 */


