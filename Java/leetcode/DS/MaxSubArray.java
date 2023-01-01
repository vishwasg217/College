package DS;

public class MaxSubArray
{
    public static int maxSubArray(int[] nums)
    {
        int maxsum=nums[0];
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            if(sum<0)
                sum=0;
            if(sum>maxsum)
                maxsum=sum;
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int[] nums={-1};
        int ans=maxSubArray(nums);
        System.out.println(ans);
    }
}
