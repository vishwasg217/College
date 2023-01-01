import java.util.Scanner;

public class binarysearch 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n=in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the key: ");
        int key=in.nextInt();
        int index=bsearch(arr, key);
        if(index>0)
            System.out.println("The element is present at position "+(index+1));
        else
            System.out.println("key not present");
        in.close(); 

    }

    private static int bsearch(int[] nums, int target)
    {
        int low=0, high=nums.length-1, mid;

        while(low<=high)
        {
            mid=low+(high-low)/2;
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
}
