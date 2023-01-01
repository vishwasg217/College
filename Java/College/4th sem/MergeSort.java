/*
Sort a given set of n integer elements using Merge Sort method and compute its time complexity.
Run the program for varied values of n>5000, and record the time taken to sort.
Plot a graph of the time taken versus non graph sheet.
The elements can be read from a file or can be generated using the random number generator.
Demonstrate using Java how the divide-and-conquer method works along with its time
complexity analysis: worst case, average case and best case.
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MergeSort
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Enter the size of the array: ");
        int n=in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter choice: 1. Best case\t2. Average case\t3. Worst case");
        int ch=in.nextInt();
        switch (ch)
        {
            case 1 -> {
                            for(int i=0;i<n;i++)
                                        arr[i]=i;
                        }
            case 2 -> {
                            for(int i=0;i<n;i++)
                                arr[i]=r.nextInt(1000);
            }

            case 3 -> {
                            for(int i=0;i<n;i++)
                                arr[i]=n-i;
            }
        }
        long start = System.nanoTime();
        mergesort(arr, 0, n-1);
        long end = System.nanoTime();
        System.out.println("Sorted Array: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Elapsed time: "+(end-start));
    }

    private static void mergesort(int[] arr, int low, int high)
    {
        if(high-low==0)
        {
            return;
        }
        int mid=(low+high)/2;
        mergesort(arr, low, mid);
        mergesort(arr, mid+1, high);
        merge(arr, low, high, mid);
    }

    private static void merge(int[] arr, int low, int high, int mid)
    {
        int[] aux = new int[arr.length];
        int i=low, j=mid+1, k=low;
        while(i<=mid && j<=high)
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
        while(i<=mid)
        {
            aux[k++]=arr[i++];
        }
        while(j<=high)
        {
            aux[k++]=arr[j++];
        }
        for(int x=low;x<=high;x++)
        {
            arr[x]=aux[x];
        }
    }
}
