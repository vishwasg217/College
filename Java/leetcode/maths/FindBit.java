package maths;

import java.util.Scanner;

public class FindBit
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = in.nextInt();
        System.out.println("Enter index: ");
        int i = in.nextInt();

        int ans = solution(n, i);
        System.out.println(ans);

    }

    private static int solution(int n, int i)
    {
        return n & (1<<i-1);
    }
}
