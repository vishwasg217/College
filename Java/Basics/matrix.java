import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter the matrix: ");
        for(int i=0; i<arr.length; i++)
        {
             for(int j=0; j<arr[i].length; j++)
             {
                arr[i][j] = in.nextInt();
             }
        }
        System.out.println();
        for(int i=0; i<arr.length; i++)
        {
             for(int j=0; j<arr[i].length; j++)
             {
                System.out.print(arr[i][j] + "      ");
             }
             System.out.println();
             System.out.println();
        }

        in.close();
    }
}
