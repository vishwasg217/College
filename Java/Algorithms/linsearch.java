import java.util.Scanner;

public class linsearch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
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
        int index = lsearch(arr, key);
        if(index==-1)
        {
            System.out.println("Key is not present in the array.");
        }
        else
            {
                System.out.println("The key is present at position " + (index+1));
            }
        in.close();
    }

    static int lsearch(int[] arr, int key)
    {
        int i;
        for(i=0; i<arr.length; i++)
        {
            System.out.println("h1");
            if(arr[i]==key)
            {
                System.out.println("h2");
                return i;
            }
        }
        return -1;
    }
    
}
