package recursion;

import java.util.Scanner;

public class SortedOrNot
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        int x=0;
        boolean ans=check(x, arr);
        System.out.println(ans);
    }

    private static boolean check(int x, int[] arr)
    {
        if(x==arr.length)
        {
            return true;
        }
        return (arr[x]<=arr[x+1])&&(check(x+1, arr));
    }
}
