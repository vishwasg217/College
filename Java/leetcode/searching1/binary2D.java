package searching1;

public class binary2D
{
    public static boolean searchMatrix(int[][] matrix, int target)
    {
        int r=0;
        int c=matrix[r].length-1;
        while(r<=matrix.length-1 && c>=0)
        {
            if(matrix[r][c]==target)
                return true;
            if(matrix[r][c]>target)
                c--;
            else if(matrix[r][c]<target)
                r++;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] mat={{1,3}};
        boolean ans=searchMatrix(mat, 3);
        System.out.println(ans);
    }
}

