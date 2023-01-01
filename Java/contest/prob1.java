import java.util.Arrays;
import  java.util.Scanner;

public class prob1
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int[] num=new int[t];
        for(int i=0;i<t;i++)
        {
            num[i]=in.nextInt();
        }
        String[] ans=new String[num.length];
        Arrays.fill(ans, "NO");
        int x=0;
        for(int i=0;i<num.length;i++)
        {
            for(int j=2;j<=num[i];j++)
            {
                if(num[i]%j==0 & j%2==1)
                {
                    ans[x]="YES";
                    break;
                }
            }
            x++;
        }
        for(int i=0;i<ans.length;i++)
            System.out.println(ans[i]);

    }
}
