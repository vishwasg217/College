import java.util.Scanner;

public class CycleSort
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

        cycleSort(arr, n);

        for(int i=0;i<n;i++)
            System.out.print(arr[i] + "\t");

    }

    private static void cycleSort(int[] arr, int n)
    {
        for(int i=0;i<n;i++)
        {
            while(arr[i]!=i+1)
            {
                int temp=arr[i];
                arr[i]=arr[temp-1];
                arr[temp-1]=temp;
            }
        }
    }
}
