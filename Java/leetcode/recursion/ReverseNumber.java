package recursion;

import java.util.Scanner;

public class ReverseNumber
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = in.nextInt();
        int c=(int)Math.log10(n)+1;
        int ans = reverse(c, n);
        System.out.println(ans);
    }

    private static int reverse(int c, int n)
    {

        if(n==0)
        {
            return 0;
        }
        return (int)((n%10)*(Math.pow(10, c-1)))+reverse(--c, n/10);
    }
}
