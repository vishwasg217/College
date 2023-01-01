/*
Create a Java class called Student with the following details as variables within it.
(i) USN
(ii) Name
(iii) Branch
(iv) Phone
Write a Java program to create n Student objects and print the USN, Name, Branch, and Phone of these objects with
suitable headings.

 */

import java.util.Scanner;

class Student
{
    String usn;
    String name;
    String branch;
    long phone;

    Student(String id, String n, String b, long ph)
    {
        this.usn=id;
        this.name=n;
        this.branch=b;
        this.phone=ph;
    }

}

public class StudentDetails
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n=in.nextInt();
        Student[] st = new Student[n+1];
        String usn, name, branch;
        long ph;
        for (int i=1;i<=n;i++)
        {
            System.out.println("Enter details for student "+i+":");
            System.out.println("Enter USN: ");
            usn=in.next();

            System.out.println("Enter Name: ");
            name=in.next();
            System.out.println("Enter Branch: ");
            branch=in.next();
            System.out.println("Enter phone number: ");
            ph=in.nextLong();
            st[i]=new Student(usn, name, branch, ph);
        }
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Student Details: ");
        for(int i=1;i<=n;i++)
        {
            System.out.println("USN: "+st[i].usn+"\t\tName: "+st[i].name+"\t\tBranch: "+st[i].branch+"\t\tPhone Number: "+st[i].phone);
            System.out.println();
        }
        System.out.println("----------------------------------------------------------------------------------");
    }
}

/*
OUTPUT:

Enter the number of students:
3
Enter details for student 1:
Enter USN:
1RN20CS182
Enter Name:
Vishwas
Enter Branch:
CSE
Enter phone number:
9342759475
Enter details for student 2:
Enter USN:
1RN20CS169
Enter Name:
Aaditya
Enter Branch:
CSE
Enter phone number:
9623984793
Enter details for student 3:
Enter USN:
1RN20CS178
Enter Name:
Vikas
Enter Branch:
CSE
Enter phone number:
9934572482
-----------------------------------------------------------------------------
Student Details:
USN: 1RN20CS182	Name: Vishwas	Branch: CSE	Phone Number: 9342759475

USN: 1RN20CS169	Name: Aaditya	Branch: CSE	Phone Number: 9623984793

USN: 1RN20CS178	Name: Vikas	Branch: CSE	Phone Number: 9934572482

-----------------------------------------------------------------------------
 */