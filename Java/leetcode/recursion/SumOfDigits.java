package recursion;

import java.util.Scanner;

public class SumOfDigits
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = in.nextInt();

        int ans = sum(n);
        System.out.println(ans);
    }

    private static int sum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return (n%10)+sum(n/10);
    }
}
