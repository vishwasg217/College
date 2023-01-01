package searching1;

public class Coins
{
    public static int arrangeCoins(int n)
    {
        long left = 0, right = n;
        long k, curr;
        while (left <= right) {
            k = left + (right - left) / 2;
            curr = k * (k + 1) / 2;

            if (curr == n) return (int)k;

            if (n < curr) {
                right = k - 1;
            } else {
                left = k + 1;
            }
        }
        return (int)right;
    }

    public static void main(String[] args) {
        int ans=arrangeCoins(8);
        System.out.println(ans);
    }
}
