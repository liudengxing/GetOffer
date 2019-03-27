package com.star.getoffer.impl;

/**
 * 剑指OFFER 题3 找出数组中重复的数字
 *
 */
public class duplicate {

    public boolean duplicate(int[] nums, int length, int[] duplication) {
        if (nums == null || length <= 0) {
            return false;
        }

        for (int i = 0; i < length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    duplication[0] = nums[i];
                    return true;
                }
                swap(nums, nums[i], nums[nums[i]]);
            }
        }
        return false;
    }

    private void swap ( int[] num, int a, int b) {
        int swap = num[a];
        num[a] = num[b];
        num[b] = swap;
    }
}
