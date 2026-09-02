// Last updated: 02/09/2026, 09:40:36
class Solution {
    public String interpret(String command) {
        command=command.replace("()","o");
        command=command.replace("(al)","al");
        return command;
    }
}