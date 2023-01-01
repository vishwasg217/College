import java.util.Scanner;

public class prime 
{
    public static void main(String[] args) {
        int p;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        p=in.nextInt();
        

        // boolean ans2 = isarm(p);
        // System.out.println("Armstrong Number? ");
        // System.out.println(ans2);

        for(int i=100;i<1000;i++)
        {
            if(isarm(i))
            {
                System.out.println(i);
            }
        } 
        in.close();
    }  

    static boolean isprime(int n)
    {
        if(n<=1)
        {
            return false;
        }

        int c=2;
        while(c*c<n)
        {
            if(n%c==0)
            {
                return false;
            }
            c++;
        }
        return c*c>n;
    }

    static boolean isarm(int n)
    {
        int dig, sum=0;
        int or=n;

        while(n!=0)
        {
            dig=n%10;
            n=n/10;            
            sum=sum+(dig*dig*dig);
        }
        return sum==or;
    }


}
