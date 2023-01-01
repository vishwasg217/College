package recursion;

public class BinarySearch
{
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int target = 20;
        int index = binsearch(arr, target, 0, arr.length-1);
        System.out.println(index);

    }

    private static int binsearch(int[] arr, int target, int s, int e)
    {
        if(s>e)
        {
            return -1;
        }
        int m=(s+e)/2;

        if(arr[m]==target)
        {
            return m;
        }
        else if(arr[m]<target)
        {
            return binsearch(arr, target, m+1, e);
        }
        return binsearch(arr, target, s, m-1);

    }
}
