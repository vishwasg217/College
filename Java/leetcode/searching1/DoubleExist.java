package searching1;

import java.util.Arrays;

public class DoubleExist {
    public static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for (int j = 0; j < arr.length; j++) {
            int low = 0;
            int high = arr.length - 1;
            int i = arr[j] * 2;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (arr[mid] == i)
                    return true;
                if (i > arr[mid])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {-10,12,-20,-8,15};
        boolean ans=checkIfExist(arr);
        System.out.println(ans);
    }
}
