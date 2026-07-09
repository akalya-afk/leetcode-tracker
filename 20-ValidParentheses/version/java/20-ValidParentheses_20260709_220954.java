// Last updated: 09/07/2026, 22:09:54
1class Solution {
2
3    public String reverseVowels(String s) {
4
5        char[] ch = s.toCharArray();
6
7        int left = 0;
8        int right = ch.length - 1;
9
10        while (left < right) {
11
12            while (left < right && !isVowel(ch[left])) {
13                left++;
14            }
15
16            while (left < right && !isVowel(ch[right])) {
17                right--;
18            }
19
20            char temp = ch[left];
21            ch[left] = ch[right];
22            ch[right] = temp;
23
24            left++;
25            right--;
26        }
27
28        return new String(ch);
29    }
30
31    public boolean isVowel(char c) {
32
33        c = Character.toLowerCase(c);
34
35        return c == 'a' || c == 'e' || c == 'i'
36                || c == 'o' || c == 'u';
37    }
38}