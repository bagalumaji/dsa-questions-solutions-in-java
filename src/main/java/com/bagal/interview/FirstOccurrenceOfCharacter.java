package com.bagal.interview;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FirstOccurrenceOfCharacter {
    //first approach
    public static void printFirstOccurrenceOfCharacter(String str){
        Set<Character> set = new LinkedHashSet<>();
        for(int i = 0; i < str.length(); i++){
            set.add(str.charAt(i));
        }
        for(Character c : set){
            System.out.print(c+" : "+str.indexOf(c)+" ");
        }
    }
    public static void main(String[] args) {
        printFirstOccurrenceOfCharacter2ndWay("abcaddef");
    }
    //second approach
    public static void printFirstOccurrenceOfCharacter2ndWay(String str){
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < str.length(); i++){
            if(set.add(str.charAt(i))){
                System.out.print(str.charAt(i)+" : "+i+" ");
            }
        }
    }

}
