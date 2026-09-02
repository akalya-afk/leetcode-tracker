// Last updated: 02/09/2026, 09:41:27
class Solution {
    public boolean judgeCircle(String moves) {
        int x=0;
        int y=0;
        for(int i=0;i<moves.length();i++){
            char c=moves.charAt(i);
            if(c=='U'){
                y++;
            }
            else if(c=='D'){
                y--;
            }
            else if(c=='L'){
                x--;
            }
            else {
                x++;
            }

        }
        if(x!=0 || y!=0){
            return false;
        }
        return true;
    }
}