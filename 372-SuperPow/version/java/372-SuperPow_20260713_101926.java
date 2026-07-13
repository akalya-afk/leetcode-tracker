// Last updated: 13/07/2026, 10:19:26
1class Solution {
2    public double[] convertTemperature(double celsius) {
3        double temp[]=new double[2];
4        
5        temp[0]=celsius+273.15;
6        temp[1]=celsius*1.80+32.00;
7        return temp;
8    }
9
10}