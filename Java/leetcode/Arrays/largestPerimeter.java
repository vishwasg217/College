package LeetCode.Arrays;

public class largestPerimeter
{
    public static int largePerimeter(int[] nums)
    {
        int s=0;
        for(int i=0;i<nums.length;i++)
            s=s+nums[i];
        s=s/2;

        double area=Math.sqrt(s*(s-nums[0])*(s-nums[1])*(s-nums[2]));
        double compare = Double.compare(area,0);
        if(compare>0)
            return nums[0]+nums[1]+nums[2];
        else
            return 0;
    }

    public static void main(String[] args) {
        int[] nums={2,1,2};
        int ans = largePerimeter(nums);
        System.out.println(ans);
    }
}
