package com.bagal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC350IntersectionOfTwoArraysII {
    public static int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length){
            intersect(nums2,nums1);
        }
        int [] res  = new int[nums1.length];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : nums1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int k=0;
        for (int i : nums2){
            if(map.containsKey(i) && map.get(i)!=0){
                res[k++] = i;
                map.put(i,map.get(i)-1);
            }
        }
        return Arrays.copyOfRange(res,0,k);
    }
}
