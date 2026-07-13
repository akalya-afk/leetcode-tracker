// Last updated: 13/07/2026, 09:53:36
1class Solution {
2
3    public boolean isBoomerang(int[][] points) {
4
5        int x1 = points[0][0];
6        int y1 = points[0][1];
7
8        int x2 = points[1][0];
9        int y2 = points[1][1];
10
11        int x3 = points[2][0];
12        int y3 = points[2][1];
13
14        return (x2 - x1) * (y3 - y1) != (y2 - y1) * (x3 - x1);
15    }
16}