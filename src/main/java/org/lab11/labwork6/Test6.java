package org.lab11.labwork6;

import java.util.Arrays;

/**
 * Class Test6 the Main class.
 */
public class Test6 {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] arr = {5, 12, 9, 3, 18, 7, 25, 11, 14, 20};
        int[] arr1 = {7, 19, 3, 12, 25, 8, 14, 30, 5, 17};
        String[] arr2 = {"apple", "banana", "tab", "chair", "elephant", "top", "ocean", "sunflower", "mountain", "bicycle"};
        String[] arr3 = {"Mountain", "Bicycle", "Sunshine", "Dragon", "Universe", "Jellyfish", "Harmony", "Telescope", "Adventure", "Chocolate"};
        IntegerContainer container = new IntegerContainer(arr);
        container.setSorting(new BubleSort());
        container.executeSorting();
        System.out.println(Arrays.toString(container.getArr()));

        IntegerContainer container1 = new IntegerContainer(arr1);
        container1.setSorting(new InsertSort());
        container1.executeSorting();
        System.out.println(Arrays.toString(container1.getArr()));

        StringContainer container2 = new StringContainer(arr2);
        container2.setSorting(new BubleSort());
        container2.executeSorting();
        System.out.println(Arrays.toString(container2.getArr()));

        StringContainer container3 = new StringContainer(arr3);
        container3.setSorting(new InsertSort());
        container3.executeSorting();
        System.out.println(Arrays.toString(container3.getArr()));
    }
}
