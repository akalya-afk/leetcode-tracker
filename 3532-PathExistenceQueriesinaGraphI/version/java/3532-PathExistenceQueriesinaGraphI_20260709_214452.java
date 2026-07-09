// Last updated: 09/07/2026, 21:44:52
1// Added using AI
2class Solution {
3    public int numberOfSpecialChars(String word) {
4        int[] mpl = new int[26];
5        int[] mpu = new int[26];
6        java.util.Arrays.fill(mpl, -1) ;
7        java.util.Arrays.fill(mpu, -1);
8        int n = word.length();
9        for (int i = 0; i < n; i++) {
10            char a = word.charAt(i);
11            if (Character.isLowerCase(a)) {
12                mpl[a - 'a'] = i ;
13            } else {
14                int idx = a - 'A';
15                if (mpu[idx] == -1)
16                    mpu[idx] = i;
17            }
18        }
19        int ans = 0;
20        for (int i = 0; i < 26; i++) {
21            if (mpl[i] != -1 && mpu[i] != -1 && mpl[i] < mpu[i])
22                ans++ ;
23        }
24        return ans;
25    }
26}