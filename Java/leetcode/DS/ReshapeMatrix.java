package DS;

import java.util.Arrays;

public class ReshapeMatrix {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int x = mat.length;
        int y = mat[0].length;

        if (x == r && y == c)
            return mat;

        if (x * y != r * c)
            return mat;

        int[] temp = new int[r * c];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                temp[y * i + j] = mat[i][j];
            }
        }

        int[][] res = new int[r][c];
        for (int i = 0; i < temp.length; i++) {
            res[i / c][i % c] = temp[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] mat ={{1,2},{3,4}};
        int[][] ans = matrixReshape(mat, 1,4);
        for(int i=0;i<ans.length;i++)
        {
            for(int j=0;j<ans[i].length;j++)
            {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
}
