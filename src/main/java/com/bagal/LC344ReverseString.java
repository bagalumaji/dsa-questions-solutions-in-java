package com.bagal;

public class LC344ReverseString {
    public static void reverseString(char[] s) {
        int start=0,end=s.length-1;
        while (start<end){
            char t = s[start];
            s[start] = s[end];
            s[end] = t;
            start++;
            end--;
        }
        for (char ch : s){
            System.out.print(ch);
        }
    }
}
