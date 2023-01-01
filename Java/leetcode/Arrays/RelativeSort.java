package LeetCode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RelativeSort
{
    public static int[] relativeSortArray(int[] a, int[] b)
    {
        int[] count = new int[1001];

        for(int i=0;i<a.length;i++)
        {
            ++count[a[i]];
        }

        int[] x  = new int[count.length];
        x[b[0]]=0;
        int prev=0;
        for(int i=1;i<b.length;i++)
        {
            x[b[i]]=count[b[i-1]]+prev;
            prev=x[b[i]];
        }
        System.out.println(Arrays.toString(x));
        int[] ans = new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            ans[x[a[i]]]=a[i];
            x[a[i]]+=1;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] a = {2,3,1,3,2,4,6,7,9,2,19};
        int[] b = {2,1,4,3,9,6};
        int[] ans = relativeSortArray(a,b);
        System.out.println(Arrays.toString(ans));

        ArrayList<Integer>  list= new ArrayList<Integer>();



    }
}
