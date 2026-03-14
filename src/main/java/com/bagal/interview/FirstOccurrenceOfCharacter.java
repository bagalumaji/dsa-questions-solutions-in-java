package com.bagal.interview;

import java.util.*;

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
    //second approach
    public static void printFirstOccurrenceOfCharacter2ndWay(String str){
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < str.length(); i++){
            if(set.add(str.charAt(i))){
                System.out.print(str.charAt(i)+" : "+i+" ");
            }
        }
    }
    //third approach
    public static void printFirstOccurrenceOfCharacter3rdWay(String str){
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            if(!map.containsKey(str.charAt(i))){
                System.out.print(str.charAt(i)+" : "+i+" ");
                map.put(str.charAt(i),1);
            }
        }
    }
}
