package com.kamenskiy.io;

import java.util.Arrays;

/*
Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
 */
public class ExString {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String answear = longestCommonPrefix(strs);
        System.out.println(answear);

    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder(); //создали стрингбилдер
        Arrays.sort(strs); //отсортировали в лексикографическом массив строк
        String first = strs[0]; //первая строка - первый элемент массива
        String last = strs[strs.length-1]; // последняя строка - последний элемент массива
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)){
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }
}
