package org.lab11.labwork6;


/**
 * Class StringContainer implements Container
 * and has field arr.
 */
public class StringContainer implements Container {
    /**
     * The Sorting.
     */
    Sorting sorting;
    private String[] arr;

    /**
     * Instantiates a new String container.
     *
     * @param arr the arr
     */
    public StringContainer(String[] arr) {
        this.arr = arr;
    }

    /**
     * Get arr string [ ].
     *
     * @return the string [ ]
     */
    public String[] getArr() {
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

    @Override
    public void executeSorting() {
        int[] lenLs = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            lenLs[i] = arr[i].length();
        }
        sorting.letsSort(lenLs);
        String[] temp = new String[arr.length];
        for (int i = 0; i < lenLs.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (lenLs[i] == arr[j].length()) {
                    temp[i] = arr[j];
                    arr[j] = "";
                    break;
                }
            }
        }
        arr = temp;
    }
}
