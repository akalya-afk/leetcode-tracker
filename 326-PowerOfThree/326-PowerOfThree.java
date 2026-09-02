// Last updated: 02/09/2026, 09:42:35
class Solution {
    public boolean isPowerOfThree(int n) {

        if (n <= 0) {
            return false;
        }

        while (n % 3 == 0) {
            n = n / 3;
        }

        return n == 1;
    }
}