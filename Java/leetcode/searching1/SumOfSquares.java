package searching1;

public class SumOfSquares
{
    public static boolean judgeSquareSum(int c)
    {
        if(c<=1)
            return true;
        int low=0;
        int high=c/2;
        while(low<=high)
        {
            long mid=((long) low *low)+((long) high *high);
            if(mid==c)
                return true;
            if(mid>c)
                high--;
            else
                low++;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean ans = judgeSquareSum(2147482647);
        System.out.println(ans);
    }
}
