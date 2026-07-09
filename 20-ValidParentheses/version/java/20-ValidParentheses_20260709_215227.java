// Last updated: 09/07/2026, 21:52:27
1import java.util.*;
2
3class Solution {
4    public boolean isValid(String s) {
5
6        Stack<Character> stack = new Stack<>();
7
8        for (char ch : s.toCharArray()) {
9
10            if (ch == '(' || ch == '{' || ch == '[') {
11                stack.push(ch);
12            } else {
13
14                if (stack.isEmpty()) {
15                    return false;
16                }
17
18                char top = stack.pop();
19
20                if (ch == ')' && top != '(')
21                    return false;
22
23                if (ch == '}' && top != '{')
24                    return false;
25
26                if (ch == ']' && top != '[')
27                    return false;
28            }
29        }
30
31        return stack.isEmpty();
32    }
33}