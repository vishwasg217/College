package searching1;

public class FirstAndLast {

    public static int[] searchRange(int[] nums, int target)
    {
        int low=0;
        int high=nums.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            while(nums[mid]==target)
            {
                if(nums[low]<target)
                    low++;
                if(nums[high]>target)
                    high--;
                if(nums[low]==target & nums[high]==target)
                    return new int[]{low, high};
            }
            if(nums[mid]>target)
                high=mid-1;
            else
                low=mid+1;
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int[] ans  = searchRange(nums, 6);
        for(int x:ans)
        {
            System.out.println(x);
        }
    }
}
