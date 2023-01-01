class Solution 
{
    public static void findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int[] merge = new int[nums1.length+nums2.length];
        int p1=0, p2=0, i=0;
        while(p1<nums1.length&&p2<nums2.length)
        {
            if(nums1[p1]<=nums2[p2])
            {
                System.out.println(nums1[p1]+"  "+nums2[p2]);
                merge[i++]=nums1[p1];
                p1++;
            }
            else
            {
                System.out.println("h1 "+nums1[p1]+"  "+nums2[p2]);
                merge[i++]=nums2[p2];
                p2++;
            }
        }
        System.out.println("out of while loop");
        if(p2>=nums2.length)
        {
            for(;p1<nums1.length;p1++)
            {
                merge[i++]=nums1[p1];
            }
        }
        if(p1>=nums1.length)
        {
            for(;p2<nums2.length;p2++)
            {
                merge[i++]=nums2[p2];
            }
        }
        System.out.println("Merge: ");
        for(int x=0;x<merge.length;x++)
        {
            System.out.println(merge[x]+" ");
        }
        int mid=(0+merge.length-1)/2;
        float median;
        if(merge.length%2==0)
        {
            System.out.println("h1");
            System.out.println(merge[mid]);
            System.out.println(merge[mid+1]);
            double m = (2+3)/2;
            System.out.println(m);
            median=(merge[mid]+merge[mid+1])/2;
        }
        else
        {
            median=merge[mid];
        }
        System.out.println("median: "+median);

    }

    public static void main(String[] args) {
        int[] a1 = {1, 2};
        int[] a2 = {3, 4};
        findMedianSortedArrays(a1, a2);
    }
}