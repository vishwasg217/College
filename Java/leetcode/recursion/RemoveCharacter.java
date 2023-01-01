package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveCharacter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String s;
        System.out.println("Enter a String: ");
        s=in.next();
        System.out.println("Enter letter to be removed: ");
        char key=in.next().charAt(0);
        ArrayList<Character> ans=function(s, 0, key);
        System.out.println(ans);

    }

    private static ArrayList<Character> function(String s, int index, char key)
    {
        char[] arr = s.toCharArray();
        ArrayList<Character> ans = new ArrayList<>();
        if(arr.length==index)
        {
            return ans;
        }
        if(arr[index]!=key)
        {
            ans.add(arr[index]);
        }
        ArrayList<Character> aux = function(s, index+1, key);
        ans.addAll(aux);
        return ans;
    }
}
