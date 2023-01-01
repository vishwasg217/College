package DS;

public class RansomNote
{
    public static boolean canConstruct(String ransomNote, String magazine)
    {
        int[] f1 = new int[26];
        int[] f2 = new int[26];

        for(int i=0;i<ransomNote.length();i++)
        {
            f1[ransomNote.charAt(i)-'a']++;
        }
        for(int i=0;i<magazine.length();i++)
        {
            f2[magazine.charAt(i)-'a']++;
        }
        int x=0;
        while(x<=ransomNote.length())
        {
            if(f1[x]>f2[x])
                return false;
            x++;
        }
        return true;

    }

    public static void main(String[] args) {
        boolean ans  = canConstruct("aa", "aab");
        System.out.println(ans);
    }
}
