package LeetCode.Arrays;

import java.util.Arrays;

public class RankTransform
{
    public static int[] arrayRankTransform(int[] arr)
    {

        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        int[] rank = new int[arr.length];
        for(int i=0;i<copy.length;i++)
        {
            for(int j=0;j<copy.length;j++)
            {
                if(arr[i]==copy[j])
                {
                    rank[i]=j+1;
                }
            }
        }
        return rank;
    }

    public static void main(String[] args) {
        int[] arr = {37,12,28,9,100,56,80,5,12};
        int[] ans = arrayRankTransform(arr);
        System.out.println(ans);
    }
}
