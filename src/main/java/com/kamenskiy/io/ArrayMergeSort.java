package com.kamenskiy.io;

public class ArrayMergeSort {
    private long[] theArray; // ссылка на массив
    private int nElems; // количество элементов в массиве

    public ArrayMergeSort(int max) {
        theArray = new long[max];
        nElems = 0;
    }

    /*
    Занесение элемента в массив
     */
    public void insert(long value) {
        theArray[nElems] = value;
        nElems++;
    }

    /*
    Вывод содержимого массива
     */
    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(theArray[i] + " ");
        }
        System.out.println();
    }

    /*
    Метод вызывается из main.
     */
    public void mergeSort() {
        long[] array = new long[nElems];
        reMergeSort(array, 0, nElems - 1);
    }

    private void reMergeSort(long[] array, int lowerInd, int upperInd) {
        if (lowerInd == upperInd) return;
        else {
            int mid = (lowerInd + upperInd) / 2;
            System.out.println("Получили подмассив: " + lowerInd + "-" + mid);
            reMergeSort(array, lowerInd, mid);
            reMergeSort(array, mid + 1, upperInd);
            System.out.println("Слияние");
            merge(array, lowerInd, mid + 1, upperInd);
        }
    }

    private void merge(long[] array, int lowPointer, int highPointer, int upperInd) {
//        System.out.println("Слияние: " + lowPointer + "-" +highPointer);
        int j = 0; //Индекс в рабочей области
        int lowInd = lowPointer;
        int mid = highPointer - 1;
        int n = upperInd - lowInd + 1; // Количество элементов

        while (lowPointer <= mid && highPointer <= upperInd) {
            if (theArray[lowPointer] < theArray[highPointer])
                array[j++] = theArray[lowPointer++];
            else
                array[j++] = theArray[highPointer++];
        }
        while (lowPointer <= mid) array[j++] = theArray[lowPointer++];
        while (highPointer <= upperInd) array[j++] = theArray[highPointer++];
        for (j = 0; j < n; j++) {
            theArray[lowInd + j] = array[j];
        }
    }
}

class MergeSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
        ArrayMergeSort arr = new ArrayMergeSort(100);
        arr.insert(64);
        arr.insert(21);
        arr.insert(33);
        arr.insert(70);
        arr.insert(31);
        arr.insert(22);
        arr.display();
        arr.mergeSort();
        arr.display();
    }
}
