/*
Write a Java program to read two integers a and b. Compute a/b and print, when b is not zero.
Raise an exception when b is equal to zero.
 */

import java.util.Scanner;

public class Exception
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numerator: ");
        int a=in.nextInt();
        System.out.println("Enter Denominator: ");
        int b=in.nextInt();
        try{
            float c = (float)a/b;
            System.out.println("Answer: "+c);
        }catch(ArithmeticException ae)
        {
            System.out.println(ae);
        }

    }
}
/*
OUTPUT:

Enter numerator:
3
Enter Denominator:
2
Answer: 1.5

Enter numerator:
3
Enter Denominator:
0
Answer: Infinity
 */