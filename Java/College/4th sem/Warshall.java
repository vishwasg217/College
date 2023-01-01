import java.util.Scanner;

public class Warshall
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of matrix: ");
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

        warshall(mat, n);
        System.out.println("Path Matrix: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }

    }

    private static void warshall(int[][] mat, int n)
    {
        for(int k=0;k<n;k++)
        {
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if((mat[i][j]==1)||(mat[i][k]==1&&mat[k][j]==1))
                    {
                        mat[i][j]=1;
                    }
                }
            }
        }
    }
}

/*
OUTPUT:

Enter the size of matrix:
4
Enter the matrix:
0 1 0 0
0 0 0 1
0 0 0 0
1 0 1 0
Path Matrix:
1	1	1	1
1	1	1	1
0	0	0	0
1	1	1	1
 */