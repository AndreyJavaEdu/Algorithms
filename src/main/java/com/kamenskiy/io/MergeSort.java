package com.kamenskiy.io;

public class MergeSort {
    public static void main(String[] args) {
        int[] arrayA = {1, 2, 4, 14, 19, 22};
        int[] arrayB = {7, 33, 55, 100};
        int[] arrayC = new int[10];

        merge(arrayA, 6, arrayB, 4, arrayC);
        display(arrayC, 10);


    }

    private static void display(int[] arrayC, int sizeC) {
        for (int i = 0; i < arrayC.length; i++) {
            System.out.print(arrayC[i] + " ");

        }
    }

    private static void merge(int[] arrayA, int sizeA, int[] arrayB, int sizeB, int[] arrayC) {
        int indexA = 0, indexB = 0, indexC = 0;
        while (indexA < sizeA && indexB < sizeB) {
            if (arrayA[indexA] < arrayB[indexB]) arrayC[indexC++] = arrayA[indexA++];
            else arrayC[indexC++] = arrayB[indexB++];
        }
        while (indexA < sizeA) { //когда массив arrayB оказался уже пуст после первого while, т.е. все элементы из arrayB скопированы в arrayC
            arrayC[indexC++] = arrayA[indexA++];
        }
        while (indexB < sizeB) { //когда массив arrayA оказался уже пуст после первого while, т.е. все элементы из arrayA скопированы в arrayC
            arrayC[indexC++] = arrayB[indexB++];
        }
    }

    private void recMergeSort(long[] array, int lowerInd, int upperInd) {
        if (lowerInd == upperInd) { //если один элемент то сортировка не требуется
            return;
        } else {
            int mid = (lowerInd + upperInd) / 2; // поиск середины
            recMergeSort(array, lowerInd, mid);
            recMergeSort(array, mid+1, upperInd);
//            merge2(array, lowerInd, mid+1, upperInd);
        }
    }
}
