package LeetCode.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort
{

        public static void merge ( int[] nums1, int m, int[] nums2, int n)
        {
            int[] ans = new int[m + n];
            int i = 0;
            int j = m;
            int k = 0;
            while (i <= m - 1 && j <= n - 1) {
                if (nums1[i] <= nums2[j]) {
                    ans[k++] = nums1[i++];
                } else
                    ans[k++] = nums2[j++];
            }

            while (i <= m - 1) {
                ans[k++] = nums1[i++];
            }
            while (j <= n - 1) {
                ans[k++] = nums2[j++];
            }


            for (int x = 0; x < m + n; x++) {
                nums1[x] = ans[x];
            }

            System.out.println(Arrays.toString(nums1));
        }

    public static void main(String[] args)
    {
        int[] nums1 = {1,2,3, 0, 0, 0};
        int[] nums2={0,5,5};
        merge2(nums1, 3, nums2, nums2.length);
        System.out.println(Arrays.toString(nums1));

    }

    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n - 1, i = m + n - 1;
        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[i--] = nums1[p1--];
            } else {
                nums1[i--] = nums2[p2--];
            }
        }
    }
}
