// Last updated: 02/09/2026, 09:39:45
class Solution {
    public int alternateDigitSum(int n) {

        String t = String.valueOf(n);
        int sum = 0;

        for (int i = 0; i < t.length(); i++) {

            int digit = t.charAt(i) - '0';

            if (i % 2 == 0) {
                sum += digit;   // + for even index
            } else {
                sum -= digit;   // - for odd index
            }
        }

        return sum;
    }
}