// Last updated: 09/07/2026, 09:10:03
class Solution {
    public int mostWordsFound(String[] sentences) {
            int max=0;
        for(int j=0;j<sentences.length;j++){
            String[] arr=sentences[j].split(" ");
            int count=0;
            for(int i=0;i<arr.length;i++){
                String word=arr[i];
                count++;
            }
            if(count>max){
                max=count;
            }
        }
        return max;
    }
}