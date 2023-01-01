package maths;

import java.util.Scanner;

public class IsPrime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = in.nextInt();
        for(int i=0;i<=n;i++)
        {
            if(isPrime(i))
            {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int i)
    {
        int c=2;
        boolean ans=true;
        if(i<=1)
        {
            return false;
        }
        while(c*c<=i)
        {
            if(i%c==0)
            {
                return false;
            }
            c++;
        }
        return ans;
    }
}
