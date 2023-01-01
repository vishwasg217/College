package maths;

import java.util.Scanner;

public class Xor
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = in.nextInt();
        int xor=0;
        for(int i=1;i<=n;i++)
        {
            xor=xor^i;
        }
        System.out.println(xor);
    }
}
