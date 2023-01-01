package maths;

import java.util.Scanner;

public class SingleNum
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n=in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array: ");
        for(int i=0;i< arr.length;i++)
        {
            arr[i]=in.nextInt();
        }

        int ans = solution(arr);
        System.out.println(ans);
    }

    private static int solution(int[] arr)
    {
        int ans=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            ans=ans^arr[i];
        }
        return ans;
    }
}
