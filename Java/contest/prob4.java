import java.util.Scanner;

public class prob4
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] num=new int[n];
        for(int i=0;i<n;i++)
            num[i]=in.nextInt();
        int[] ans = new int[n];
        for(int i=0;i<n;i++)
        {
            if(num[i]==1)
                ans[i]=1;
            else
                ans[i]=climbStairs(num[i]);
        }


        for(int i=0;i<n;i++)
            System.out.println(ans[i]);

    }

    public static int climbStairs(int n) {

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2]+ dp[i-3];
        }

        return dp[n];
    }
}
