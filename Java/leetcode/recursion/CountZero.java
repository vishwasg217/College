package recursion;

import java.util.Scanner;

public class CountZero
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = in.nextInt();
        int c=0;
        int ans = count(c, n);
        System.out.println(ans);
    }

    private static int count(int c,int n)
    {
        if(n==0)
        {
            return c;
        }
        else if(n%10==0)
        {
            return count(c+1,n/10);
        }
        else {
            return count(c, n/10);
        }

    }
}
