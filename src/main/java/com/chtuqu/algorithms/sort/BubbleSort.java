package com.chtuqu.algorithms.sort;

public class BubbleSort {

    public static void sort(int[] array) {
        boolean switched;

        do {
            switched = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;

                    switched = true;
                }
            }
        } while(switched);
    }

}
