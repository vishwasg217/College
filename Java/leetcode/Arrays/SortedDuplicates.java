package LeetCode.Arrays;

import java.util.Arrays;

public class SortedDuplicates
{
    public static int removeDuplicates(int[] nums)
    {
        int count=0;
        for(int i=0;i<nums.length-1;i++)
        {
            while(nums[i]==nums[i+1])
            {
                count++;
                for(int j=i;j<nums.length-1;j++)
                {
                    nums[j]=nums[j+1];
                    if(j==nums.length-2)
                    {
                        nums[j+1]=-1;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        return nums.length-count;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int ans = removeDuplicates(nums);
        System.out.println(ans);
    }
}
