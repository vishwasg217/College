import java.util.Scanner;



public class countevendig 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n =in.nextInt();
        int[] arr = new int[n]; 
        System.out.println("Enter the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        int c=search(arr);
        System.out.println("Number of elements with even number of digits: "+c);
        in.close();
    }

    private static int search(int[] arr) 
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(evenorodd(arr[i]))
            {
                count++;
            }

        }
        return count;
    }

    private static boolean evenorodd(int i) 
    {
        int n=i;
        int count=0;
        while(n>0)
        {
            count++;
            n=n/10;
        }
        if(count%2==0)
        {
            return true;
        }
        return false;
    }
    
       
}
