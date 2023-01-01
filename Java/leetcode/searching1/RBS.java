package searching1;

public class RBS
{
    public static void main(String[] args) {
        int[] nums ={3, 1};
        int ans = search(nums, 1);
        System.out.println(ans);
    }

    public static int search(int[] nums, int target)
    {
        int pivot=findPivot(nums);
        int ans=0;

        if(pivot==-1)
            ans=bsearch(nums, target, 0, nums.length-1);
        else if(nums[pivot]==target)
            return pivot;
        else if(target>nums[0])
            ans=bsearch(nums, target, 0, pivot-1);
        else if(target<nums[0])
            ans=bsearch(nums, target, pivot+1, nums.length-1);
        return ans;
    }

    private static int bsearch(int[] nums, int target,int low,int high)
    {

        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(target==nums[mid])
            {
                return mid;
            }
            else if(target<nums[mid])
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return -1;
    }

    public static int findPivot(int[] nums)
    {
        int low=0;
        int high=nums.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;

            if(mid<high && nums[mid]>nums[mid+1])
            {
                return mid;
            }

            if(mid>low && nums[mid]<nums[mid-1])
            {
                return mid-1;
            }

            if(nums[low]>=nums[mid])
            {
                high=mid-1;
            }

            if(nums[low]<=nums[mid])
            {
                low=mid+1;
            }
        }
        return -1;
    }

}
