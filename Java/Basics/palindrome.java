import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        String pal;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        pal = in.next();
        
        String revpal = "";

        for(int i=pal.length()-1; i>=0; i--)
        {
            char ch=pal.charAt(i);
            revpal= revpal+ch;
        }

        System.out.println("Reversed string: " + revpal);

        int flag=0;
        // for(int i=0; i<pal.length(); i++)
        // {
        
        //     if(pal.charAt(i) == revpal.charAt(i))
        //     {
        //         flag=1;
        //     }
        //     else
        //     {
        //         flag=0;
        //     }
        //     System.out.println(flag);
        // }

        if(pal.equals(revpal))
        {
            flag=1;
        }
        
        if(flag==1)
        {
            System.out.println("Palindrome. ");
        }
        else
        System.out.println("not a palindrome. ");
        in.close();
    }
}
