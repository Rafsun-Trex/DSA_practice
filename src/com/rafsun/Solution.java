package com.rafsun;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer complement = m.get(nums[i]);
            if(complement != null)
            {
                return new int[] {i, complement};
            }
            m.put(target - nums[i], i);

        }
        return nums;
    }
}
