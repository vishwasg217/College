package DS;

public class duplicate
{
    public static boolean containsDuplicate(int[] nums)
    {
        int a=0;
        int b=nums.length-1;

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,5,-2,-4,0};
        int xor=nums[0];
        for(int i=1;i<nums.length-1;i++)
        {
            xor=xor^nums[i];
        }
        System.out.println(xor);
        //boolean ans  = containsDuplicate(nums);
        //System.out.println(ans);
    }
}
