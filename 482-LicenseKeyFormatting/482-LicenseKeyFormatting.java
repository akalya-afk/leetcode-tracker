// Last updated: 02/09/2026, 09:41:53
class Solution {
    public String licenseKeyFormatting(String s, int k) {

        // Step 1: Remove all '-'
        s = s.replace("-", "");

        // Step 2: Convert everything to uppercase
        s = s.toUpperCase();

        // Step 3: Build the answer
        String ans = "";

        int count = 0;

        // Start from the last character
        for (int i = s.length() - 1; i >= 0; i--) {

            ans = s.charAt(i) + ans;

            count++;

            // Put '-' after k characters
            if (count%k == 0 && i != 0) {
                ans = "-" + ans;
               // count = 0;
            }
        }

        return ans;
    }
}