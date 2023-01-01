import java.util.Scanner;

public class lsrchrange {

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int[] range = new int[2];
        System.out.println("Enter the size of the array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        int key = in.nextInt();
        System.out.println("Enter the range index: ");
        range[0] = in.nextInt();
        range[1] = in.nextInt();
        int index = lsearch(arr, key, range);
        if(index==-1)
        {
            System.out.println("Key is not present in the array.");
        }
        else
            {
                System.out.println("The key is present at index: " + (index));
            }
        in.close();
    }

    static int lsearch(int[] arr, int key, int[] range)
    {
        int i;
        for(i=range[0]; i<=range[1]; i++)
        {
            if(arr[i]==key)
            {
                
                return i;
            }
        }
        return -1;
    }

    
}
