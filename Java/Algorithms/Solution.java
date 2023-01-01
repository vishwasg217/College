import java.util.ArrayList;

import java.util.List;

public class Solution
{

    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int maxsum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum=0;
            for (int j = i; j < nums.length; j++) {
                sum = sum + nums[j];
                if (sum > maxsum) {
                    maxsum = sum;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        int ans = maxSubArray(nums);
        System.out.println(ans);
    }

}
