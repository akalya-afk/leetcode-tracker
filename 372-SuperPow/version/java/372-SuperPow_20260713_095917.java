// Last updated: 13/07/2026, 09:59:17
1import java.util.*;
2
3class Solution {
4
5    public long smallestNumber(long num) {
6
7        if (num == 0) return 0;
8
9        boolean neg = num < 0;
10
11        if (neg) num = -num;
12
13        char[] arr = String.valueOf(num).toCharArray();
14
15        Arrays.sort(arr);
16
17        if (neg) {
18
19            // Descending order for negative numbers
20            String s = "";
21            for (int i = arr.length - 1; i >= 0; i--) {
22                s += arr[i];
23            }
24            return -Long.parseLong(s);
25
26        } else {
27
28            // Put first non-zero digit at the beginning
29            int i = 0;
30            while (arr[i] == '0') {
31                i++;
32            }
33
34            char temp = arr[0];
35            arr[0] = arr[i];
36            arr[i] = temp;
37
38            return Long.parseLong(new String(arr));
39        }
40    }
41}