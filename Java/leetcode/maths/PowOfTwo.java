package maths;

public class PowOfTwo
{
    public static void main(String[] args)
    {
        int n = 32;
        int x = n-1;
        boolean ans = (n & x)==0;
        System.out.println(ans);
    }
}
