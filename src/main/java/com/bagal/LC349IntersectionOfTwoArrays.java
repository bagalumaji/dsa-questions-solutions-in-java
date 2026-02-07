package com.bagal;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LC349IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num:nums1){
            set1.add(num);
        }
        for (int num:nums2){
            set2.add(num);
        }
        int size = Math.min(set1.size(), set2.size());
        int []result = new int[size];
        int k=0;
        for (int num:set1){
            if(set2.contains(num)){
                result[k]=num;
                k++;
            }
        }
        return Arrays.copyOfRange(result,0,k);
    }
}
