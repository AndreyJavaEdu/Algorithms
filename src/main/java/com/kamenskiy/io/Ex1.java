package com.kamenskiy.io;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class Ex1 {
    public static void main(String[] args) {
        int[] nums = {2, 1, 4, 11, 22, 7};
        int target = 11;
        int[] twoSum = twoSum(nums, target);
        int[] sum = sum(nums, 15);
//        System.out.println(Arrays.toString(twoSum));
        System.out.println(Arrays.toString(sum));
    }

    public static int[] twoSum(int[] nums, int target) {
        int index_one = 0;
        int index_two = 0;
        for (int i = 0; i < nums.length; i++) {
            int sec_el = target - nums[i];
            index_one = i;
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] == sec_el) {
                    index_two = j;
                    int[] twoSum = {index_one, index_two};
                    return twoSum;
                }
            }
        }
        return null;
    }

    public static int[] sum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < n; i++) {
            if (map.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}