/*
Design and implement in Java to find a subset of a given set S = {Sl,S2,.....,Sn} of n positive integers
whose SUM is equal to a given positive integer d.
For example, if S ={1, 2, 5, 6, 8} and d= 9, there are two solutions {1,2,6}and {1,8}.
Display a suitable message, if the given problem instance doesn't have a solution.
 */

import java.util.Scanner;

public class SubsetSum
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the target: ");
        int target = in.nextInt();

        int tot=0;
        int rem=0;
        for(int i=0;i<n;i++)
        {
            rem=rem+arr[i];
        }
        int[] soln  = new int[20];
        subset(arr, target, 0, rem, soln, 0);
    }

    private static void subset(int[] arr, int target, int tot, int rem, int[] soln, int index)
    {
        soln[index]=1;
        if(tot+arr[index]==target)
        {
            System.out.println("Solution: ");
            for(int i=0;i<=index;i++)
            {
                if(soln[i]==1)
                    System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        else if(tot+arr[index]+arr[index+1]<=target)
        {

            subset(arr, target, tot+arr[index], rem-arr[index], soln, index+1);
        }

        if((tot+rem-arr[index]>=target)&&(tot+arr[index+1]<=target))
        {
            soln[index]=0;
            subset(arr, target, tot, rem-arr[index], soln, index+1);
        }

    }
}

/*
Enter the size of array:
5
Enter the elements
1 2 5 6 8
Enter the target:
9
Solution:
1 2 6
Solution:
1 8
 */