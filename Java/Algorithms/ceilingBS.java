import java.util.Scanner;

public class ceilingBS 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n=in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the key: ");
        int key=in.nextInt();
        int index=bsearch(arr, key);
        //System.out.println("Position: "+(index+1));
        System.out.println("Ceiling:  "+arr[index]);
        System.out.println("Floor: "+arr[index-1]);
        in.close(); 

    }

    private static int bsearch(int[] arr, int key) 
    {
        int low=0, high=arr.length-1, mid=0;

        while(low<=high)
        {
            mid=(low+high)/2;
            if(key==arr[mid])
            {
                return mid;
            }
            else if(key<arr[mid])
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return mid;
    }    
}
