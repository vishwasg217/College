package searching1;

public class ValidSquare
{
    public static boolean isPerfectSquare(int num)
    {
        int low=0;
        int high=num/2+1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            long x= (long) mid *mid;
            if(x==(long)num) {
                return true;
            }
            if(x<(long)num)
                low=mid+1;
            else
                high=mid-1;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean ans = isPerfectSquare(82);
        System.out.println(ans);
    }
}
