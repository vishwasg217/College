package LeetCode.Arrays;

public class NegativeMatrix
{
    public static int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            int low = 0;
            int high = grid.length - 1;

            while (low <= high) {
                int mid = (low + high) / 2;

                if (grid[i][mid] < 0) {
                    count = count + (grid.length - mid);
                }
                if (grid[i][low] > grid[i][mid]) {
                    low = mid+1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int ans = countNegatives(grid);
        System.out.println(ans);
    }
}
