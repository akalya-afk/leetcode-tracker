// Last updated: 16/07/2026, 18:05:43
1import java.math.BigInteger;
2
3class Solution {
4    public String multiply(String num1, String num2) {
5        BigInteger a = new BigInteger(num1);
6        BigInteger b = new BigInteger(num2);
7
8        return a.multiply(b).toString();
9    }
10}