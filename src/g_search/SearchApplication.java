package g_search;

import java.util.Arrays;

import static g_search.practice.Search.*;

public class SearchApplication {
    public static void main(String[] args) {
        int[] numbers = {3, 1, 5, 4, 9, 2};
        System.out.println(Arrays.toString(numbers));
        System.out.println(linearSearch(numbers, 3));
        System.out.println(linearSearch("Hello", 'o'));
        System.out.println(minValue(numbers));
        System.out.println();

        numbers = new int[] {2, 3, 5, 9, 12, 15, 30};
        System.out.println(binarySearch(numbers, 30));
        System.out.println(binarySearch(numbers, 5, 0, numbers.length - 1));
        System.out.println();

    }

}
