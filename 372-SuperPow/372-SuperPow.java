// Last updated: 02/09/2026, 09:42:17
class Solution {

    int MOD = 1337;

    public int superPow(int a, int[] b) {

        int result = 1;

        for (int digit : b) {
            result = pow(result, 10) * pow(a, digit) % MOD;
        }

        return result;
    }

    public int pow(int a, int b) {

        a %= MOD;
        int result = 1;

        for (int i = 0; i < b; i++) {
            result = (result * a) % MOD;
        }

        return result;
    }
}