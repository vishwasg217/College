package recursion;

import java.util.Scanner;

public class StarPattern
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int n=in.nextInt();
        pattern(n, 0);
        System.out.println();
        pattern2(n, 0);
    }

    private static void pattern2(int r, int c)
    {
        if(r==0)
        {
            return;
        }
        if(c<r)
        {
            pattern2(r, c+1);
            System.out.print("*\t");
        }
        else
        {
            pattern2(r-1, 0);
            System.out.println();
        }
    }

    private static void pattern(int r, int c)
    {
        if(r==0)
            return;

        if(c<r)
        {
            System.out.print("*\t");
            pattern(r, c+1);
        }

        else
        {
            System.out.println();
            pattern(r-1, 0);
        }
    }


}


/*
Output:

Enter the number of lines
4
*	*	*	*
*	*	*
*	*
*
 */