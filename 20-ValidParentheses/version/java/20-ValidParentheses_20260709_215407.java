// Last updated: 09/07/2026, 21:54:07
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3
4        int m = matrix.length;
5        int n = matrix[0].length;
6
7        int low = 0;
8        int high = m * n - 1;
9
10        while (low <= high) {
11
12            int mid = (low + high) / 2;
13
14            int row = mid / n;
15            int col = mid % n;
16
17            if (matrix[row][col] == target) {
18                return true;
19            } else if (matrix[row][col] < target) {
20                low = mid + 1;
21            } else {
22                high = mid - 1;
23            }
24        }
25
26        return false;
27    }
28}