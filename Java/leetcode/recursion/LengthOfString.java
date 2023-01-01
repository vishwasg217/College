package recursion;

public class LengthOfString
{
    public static void main(String[] args) {
        String s = "abcdce";
        int len = recLen(s);
        System.out.println(len);
    }

    private static int recLen(String s)
    {
        if (s.equals(""))
            return 0;

        return recLen(s.substring(1)) + 1;
    }
}
