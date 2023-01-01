import java.util.Scanner;

public class countdig {
    public static void main(String[] args) {
        int num, rem, dig, count=0;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number: ");
        num = in.nextInt();
        System.out.println("Enter digit to be counted: ");
        dig = in.nextInt();
        
        while(num!=0)
        {
            rem=num%10;
            num=num/10;
            if(rem==dig)
            {
                    count++;
            }
        }

        System.out.println("Count: " + count);
        in.close();
    }
}
