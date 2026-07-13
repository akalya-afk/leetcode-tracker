// Last updated: 13/07/2026, 10:00:11
1class Solution {
2
3    public int countOperations(int num1, int num2) {
4
5        int count = 0;
6
7        while (num1 != 0 && num2 != 0) {
8
9            if (num1 >= num2) {
10                num1 = num1 - num2;
11            } else {
12                num2 = num2 - num1;
13            }
14
15            count++;
16        }
17
18        return count;
19    }
20}