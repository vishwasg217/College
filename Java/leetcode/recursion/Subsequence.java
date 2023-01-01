package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Subsequence
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String s;
        System.out.println("Enter a String: ");
        s=in.next();
        ArrayList<String> ans = subseq("", s);
        System.out.println(ans);
    }

    private static ArrayList<String> subseq(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> left=subseq(p+up.charAt(0), up.substring(1));
        ArrayList<String> right=subseq(p, up.substring(1));
        left.addAll(right);
        return left;
    }
}
