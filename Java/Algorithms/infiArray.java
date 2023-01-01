import java.util.Scanner;

public class infiArray 
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int[] arr = {1, 6, 14, 39, 56, 90, 177, 639, 1004, 2220};
        int key=in.nextInt();
        int[] ans=findRange(arr, key);
        int index=bsearch(arr, key, ans);
        System.out.println("Index: "+index);
        in.close();   
    }

    private static int bsearch(int[] arr, int key, int[] ans) 
    {
        int low=ans[0], high=ans[1];
        int mid=0;
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
        return low;
    }

    private static int[] findRange(int[] arr, int key) 
    {
        int low=0, high=1;
        int boxsize = 2;
        while(key>arr[high])
        {
            low=high+1;
            boxsize=boxsize*2;
            System.out.println("h1");
            high=high+boxsize;
        }
        return new int[]{low, high};
    }   

}
