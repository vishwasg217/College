import java.util.Scanner;

public class hw {
    public static void main(String[] args) 
    {
        
        System.out.println("hello world");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=in.nextInt();
        in.nextLine();
        System.out.println("number: " + number);
        System.out.println("Enter string");
        String s2 = in.nextLine();
        System.out.println("The string is: " + s2);
        in.close();
    }

}
