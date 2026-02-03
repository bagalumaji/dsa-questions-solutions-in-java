package com.bagal;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LC217ContainsDuplicateInArray {
    //brute force way
    public static boolean containsDuplicateBruteForceApproach(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    //sorting way
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]){
                return true;
            }
        }
        return false;
    }

    //using hashset
    public static boolean containsDuplicateHashSet(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if(!set.add(nums[i])){
                return true;
            }
        }
        return false;
    }

}
