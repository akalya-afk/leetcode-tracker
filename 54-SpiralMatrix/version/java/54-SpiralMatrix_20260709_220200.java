// Last updated: 09/07/2026, 22:02:00
1import java.util.*;
2
3class Solution {
4    public List<Integer> spiralOrder(int[][] matrix) {
5
6        List<Integer> ans = new ArrayList<>();
7
8        int top = 0;
9        int bottom = matrix.length - 1;
10        int left = 0;
11        int right = matrix[0].length - 1;
12
13        while (top <= bottom && left <= right) {
14
15            // Left -> Right
16            for (int i = left; i <= right; i++) {
17                ans.add(matrix[top][i]);
18            }
19            top++;
20
21            // Top -> Bottom
22            for (int i = top; i <= bottom; i++) {
23                ans.add(matrix[i][right]);
24            }
25            right--;
26
27            // Right -> Left
28            if (top <= bottom) {
29                for (int i = right; i >= left; i--) {
30                    ans.add(matrix[bottom][i]);
31                }
32                bottom--;
33            }
34
35            // Bottom -> Top
36            if (left <= right) {
37                for (int i = bottom; i >= top; i--) {
38                    ans.add(matrix[i][left]);
39                }
40                left++;
41            }
42        }
43
44        return ans;
45    }
46}