// Last updated: 02/09/2026, 09:42:31
class Solution {
    public boolean isPowerOfFour(int n) {

        if (n <= 0)
            return false;

        while (n % 4 == 0) {
            n = n / 4;
        }

        return n == 1;
    }
}