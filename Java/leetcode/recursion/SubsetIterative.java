package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubsetIterative
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n=in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the subset: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        //ArrayList<ArrayList<Integer>> ans = function(arr);
        //System.out.println(ans);
    }


}
