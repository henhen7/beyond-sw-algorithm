package e_sort;

import e_sort.practice.ArraySort;

import java.util.Arrays;

public class SortApplication {
    public static void main(String[] args) {
        int[] array = {3, 1, 5, 4, 9, 2};
        System.out.println(Arrays.toString(array));
        ArraySort.insertionSort(array);
        System.out.println(Arrays.toString(array));
        System.out.println();

        // 버블 정렬
        array = new int[] {3, 1, 5, 4, 9, 2};
        System.out.println(Arrays.toString(array));
        ArraySort.bubbleSort(array);
        System.out.println(Arrays.toString(array));
        System.out.println();

        // 병합 정렬
        array = new int[] {3, 1, 5, 4, 9, 2};
        System.out.println(Arrays.toString(array));
        ArraySort.mergeSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
        System.out.println();

        // 퀵 정렬
        array = new int[] {3, 1, 5, 2, 9, 4};
        System.out.println(Arrays.toString(array));
        ArraySort.quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
        System.out.println();

    }
}
