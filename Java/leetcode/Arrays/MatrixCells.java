package LeetCode.Arrays;

import java.util.Arrays;

public class MatrixCells
{
    public static int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter)
    {
        int[] dist = new int[rows*cols];
        int[][] coord = new int[rows*cols][2];
        int c=0;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                coord[c][0]=i;
                coord[c][1]=j;
                dist[c]=Math.abs(rCenter-i)+Math.abs(cCenter-j);
                c++;
            }
        }

        for(int i=0;i<dist.length-1;i++)
        {
            for(int j=0;j<dist.length-i-1;j++)
            {
                if(dist[j]>dist[j+1])
                {
                    int temp=dist[j];
                    dist[j]=dist[j+1];
                    dist[j+1]=temp;


                    int c1=coord[j][0];
                    coord[j][0]=coord[j+1][0];
                    coord[j+1][0]=c1;

                    int c2=coord[j][1];
                    coord[j][1]=coord[j+1][1];
                    coord[j+1][1]=c2;
                }
            }
        }
        return coord;
    }

    public static void main(String[] args) {
        int[][] ans = allCellsDistOrder(2,2,0,1);
        System.out.println(Arrays.toString(ans));
    }
}
