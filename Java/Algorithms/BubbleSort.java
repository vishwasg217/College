import java.util.Scanner;



class BubbleSort
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
        bubbleSort(arr, n);
        display(arr, n);
    }

    private static void display(int[] arr, int n)
    {
        System.out.println("Sorted Array: ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i] + "\t");
    }

    private static void bubbleSort(int[] arr, int n)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}