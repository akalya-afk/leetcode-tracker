// Last updated: 13/07/2026, 09:49:31
1class Solution {
2
3    public int[] constructRectangle(int area) {
4
5        int w = (int)Math.sqrt(area);
6
7        while (area % w != 0) {
8            w--;
9        }
10
11        int l = area / w;
12
13        return new int[]{l, w};
14    }
15}