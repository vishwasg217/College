package searching1;

public class MaxPair
{
    public static int maxDistance(int[] nums1, int[] nums2)
    {
        int i=0;
        int j;
        int max=0;
        int dist=0;
        for(i=0;i<nums1.length;i++)
        {
            int low=i;
            j=nums2.length-1;
            int high= nums2.length-1;
            while(i<=j & low<=high)
            {
                j=low+(high-low)/2;
                if(nums1[i]<=nums2[j])
                {
                    if(j-i>max)
                    {
                        max=j-i;
                    }
                    low=j+1;
                }
                else
                {
                    high=j-1;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] n1 = {2,2,2};
        int[] n2 = {10,10,1};
        int ans=maxDistance(n1, n2);
        System.out.println(ans);
    }
}
