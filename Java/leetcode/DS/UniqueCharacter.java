package DS;

public class UniqueCharacter
{
    public static char firstUniqChar(String s)
    {
        char x=s.charAt(s.length()-1);
        for(int i=s.length()-2;i>=0;i--)
        {
            x= (char) (x^s.charAt(i));
        }
        return x;
    }

    public static void main(String[] args) {
        char ans = firstUniqChar("leetcode");
        System.out.println(ans);
    }
}
