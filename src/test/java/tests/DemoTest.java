package tests;

import com.bagal.LC26RemoveDuplicatesFromSortedArray;

public class DemoTest {
    public static void main(String[] args) {
//        int [] arr = {0,0,1,1,1,2,2,3,3,4};
        int [] arr = {1,1,2};
        LC26RemoveDuplicatesFromSortedArray d = new LC26RemoveDuplicatesFromSortedArray();
        int cnt = d.removeDuplicates(arr);
        for (int i = 0; i < cnt; i++) {
            System.out.println(arr[i]);
        }
    }
}
