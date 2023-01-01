/*
Write Java programs to (a) Implement All-Pair's Shortest Paths problem using Floyd's algorithm.
(b) Implement Travelling Sales Person problem using Dynamic programming.
 */
import java.util.Scanner;

public class Floyd
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of matrix: ");
        int n = in.nextInt();
        int[][] mat = new int[n][n];
        System.out.println("Enter the matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = in.nextInt();
            }
        }

        floyd(mat, n);

        System.out.println("Path Matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }
    private static void floyd(int[][] mat, int n)
    {
        for(int k=0;k<n;k++)
        {
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    mat[i][j]=Math.min(mat[i][j], mat[i][k]+mat[k][j]);
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
0 999 3 999
2 0 999 999
999 7 0 1
6 999 999 0

Path Matrix:
0	10	3	4
2	0	5	6
7	7	0	1
6	16	9	0
 */