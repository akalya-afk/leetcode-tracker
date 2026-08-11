// Last updated: 11/08/2026, 15:58:49
1class Solution {
2    public int minDistance(String word1, String word2) {
3
4        int m = word1.length();
5        int n = word2.length();
6
7        int[][] dp = new int[m + 1][n + 1];
8
9        // If word1 is empty
10        for (int j = 0; j <= n; j++) {
11            dp[0][j] = j;
12        }
13
14        // If word2 is empty
15        for (int i = 0; i <= m; i++) {
16            dp[i][0] = i;
17        }
18
19        for (int i = 1; i <= m; i++) {
20            for (int j = 1; j <= n; j++) {
21
22                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
23                    dp[i][j] = dp[i - 1][j - 1];
24                } 
25                else {
26                    dp[i][j] = 1 + Math.min(
27                        dp[i - 1][j], 
28                        Math.min(
29                            dp[i][j - 1],
30                            dp[i - 1][j - 1]
31                        )
32                    );
33                }
34            }
35        }
36
37        return dp[m][n];
38    }
39}