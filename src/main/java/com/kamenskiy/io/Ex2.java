package com.kamenskiy.io;

public class Ex2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 2, 1};

        removeDuplicates(nums);
        int k = removeElement(nums, 1);
        System.out.println(k);
//        System.out.println(sum(nums));

    }

    public static int sum(int[] array) {
        int pointer = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                array[pointer] = array[i];
                pointer++;
            }
        }
        return pointer;
    }

    public static int removeDuplicates(int[] nums) {
        int pointer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[pointer]) {
                continue;
            }
            pointer++;
            nums[pointer] = nums[i];
        }
        return ++pointer;
    }


    public static int removeElement(int[] nums, int val) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[counter] = nums[i];
                counter++;
            }
        }
        return counter;
    }

}
