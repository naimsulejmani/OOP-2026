package introduction.nested_class.anonymous_class;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ComperatorExampleDemo {
    static void main() {
        Product p1 = new Product(1, "A", "AAA", BigDecimal.TEN, LocalDate.now(), true, "Alfabet", 1000);
        Product p2 = new Product(2, "A", "BBB", BigDecimal.ONE, LocalDate.now().plusDays(10), true, "Shkronje", 333);
        Product p3 = new Product(3, "C", "CCC", BigDecimal.valueOf(30), LocalDate.now().minusMonths(1), false, "Test", 4122);

        List<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
//        products.add(null);

        Comparator<Product> sortByName = Comparator.comparing(Product::getName);
        Comparator<Product> sortByPrice = Comparator.comparing(Product::getPrice);

//        Collections.sort(products, sortByName.thenComparing(sortByPrice).reversed());


        Collections.sort(products, Comparator.nullsLast(sortByName.thenComparing(sortByPrice).reversed()));

        products.forEach(System.out::println);


        System.out.println("-------------------------------------");
        Predicate<Product> isActive = Product::isActive;
        Predicate<Product> isNotExpired = product -> product.getDueDate().isAfter(LocalDate.now());
        Predicate<Product> containsA = product -> product.getName().contains("A");

        products.removeIf(isActive.and(isNotExpired).negate());


        products.forEach(System.out::println);

    }
}
