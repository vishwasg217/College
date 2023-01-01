import java.util.Scanner;

public class MissingNumberCS
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n= in.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }

        cycleSort(arr);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        int m = findMissingNumber(arr);

        System.out.println("Missing Number: "+m);

    }

    private static int findMissingNumber(int[] nums)
    {
        for(int i=0;i<nums.length;i++)
            if (nums[i] != i)
                return i;
        return nums.length;
    }

    private static void cycleSort(int[] nums)
    {
        for(int i=0;i<nums.length;i++)
        {

            while(nums[i]<nums.length && nums[i]!=i)
            {
                int temp=nums[i];
                nums[i]=nums[temp];
                nums[temp]=temp;
            }
        }

    }
}
