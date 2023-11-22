package org.lab11.labwork6;

/**
 * Class insertSort implements interface Sorting.
 */
public class InsertSort implements Sorting {

    @Override
    public void letsSort(int[] arr) {
        System.out.println("Insertion sort:");
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int index = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > index) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = index;
        }

    }

}
