package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort
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

        mergeSort2(arr, 0, n);
        System.out.println("Sorted Array: ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i] + "\t");
    }

    private static void mergeSort2(int[] arr, int low, int high)
    {
        if(high-low==1)
        {
            return;
        }

        int mid = (low+high)/2;
        mergeSort2(arr, low, mid);
        mergeSort2(arr, mid, high);
        merge2(arr, low, high, mid);


    }

    private static void merge2(int[] arr, int low, int high, int mid)
    {
        int[] aux=new int[high-low];
        int i=low, j=mid, k=0;
        while(i<mid && j<high)
        {
            if(arr[i]<=arr[j])
            {
                aux[k++]=arr[i++];
            }
            else
            {
                aux[k++]=arr[j++];
            }
        }
        while(i<mid)
        {
            aux[k++]=arr[i++];

        }
        while(j<high)
        {
            aux[k++]=arr[j++];
        }

        for(int x=low;x< aux.length;x++)
        {
            arr[low+x]=aux[x];
        }
    }

    private static int[] mergeSort(int[] arr)
    {


        if(arr.length==1)
        {
            return arr;
        }

        int mid=(arr.length)/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right)
    {
        int[] arr = new int[left.length+ right.length];
        int i=0, j=0, k=0;
        while(i< left.length && j< right.length)
        {
            if(left[i]<=right[j])
            {
                arr[k++]=left[i++];
            }

            else
            {
                arr[k++]=right[j++];
            }

        }
        while(i< left.length)
        {
            arr[k++]=left[i++];

        }
        while(j< right.length)
        {
            arr[k++]=left[j++];
        }
        return arr;
    }
}
