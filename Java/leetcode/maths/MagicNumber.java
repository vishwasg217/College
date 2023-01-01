package maths;

public class MagicNumber
{
    public static void main(String[] args)
    {
        int n = 76;
        int base = 5;
        int x = 1;
        int ans = 0;
        while(n>0)
        {
            int temp = n&1;
            ans = ans + (base*temp);
            n=n>>1;
            base=base*5;
        }
        System.out.println(ans);



    }
}
