/*
Write a Java program to implement the Stack using arrays.
Write Push(), Pop(), and Display() methods to demonstrate its working.
 */

import java.util.Scanner;

class Stack
{
    int cap=3;
    int[] stack= new int[cap];
    int top=-1;
    void push(int ele)
    {
        if(top==cap-1)
        {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top]=ele;
    }

    void pop()
    {
        if(top==-1)
        {
            System.out.println("Stack Underflow");
            return ;
        }
        top--;
        System.out.println("Element popped: "+(stack[top+1]));
    }

    void display()
    {
        if(top==-1)
        {
            System.out.println("Stack Underflow");
            return ;
        }
        for(int i=top;i>-1;i--)
        {
            System.out.println(stack[i]);
        }
    }

}

public class StackDemo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Stack s=new Stack();
        while(true)
        {
            System.out.println("Enter a choice: 1. Push\t2. Pop\t3. Display: ");
            int ch=in.nextInt();
            switch(ch)
            {
                case 1 ->
                {
                    System.out.println("Enter element to be pushed: ");
                    int ele = in.nextInt();
                    s.push(ele);
                }
                case 2 -> s.pop();
                case 3 -> s.display();
            }
        }
    }
}

/*
OUTPUT:

Enter a choice: 1. Push	2. Pop	3. Display:
1
Enter element to be pushed:
1
Enter a choice: 1. Push	2. Pop	3. Display:
1
Enter element to be pushed:
2
Enter a choice: 1. Push	2. Pop	3. Display:
1
Enter element to be pushed:
3
Enter a choice: 1. Push	2. Pop	3. Display:
1
Enter element to be pushed:
4
Stack Overflow
Enter a choice: 1. Push	2. Pop	3. Display:
3
3
2
1
Enter a choice: 1. Push	2. Pop	3. Display:
2
Element popped: 3
Enter a choice: 1. Push	2. Pop	3. Display:
2
Element popped: 2
Enter a choice: 1. Push	2. Pop	3. Display:
2
Element popped: 1
Enter a choice: 1. Push	2. Pop	3. Display:
2
Stack Underflow
Enter a choice: 1. Push	2. Pop	3. Display:
3
Stack Underflow
Enter a choice: 1. Push	2. Pop	3. Display:
 */