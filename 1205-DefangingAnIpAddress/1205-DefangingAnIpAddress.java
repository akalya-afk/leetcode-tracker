// Last updated: 02/09/2026, 09:41:03
class Solution {
    public String defangIPaddr(String address) {
        address=address.replace(".","[.]");
        return address;
    }
}