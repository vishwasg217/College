/*
Design a superclass called Staff with details as StaffId, Name, Phone, Salary.
Extend this class by writing three subclasses namely Teaching (domain, publications), Technical (skills), and
Contract (period).
Write a Java program to read and display at least 3 staff objects of all three categories.
 */

import java.util.Scanner;

class Staff
{
    int id;
    String name;
    long phone;
    int sal;

    Staff(int sid, String n, long ph, int s)
    {
        this.id=sid;
        this.name=n;
        this.phone=ph;
        this.sal=s;
    }

    void display()
    {
        System.out.println("ID: "+this.id+"\tName: "+this.name+"\tPhone: "+this.phone+"\tSalary: "+this.sal);
    }
}

class Teaching extends Staff
{
    String domain, publication;
    Teaching(int sid, String n, long ph, int s, String d, String p)
    {
        super(sid, n, ph, s);
        this.domain=d;
        this.publication=p;
    }

    void display()
    {
        super.display();
        System.out.println("Domain: "+this.domain+"\tPublication: "+this.publication);
    }
}

class Technical extends Staff
{
    String skills;
    Technical(int sid, String n, long ph, int s, String sk)
    {
        super(sid, n, ph, s);
        this.skills=sk;

    }

    void display()
    {
        super.display();
        System.out.println("Skills: "+this.skills);
    }
}

class Contract extends Staff
{
    int period;
    Contract(int sid, String n, long ph, int s, int p)
    {
        super(sid, n, ph, s);
        this.period=p;
    }

    void display()
    {
        super.display();
        System.out.println("Period: "+this.period);
    }
}

public class StaffDetails
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Staff[] st =new Staff[50];
        int id;
        String name;
        long phone;
        int sal;
        String domain, publication;
        String skills;
        int period;
        System.out.println("Enter number of teaching staff: ");
        int n = in.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println("Enter ID: ");
            id=in.nextInt();
            System.out.println("Enter name: ");
            name=in.next();
            System.out.println("Enter Phone number: ");
            phone=in.nextLong();
            System.out.println("Enter Salary: ");
            sal=in.nextInt();
            System.out.println("Enter domain: ");
            domain=in.next();
            System.out.println("Enter publication: ");
            publication=in.next();
            st[i] = new Teaching(id, name, phone, sal, domain, publication);
        }

        System.out.println("Enter number of technical staff: ");
        int m = in.nextInt();
        for(int i=n+1;i<=n+m;i++)
        {
            System.out.println("Enter ID: ");
            id=in.nextInt();
            System.out.println("Enter name: ");
            name=in.next();
            System.out.println("Enter Phone number: ");
            phone=in.nextLong();
            System.out.println("Enter Salary: ");
            sal=in.nextInt();
            System.out.println("Enter skills: ");
            skills=in.next();
            st[i] = new Technical(id, name, phone, sal, skills);
        }

        System.out.println("Enter number of contract staff: ");
        int p = in.nextInt();
        for(int i=n+m+1;i<=n+m+p;i++)
        {
            System.out.println("Enter ID: ");
            id=in.nextInt();
            System.out.println("Enter name: ");
            name=in.next();
            System.out.println("Enter Phone number: ");
            phone=in.nextLong();
            System.out.println("Enter Salary: ");
            sal=in.nextInt();
            System.out.println("Enter period: ");
            period=in.nextInt();
            st[i] = new Contract(id, name, phone, sal, period);
        }
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Staff Details: ");
        for(int i=1;i<=n+m+p;i++)
        {
            st[i].display();
            System.out.println();
        }
        System.out.println("------------------------------------------------------------------------");

    }
}

/*
Enter number of teaching staff:
2
Enter ID:
123
Enter name:
abc
Enter Phone number:
444444
Enter Salary:
3000
Enter domain:
d1
Enter publication:
p1
Enter ID:
321
Enter name:
cba
Enter Phone number:
555555
Enter Salary:
2000
Enter domain:
d2
Enter publication:
p2
Enter number of technical staff:
2
Enter ID:
987
Enter name:
xyz
Enter Phone number:
111111
Enter Salary:
5000
Enter skills:
sk1
Enter ID:
789
Enter name:
zyx
Enter Phone number:
444444
Enter Salary:
4000
Enter skills:
sk2
Enter number of contract staff:
2
Enter ID:
456
Enter name:
def
Enter Phone number:
9000
Enter Salary:
6000
Enter period:
3
Enter ID:
654
Enter name:
fed
Enter Phone number:
777777
Enter Salary:
7000
Enter period:
2
------------------------------------------------------------------------
Staff Details:
ID: 123	Name: abc	Phone: 444444	Salary: 3000
Domain: d1	Publication: p1

ID: 321	Name: cba	Phone: 555555	Salary: 2000
Domain: d2	Publication: p2

ID: 987	Name: xyz	Phone: 111111	Salary: 5000
Skills: sk1

ID: 789	Name: zyx	Phone: 444444	Salary: 4000
Skills: sk2

ID: 456	Name: def	Phone: 9000	Salary: 6000
Period: 3

ID: 654	Name: fed	Phone: 777777	Salary: 7000
Period: 2

------------------------------------------------------------------------
 */