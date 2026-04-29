package introduction.arraylist_collection;

import java.util.Arrays;

public class ExampleOfArray {
    static void main() {
        int[] numbers = {5, 1, 9, 6};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int found = Arrays.binarySearch(numbers, 61);
        System.out.println(found);

    }
}
