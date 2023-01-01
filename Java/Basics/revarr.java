import java.util.Scanner;

public class revarr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=in.nextInt();
        }
        reverse(arr);
        System.out.println("Reversed array: ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + "  ");
        }
        in.close();
    }

    private static void reverse(int[] arr) {
        for(int i=0, j=arr.length-1; i<(arr.length)/2; i++, j--)
        {
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    
}
