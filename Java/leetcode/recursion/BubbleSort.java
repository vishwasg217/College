package recursion;

import java.util.Scanner;

public class BubbleSort
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

        sort(0, 0, arr);

        System.out.println("Sorted Array: ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i] + "\t");
    }

    private static void sort(int i, int j, int[] arr)
    {
        if(i==arr.length-2)
        {
            return;
        }

        if(j< arr.length-i-1)
        {
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
            sort(i, j+1, arr);
        }
        else
        {
            sort(i+1, 0, arr);
        }
    }
}
