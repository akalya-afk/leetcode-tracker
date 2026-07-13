// Last updated: 13/07/2026, 09:54:39
1class Solution {
2
3    public boolean checkStraightLine(int[][] coordinates) {
4
5        int x1 = coordinates[0][0];
6        int y1 = coordinates[0][1];
7
8        int x2 = coordinates[1][0];
9        int y2 = coordinates[1][1];
10
11        for (int i = 2; i < coordinates.length; i++) {
12
13            int x = coordinates[i][0];
14            int y = coordinates[i][1];
15
16            if ((y2 - y1) * (x - x1) != (y - y1) * (x2 - x1)) {
17                return false;
18            }
19        }
20
21        return true;
22    }
23}