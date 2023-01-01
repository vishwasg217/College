package maths;

import java.util.Scanner;

public class Power
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter base: ");
        int base=in.nextInt();
        System.out.println("Enter power: ");
        int n=in.nextInt();
        int ans = 1;
        while(n>0)
        {
            if((n & 1)==1)
            {
                ans=ans*base;
            }
            base=base*base;
            n=n>>1;

        }
        System.out.println(base);
    }
}
