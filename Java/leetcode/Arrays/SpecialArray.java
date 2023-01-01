package LeetCode.Arrays;

public class SpecialArray
{
    public static int specialArray(int[] arr)
    {
        int n=arr.length;
        int[] check = new int[n+1];
        for(int i=0;i<n+1;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(arr[j]>=i)
                {
                    count++;
                }
            }
            check[i]=count;
        }

        for(int i=0;i<n+1;i++)
        {
            if(i==check[i])
            {
                return check[i];
            }

        }
        return -1;
    }


}
