package com.kamenskiy.io;
/*
Example 1:

Input: command = "G()(al)"
Output: "Goal"
Explanation: The Goal Parser interprets the command as follows:
G -> G
() -> o
(al) -> al
The final concatenated result is "Goal".
Example 2:

Input: command = "G()()()()(al)"
Output: "Gooooal"
 */
public class ExString3 {

    public static void main(String[] args) {
        String command = "G()(al)";
        System.out.println(interpret(command));


    }

    public static String interpret(String command) {
        String interpret = "";

        for (int i = 0; i < command.length(); i++) {

            if (command.charAt(i)=='G'){
                interpret+="G";
            } else if (command.charAt(i)=='(' && command.charAt(i+1)==')') {
                interpret+="o";
            } else if (command.charAt(i)=='(' && command.charAt(i+1)=='a') {
                interpret+="al";
            }
        }
        return interpret;

    }
}

