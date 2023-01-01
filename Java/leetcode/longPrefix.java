public class longPrefix {
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            String pre="";
            for(int i=0;i<strs[1].length();i++)
            {
                if(strs[0].charAt(i)==strs[1].charAt(i)==strs[2].charAt(i))
                {
                    pre=pre+strs[0].charAt(i);
                }
            }
            return pre;
        }
    }
    
}
