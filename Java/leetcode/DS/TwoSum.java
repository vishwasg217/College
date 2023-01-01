package DS;

import java.util.Arrays;

public class TwoSum
{
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int[] ans = twoSum(nums, 6);
        for(int i:ans)
        {
            System.out.println(i);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] nums2 = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums2);
        int a = 0;
        int b = nums.length - 1;
        int[] temp = new int[2];
        while (a < b) {
            int sum = nums2[a] + nums2[b];
            if (sum == target) {
                temp[0] = nums2[a];
                temp[1] = nums2[b];
                break;
            }
            if (sum < target)
                a++;
            else
                b--;
        }

        int[] ans = new int[2];
        int x = 0;
        int y = nums.length - 1;
        for (x = 0; x < nums.length; x++) {
            if (nums[x] == temp[0])
                ans[0] = x;
            if (nums[y] == temp[1])
                ans[1] = y;
            y--;
        }

        return ans;
    }


}
