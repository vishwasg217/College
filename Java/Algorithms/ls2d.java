import java.util.Scanner;

public class ls2d 
{
    public static void main(String[] args) 
    {
        
        Scanner in = new Scanner(System.in);   
        System.out.println("Enter the size of matrix: ");
        int n = in.nextInt();
        int[][] mat = new int[n][n];
        System.out.println("Enter the matrix: ");
        for(int i=0; i<mat.length; i++)
        {
            for(int j=0; j<mat[i].length; j++)
            {
                mat[i][j]=in.nextInt();
            }
        }
        System.out.println("Enter an key element: ");
        int key = in.nextInt();
        int[] index = lsearch(mat, key);
        if(index[0]==-1)
        {
            System.out.println("Key is not present in the array.");
        }
        else
            {
                System.out.println("The key is present at position " + (index[0]+1)+", "+(index[1]+1));
            }
        in.close();
    }

    private static int[] lsearch(int[][] mat, int key) 
    {
        int[] soln = new int[2];
        for(int i=0; i<mat.length; i++)
        {
            for(int j=0; j<mat[i].length; j++)
            {
                if(mat[i][j]==key)
                {
                    soln[0]=i;
                    soln[1]=j;
                    return soln;
                }
            }
        }
        return new int[]{-1, -1};
    }
}
