package maths;

import java.util.Scanner;

public class SievePrime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = in.nextInt();

        boolean[] arr = new boolean[n+1];
        sieve(n,arr);
        for(int i=2;i<=n;i++)
        {
            if(!arr[i])
            {
                System.out.println(i);
            }
        }
    }

    private static void sieve(int n, boolean[] arr)
    {
        for(int i=2;i*i<=n;i++)
            if (!arr[i]) {
                for (int j = i * 2; j <= n; j = j + i) {
                    arr[j] = true;
                }
            }

    }
}
