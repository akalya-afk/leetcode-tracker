// Last updated: 13/07/2026, 09:51:04
1class Solution {
2
3    public double largestTriangleArea(int[][] points) {
4
5        double maxArea = 0;
6
7        int n = points.length;
8
9        for (int i = 0; i < n; i++) {
10
11            for (int j = i + 1; j < n; j++) {
12
13                for (int k = j + 1; k < n; k++) {
14
15                    double area = area(points[i], points[j], points[k]);
16
17                    maxArea = Math.max(maxArea, area);
18                }
19            }
20        }
21
22        return maxArea;
23    }
24
25    public double area(int[] a, int[] b, int[] c) {
26
27        return Math.abs(
28                a[0] * (b[1] - c[1]) +
29                b[0] * (c[1] - a[1]) +
30                c[0] * (a[1] - b[1])
31        ) / 2.0;
32    }
33}