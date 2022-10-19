package org.yottalabs;

import java.util.Arrays;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] out = new int[0];
        int y = 0;
        while (out.length <= 1) {
            for (int i = 0; i + 1 + y < nums.length; i++) {
                if (target == nums[i] + nums[i + 1 + y]) {
                    out = new int[]{i, i + 1 + y};
                    break;
                }
            }
            y++;
        }
        return out;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 3, 1, 5};
        int target = 8;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

}