package maths;

import java.util.Scanner;

public class OddOrEven
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=in.nextInt();

        System.out.println(check(n));
    }

    private static boolean check(int n)
    {
        return (n & 1) == 1;
    }
}
