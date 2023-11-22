package org.lab11.labwork6;

/**
 * Class IntegerContainer implements interface Container
 * and has field arr.
 */
public class IntegerContainer implements Container{
    /**
     * The Sorting.
     */
    Sorting sorting;
    private int[] arr;

    /**
     * Instantiates a new Integer container.
     *
     * @param arr the arr
     */
    public IntegerContainer(int[] arr) {
        this.arr = arr;
    }

    /**
     * Get arr int [ ].
     *
     * @return the int [ ]
     */
    public int[] getArr() {
        return arr;
    }

    /**
     * Sets sorting.
     *
     * @param sorting the sorting
     */
    public void setSorting(Sorting sorting) {
        this.sorting = sorting;
    }
    public void executeSorting(){
        sorting.letsSort(arr);
    }
}
