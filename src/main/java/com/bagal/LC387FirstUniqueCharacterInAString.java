package com.bagal;

public class LC387FirstUniqueCharacterInAString {
    //first approach
    public static int firstUniqChar(String s) {
        int i=0;
        while(i < s.length()){
            char ch = s.charAt(i);
            if(s.indexOf(ch) == s.lastIndexOf(ch)){
                return i;
            }
            i++;
        }
        return -1;
    }
}
