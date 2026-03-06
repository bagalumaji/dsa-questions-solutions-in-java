package com.bagal;

import java.util.HashMap;

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
    //second approach
    public static int firstUniqCharSecondApproach(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
