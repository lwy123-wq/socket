package test4;

public class Solution {
    public int lengthOfLastWord(String s) {
        //    String str=s.split(" ")[s.split(" ").length-1];
        //    int i;
        //    for(i=0;i<str.length();i++){
        //    }
        //    return i;
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            } else if (length != 0) {
                return length;
            }
        }
        return length;
    }
}