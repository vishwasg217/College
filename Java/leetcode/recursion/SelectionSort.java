package recursion;

import java.util.Scanner;

public class SelectionSort
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

        sort(0, arr);

        System.out.println("Sorted Array: ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i] + "\t");
    }

    private static void sort(int i, int[] arr)
    {
        if(i== arr.length-2)
        {
            return;
        }

        int maxIndex=0;
        for(int x=0;x<arr.length-i-1;x++)
        {
            if(arr[maxIndex]<arr[x])
            {
                maxIndex=x;
            }
        }
        int temp=arr[maxIndex];
        arr[maxIndex]=arr[arr.length-i-1];
        arr[arr.length-i-1]=temp;
        sort(i+1, arr);

    }
}
