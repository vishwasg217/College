import java.util.Scanner;

public class InsertionSort
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

        insSort(arr, n);

        for(int i=0;i<n;i++)
            System.out.print(arr[i] + "\t");

    }

    private static void insSort(int[] arr, int n)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else
                {
                    break;
                }
            }
        }
    }
}
