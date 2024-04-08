package com.kamenskiy.io;

import java.util.HashMap;
import java.util.Map;

/*
You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.

Return the number of consistent strings in the array words.

Example 1:

Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
Output: 2
Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
Example 2:

Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
Output: 7
Explanation: All strings are consistent.
 */
public class ExString4 {
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};
        System.out.println(countConsistentStrings(allowed, words));
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        int res = 0;
        outerloop:
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (!allowed.contains(String.valueOf(words[i].charAt(j)))) {
                    continue outerloop;
                }
            }
            res++;
        }
        return res;
    }


    /*
    Еще один способ -
    Сначала мы создаем функцию hashfun() для проверки того, соответствует ли слово разрешенному слову.
В hashfun() мы сохраняем слово в хэш-карте, поэтому у нас есть список вхождений каждой буквы. Теперь мы используем разрешенное слово для подсчета количества вхождений буквы.
Надо иметь в виду, что если слово согласовано, то сумма вхождений буквы в слово по разрешенным буквам равна длине слова.
     */

    public static int countConsistentStrings2(String allowed, String[] words){
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if(hashSum(words[i], allowed)){
                count++;
            }
        }
        return count;
    }

    public static boolean hashSum(String word, String allowed){
        Map<Character, Integer> hashMap = new HashMap<>();
        for(Character s: word.toCharArray()){
            hashMap.put(s, hashMap.getOrDefault(s, 0) + 1);
        }
        int sum = 0;
        for (Character d: allowed.toCharArray()){
            if (hashMap.containsKey(d)){
               sum+=hashMap.get(d);
            }
        }
        if (sum!= word.length()){
            return false;
        }
        return true;
    }

}


