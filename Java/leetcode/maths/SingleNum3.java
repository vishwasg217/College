package maths;

import java.util.Scanner;

public class SingleNum3
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the repetitions: ");
        int r = in.nextInt();
        
        int ans = solution(arr, r);
        System.out.println(ans);
        
    }

    private static int solution(int[] arr, int r) 
    {
        int[] arrBin = new int[arr.length];
        convertToBin(arr, arrBin);
        return 0;
        
        
    }

    private static void convertToBin(int[] arr, int[] arrBin)
    {

        for(int i=0;i< arr.length;i++)
        {
            int B_Number = 0;
            int cnt = 0;
            while (arr[i] != 0)
            {
                int rem = arr[i] % 2;
                double c = Math.pow(10, cnt);
                B_Number += rem * c;
                arr[i] /= 2;

                // Count used to store exponent value
                cnt++;
            }
            arrBin[i]=B_Number;

        }

    }
}
