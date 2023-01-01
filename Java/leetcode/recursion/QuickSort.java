package recursion;

import java.util.Scanner;

public class QuickSort
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n=in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }

        //int[] ans=mergeSort(arr);

        quickSort(arr, 0, arr.length-1);
        System.out.println("Sorted Array: ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i] + "\t");
    }

    private static void quickSort(int[] arr, int low, int high)
    {
        if(low>=high)
        {
            return;
        }

        int start=low;
        int end=high;
        int mid=(start+end)/2;
        int pivot=arr[mid];
        if(start<=end)
        {
            while(arr[start]<pivot)
            {
                start++;
            }
            while(arr[end]>pivot)
            {
                end--;
            }
            if(start<=end)
            {
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
            quickSort(arr, low, end);
            quickSort(arr, start, high);
        }
    }
}
