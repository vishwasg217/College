package searching1;

public class SquareRoot
{
    public static int mySqrt(int x)
    {
        if(x<2)
            return x;
        if(x==2)
            return 1;
        for(int i=1;i<x;i++)
        {
            if(i*i==x)
                return i;
            if(i*i>x)
                return i-1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int a=2147483647;
        int ans=mySqrt(a);
        System.out.println(ans);
    }
}
