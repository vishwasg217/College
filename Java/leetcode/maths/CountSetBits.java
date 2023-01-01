package maths;

import java.util.Scanner;

public class CountSetBits
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = in.nextInt();
        System.out.println("Verification: "+Integer.toBinaryString(n));

        int count=0;
        while(n>0)
        {
            if((n&1)==1)
            {
                count++;
            }
            n=n>>>1;
        }
        System.out.println("Answer: "+count);
    }
}
