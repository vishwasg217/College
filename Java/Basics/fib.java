import java.util.Scanner;

public class fib {

    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        n=in.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+" "+b+" ");
        for(int i=1; i<n; i++)
        {
            int fibno=a+b;
            a=b;
            b=fibno;
            System.out.print(fibno+" ");
        }
        in.close();
    }
    
}
