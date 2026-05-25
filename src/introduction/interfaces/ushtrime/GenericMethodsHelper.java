package introduction.interfaces.ushtrime;

public class GenericMethodsHelper {
    static void main() {
        int i = getMiddle(1, 2, 3);
        System.out.println(i);
        double d = getMiddle(1.5, 2.5, 3.5, 3D);
        System.out.println(d);
        String s = getMiddle("Hello", "World");
        System.out.println(s);

        print("Naim", "Sulejmani");
        print("Naim", 1);
        print(1, "Naim");

        Integer max = max(new Integer[]{99, 1100, 12, 312});
        System.out.println(max);

        String maxString = max(new String[]{"Naim", "Sulejmani", "Hello", "World"});
        System.out.println(maxString);

        Double maxDouble = max(new Double[]{1.1, 2.2, 3.3, 4.4});
        System.out.println(maxDouble);



    }

    public static <T extends Comparable<T>> T max(T[] array) {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public static <T, U> void print(T first, U second) {
        System.out.println(first + " -> " + second);


    }


    public static <T> void print(T... elements) {
        for (T element : elements) {
            System.out.println(element);
        }
    }

    public static <T> T getMiddle(T... elements) {
        if (elements.length == 0) {
            return null;
        }
        return elements[elements.length / 2];
    }
}
