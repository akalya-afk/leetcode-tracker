// Last updated: 09/07/2026, 17:51:09
1class Solution {
2    public String sortSentence(String s) {
3
4        String[] words = s.split(" ");
5        String[] ans = new String[words.length];
6
7        for (String word : words) {
8            int index = word.charAt(word.length() - 1) - '1';
9            ans[index] = word.substring(0, word.length() - 1);
10        }
11
12        StringBuilder sb = new StringBuilder();
13
14        for (int i = 0; i < ans.length; i++) {
15            sb.append(ans[i]);
16            if (i != ans.length - 1) {
17                sb.append(" ");
18            }
19        }
20
21        return sb.toString();
22    }
23}