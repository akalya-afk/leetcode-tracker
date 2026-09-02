// Last updated: 02/09/2026, 09:39:22
class Solution {
    public int maxProduct(int n) {
        String t=Integer.toString(n);
        int arr[]=new int[t.length()];
        int max=0;
        for(int i=0;i<t.length();i++){
            arr[i]=t.charAt(i)-'0';
           
        }
        Arrays.sort(arr);
        int prod=arr[arr.length-1]*arr[arr.length-2];
        return prod;
    }
}