package com.bagal;

import com.sun.source.tree.ArrayAccessTree;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static com.bagal.LC136SingleNumber.singleNumber2;

public class LC350IntersectionOfTwoArraysII {
    public static int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length){
            return intersect(nums2,nums1);
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
    // way 2
    public static int[] intersect2(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int size = Math.min(nums1.length,nums2.length);
        int [] res = new int[size];
        int i=0,j=0,k=0;
        while (i<nums1.length && j <nums2.length){
            if(nums1[i] == nums2[j]){
                res[k++] = nums1[i];
                i++;
                j++;
            }else if(nums1[i]<nums2[j]){
                i++;
            }else {
                j++;
            }
        }
        return Arrays.copyOfRange(res,0,k);
    }
}
