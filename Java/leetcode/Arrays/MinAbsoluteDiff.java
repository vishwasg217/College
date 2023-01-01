package LeetCode.Arrays;
import java.util.*;

public class MinAbsoluteDiff
{
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList();
        Arrays.sort(arr);
        int mindiff = 100000000;
        int i1;
        int i2;
        int k = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] < mindiff) {
                List<Integer> aux = new ArrayList<>();
                aux.add(arr[i - 1]);
                aux.add(arr[i]);
                mindiff = arr[i] - arr[i - 1];
                if(ans.size()>=1)
                    ans.removeAll(ans);
                ans.add(k, aux);
                continue;
            }

            if (arr[i] - arr[i - 1] == mindiff) {
                List<Integer> aux = new ArrayList<>();
                aux.add(arr[i - 1]);
                aux.add(arr[i]);
                mindiff = arr[i] - arr[i - 1];
                k = k + 1;
                ans.add(k, aux);

            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {-17,46,63,81,-101,-91,121,-2,112,-15,-65,-96,6,-139};
        List<List<Integer>> ans = minimumAbsDifference(nums);
        System.out.println(ans);
    }

}



