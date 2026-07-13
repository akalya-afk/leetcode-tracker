// Last updated: 13/07/2026, 09:46:36
1class Solution {
2
3    public boolean isPerfectSquare(int num) {
4
5        long left = 1;
6        long right = num;
7
8        while (left <= right) {
9
10            long mid = left + (right - left) / 2;
11            long square = mid * mid;
12
13            if (square == num)
14                return true;
15
16            if (square < num)
17                left = mid + 1;
18            else
19                right = mid - 1;
20        }
21
22        return false;
23    }
24}