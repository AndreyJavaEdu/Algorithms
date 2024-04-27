package com.kamenskiy.io;

import java.util.HashSet;

/*
You are given a string word. A letter is called special if it appears both in lowercase and uppercase in word.

Return the number of special letters in word.



Example 1:

Input: word = "aaAbcBC"

Output: 3

Explanation:

The special characters in word are 'a', 'b', and 'c'.

Example 2:

Input: word = "abc"

Output: 0

Explanation:

No character in word appears in uppercase.

Example 3:

Input: word = "abBCab"

Output: 1

Explanation:

The only special character in word is 'b'.



Constraints:

1 <= word.length <= 50
word consists of only lowercase and uppercase English letters.
 */
public class HashSetEx1 {
    public static void main(String[] args) {
        String s = "aa";
        int i = numberOfSpecialChars(s);
        System.out.println(i);
    }

    public static int numberOfSpecialChars(String word) {
        int answer = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) set.add(word.charAt(i));
        }
        for (int i = 0; i < word.length(); i++) {
            if (set.contains((char) (word.charAt(i) - 32))) {
                set.remove((char)(word.charAt(i) - 32));
                answer++;
            }
        }
        return answer;
    }
}
