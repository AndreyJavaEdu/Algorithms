package com.kamenskiy.io;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 3, 4};
        int index = findIndex(array, -1);
        System.out.println(index);


    }

    public static int findIndex(int[] array, int number) {
        int start = 0;
        int end = array.length - 1;
        int curInd;

        while (true) {
            curInd = (start + end) / 2;
            if (array[curInd] == number) {
                return curInd;
            } else if (start > end) {
                return start;
            } else {
                if (array[curInd] > number) {
                    end = curInd - 1;
                }else start = curInd + 1;
            }
        }
    }

}