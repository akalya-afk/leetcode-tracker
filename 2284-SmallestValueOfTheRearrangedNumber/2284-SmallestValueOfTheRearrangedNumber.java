// Last updated: 02/09/2026, 09:40:16
import java.util.*;

class Solution {

    public long smallestNumber(long num) {

        if (num == 0) return 0;

        boolean neg = num < 0;

        if (neg) num = -num;

        char[] arr = String.valueOf(num).toCharArray();

        Arrays.sort(arr);

        if (neg) {

            // Descending order for negative numbers
            String s = "";
            for (int i = arr.length - 1; i >= 0; i--) {
                s += arr[i];
            }
            return -Long.parseLong(s);

        } else {

            // Put first non-zero digit at the beginning
            int i = 0;
            while (arr[i] == '0') {
                i++;
            }

            char temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            return Long.parseLong(new String(arr));
        }
    }
}