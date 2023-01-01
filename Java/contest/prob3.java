import java.util.Scanner;

public class prob3
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] num=new int[n+1];
        for(int i=1;i<=n;i++)
            num[i]=in.nextInt();

        int[] ans=new int[n+1];
        ans[1]=0;
        int x=2;
        for(int i=2;i<=n;i++)
        {
            for(int j=i-1;j>0;j--)
            {
                if(num[j]<num[i])
                {
                    ans[x]=j;
                    break;
                }
            }
            x++;
        }

        for(int i=1;i<=n;i++)
            System.out.print(ans[i]+"\t");
    }
}
