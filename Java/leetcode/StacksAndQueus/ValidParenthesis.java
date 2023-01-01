package StacksAndQueus;

import java.util.Stack;


public class ValidParenthesis
{
    public static boolean isValid(String s)
    {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++)
        {

            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
            {
                st.push(s.charAt(i));
            }
            else if(!st.empty())
            {
                if(st.peek()=='(' && s.charAt(i)==')')
                {
                    char del=st.pop();
                }
                else if(st.peek()=='[' && s.charAt(i)==']')
                {
                    char del=st.pop();
                }
                else if(st.peek()=='{' && s.charAt(i)=='}')
                {
                    char del=st.pop();
                }
                else return false;

            }
            else return false;
        }
        return st.empty();
    }

    public static void main(String[] args) {
        String s = "()";
        boolean ans = isValid(s);
        System.out.println(ans);
    }
}
