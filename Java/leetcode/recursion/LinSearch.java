package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class LinSearch
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
        System.out.println("Enter target: ");
        int target=in.nextInt();
        /*int ans = search(arr, target, 0);
        System.out.println(ans);*/

        ArrayList<Integer> list = search2(arr, target, 0);
        System.out.println(list);

    }

    private static ArrayList<Integer> search2(int[] arr, int target, int i)
    {
        ArrayList<Integer> list = new ArrayList<>();
        if(i==arr.length)
        {
            return list;
        }
        if(target==arr[i])
        {
            list.add(i);
        }
        ArrayList<Integer> aux = search2(arr, target, i+1);
        list.addAll(aux);
        return list;
    }

    private static int search(int[] arr, int target, int i)
    {
        if(i==arr.length)
        {
            return -1;
        }
        if(target==arr[i])
        {
            return i;
        }
        return search(arr, target, i+1);
    }


}
