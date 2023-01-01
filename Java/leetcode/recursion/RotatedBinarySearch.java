package recursion;

import java.util.Scanner;

public class RotatedBinarySearch
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("Enter target: ");
        int target=in.nextInt();
        int ans = search(arr, target, 0, n-1);
        System.out.println(ans);
    }

    private static int search(int[] arr, int target, int start, int end)
    {
        int mid = (start+end)/2;

        if(start>end)
        {
            return -1;
        }

        if(arr[mid]==target)
        {
            return mid;
        }

        if(arr[start] < arr[mid])
        {
            if(target<arr[mid] && target>=arr[start])
            /*the reason why we use this particular if condition is because, we must always search in the sorted part of the array.
             In this case, since arr[mid] is greater than arr[start], we can say that this part of the array is sorted.
             Same concept is applied for the 2nd if condition below.
             */
                return search(arr, target, start, mid-1);
            else
                return search(arr, target, mid+1, end);
        }

        else
        {
            if(target>arr[mid] && target<=arr[end])
                return search(arr, target, mid+1, end);
            else
                return search(arr, target, start, mid-1);
        }
    }
}
