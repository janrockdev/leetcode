package org.yottalabs.runningSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static Integer[] runningSum(int[] nums) {
        List<Integer> out = new ArrayList<>();
        int prev = 0;
        for (int num : nums) {
            out.add(num + prev);
            prev = num + prev;
        }
        Integer[] arr = new Integer[out.size()];
        return out.toArray(arr);
    }

    public static void main(String[] args) {
        int[] nums = {3,1,2,10,1};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
}
