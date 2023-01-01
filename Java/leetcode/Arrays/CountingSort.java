package LeetCode.Arrays;

import java.util.Arrays;

public class CountingSort
{
    public static int heightChecker(int[] heights)
    {
        int[] count = new int[101];

        for(int i=0;i<heights.length;i++)
        {
            ++count[heights[i]];
        }

        int[] shiftedCount = new int[count.length];
        int sum=count[0];
        for(int i=1;i<count.length;i++)
        {
            sum=sum+count[i-1];
            shiftedCount[i]=sum;
        }
        int[] ans = new int[heights.length];
        for(int i=0;i<heights.length;i++)
        {
            ans[shiftedCount[heights[i]]]=heights[i];
            shiftedCount[heights[i]]+=1;
        }

        System.out.println(Arrays.toString((ans)));
        int c=0;
        for(int i=0;i<heights.length;i++)
        {
            if(heights[i]!=ans[i])
                c++;
        }
        return c;
    }

    public static void main(String[] args) {
        int[] height = {5,1,2,3,4};
        int ans=heightChecker(height);
        System.out.println(ans);
    }
}
