package com.kamenskiy.io;
/*
Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
 */
public class ExString2 {

    public static void main(String[] args) {
        String s = "  fly me   to   the moon  ";
//        System.out.println(lengthOfLastWord(s));
        System.out.println(lengthOfLastWord2(s));

    }

    public static int lengthOfLastWord(String s) {
        String trim = s.trim();
        int l = trim.length();
        for (int i = l-1; i >=0 ; i--) {
            if(trim.charAt(i) == ' '){
                return l - (i+1);
            }
        }
        return l;
    }

    public static int lengthOfLastWord2(String s) {
     String[] str = s.split(" ");
     String x = str[str.length-1];
     return x.length();
    }

}
