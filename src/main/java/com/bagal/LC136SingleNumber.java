package com.bagal;

import java.util.HashMap;
import java.util.Map;

public class LC136SingleNumber {
    /// 1st approach
    public static int singleNumber1(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int result = nums[0];
        for (int num:nums){
            if(map.get(num)==1){
                result = num;
            }
        }
        return result;
    }

    //2nd approach
    public static int singleNumber2(int[] nums) {
        int result = 0;
        for (int num:nums){
            result = result ^ num;
        }
        return result;
    }
}
