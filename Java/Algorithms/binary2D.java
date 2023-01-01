import java.util.Arrays;

public class binary2D
{
    public static void main(String[] args) {
        int[][] mat = {{1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}};
        int key=13;

        int[] i=binarySearch(mat, key);
        System.out.println(Arrays.toString(i));


    }    

    static int[] binarySearch(int[][] mat, int key)
    {
        int r=0;
        int c=mat.length-1;

        while(r<=mat.length-1 && c>=0)
        {
            if(key==mat[r][c])
            {
                return new int[]{r, c};
            }

            if(key<mat[r][c])
            {
                c--;
            }
            else if(key>mat[r][c])
            {
                r++;
            }
        }
        return new int[]{-1, -1};
    }
}
