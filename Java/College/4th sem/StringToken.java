/*
Write a Java class called Customer to store their name and date_of_birth.
The date_of_birth format should be dd/mm/yyyy.
Write methods to read customer data as <name, dd/mm/yyyy> and display as <name, dd, mm, yyyy> using StringTokenizer
class considering the delimiter character as “/”.
 */
import java.util.Scanner;
import java.util.StringTokenizer;
class Customer
{
    String name;
    String dob;

    Customer(String n, String d)
    {
        this.dob=d;
        this.name=n;
    }

    void display()
    {
        StringTokenizer st = new StringTokenizer(dob, "/");
        System.out.print(name);
        while(st.hasMoreTokens())
        {
            System.out.print(","+st.nextToken());
        }
    }

}

class StringToken
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name=in.next();
        System.out.println("Enter DOB: ");
        String dob=in.next();
        Customer c = new Customer(name, dob);
        c.display();
    }
}

/*
Enter name:
Vishwas
Enter DOB:
21/11/2002
Vishwas,21,11,2002
 */