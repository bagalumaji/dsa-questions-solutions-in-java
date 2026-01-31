package com.bagal;

public class LC26RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int cnt=1;
        for (int i = 1; i <nums.length ; i++) {
            if(nums[i]!=nums[i-1]){
                nums[cnt] = nums[i];
                cnt++;
            }
        }
        return cnt;
    }
}
