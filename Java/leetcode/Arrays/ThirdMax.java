package LeetCode.Arrays;
import java.util.Arrays;
public class ThirdMax
{
    public static int thirdMax(int[] nums)
    {
        Arrays.sort(nums);
        int i;
        int j=nums.length-1;
        for(i=0;i<2;i++)
        {
            if(j>0)
            {
                while(nums[j]==nums[j-1])
                    j--;
                j--;
            }

        }
        if(i==1)
            return nums[j];
        else
            return nums[nums.length-1];
    }

    public static void main(String[] args)
    {
        int[] nums={1,1,2};
        int ans =thirdMax(nums);
        System.out.println(ans);
    }
}
