import java.util.Scanner;

public class SelSort
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

        selectionSort(arr, n);

        for(int i=0;i<n;i++)
            System.out.print(arr[i] + "\t");

    }

    private static void selectionSort(int[] arr, int n)
    {
        for(int i=0;i<n-1;i++)
        {
            int maxIndex=0;
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[maxIndex]<arr[j])
                {
                    maxIndex=j;
                }

            }
            if(arr[maxIndex]>arr[maxIndex+1])
            {
                int temp=arr[maxIndex];
                arr[maxIndex]=arr[n-i-1];
                arr[n-i-1]=temp;
            }

        }
    }
}
