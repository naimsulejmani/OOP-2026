package introduction.stream_api;

import java.util.Map;

public class MapimiDemo {
    static void main() {

        Mapimi<String, Integer> stringLength = s -> s.length();
        Mapimi<String, Product> stringToProduct = s -> new Product((int) (Math.random() * 1_000_000_000), s, Math.random() * 1_000_000_000);

        Mapimi<Integer, Integer> katrori = i -> i * i;

        Product p = stringToProduct.apply("Laptop");
        ;
        Product p1 = stringToProduct.apply("Phone");

        System.out.println(p);
        System.out.println(p1);

        int x  = katrori.apply(5);
        System.out.println(x);
    }
}
