package maths;

import java.util.Scanner;

public class DigitCount
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=in.nextInt();
        System.out.println("Enter the base");
        int b=in.nextInt();

        int ans = (int)(Math.log(n)/Math.log(b))+1;
        System.out.println(ans);
    }
}
