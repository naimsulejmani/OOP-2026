package introduction.nested_class.anonymous_class;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProductDemo {
    static void main() {
        Product p1 = new Product(1, "A", "AAA", BigDecimal.TEN, LocalDate.now(), true, "Alfabet", 1000);
        Product p2 = new Product(2, "B", "BBB", BigDecimal.ONE, LocalDate.now().plusDays(10), false, "Shkronje", 333);
        Product p3 = new Product(3, "C", "CCC", BigDecimal.valueOf(30), LocalDate.now().minusMonths(1), true, "Test", 4122);




        List<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        //grouping by active
        Map<Boolean, List<Product>> groupedByActive = products.stream().collect(Collectors.groupingBy(Product::isActive));
        System.out.println(groupedByActive);
//        System.out.println(p1.compareTo(p3));

        Comparator<Product> priceComparator = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice().compareTo(o2.getPrice());
            }
        };

        Comparator<Product> stockComparator = (o1, o2) -> Long.compare(o1.getStock(), o2.getStock());

        System.out.println(priceComparator.compare(p1, p3));
        System.out.println(stockComparator.compare(p3, p1));
//
//        Collections.sort(products, new Comparator<Product>() {
//            @Override
//            public int compare(Product o1, Product o2) {
//                return o1.getDueDate().compareTo(o2.getDueDate());
//            }
//        });


        Collections.sort(products, (o1, o2) -> o1.getDueDate().compareTo(o2.getDueDate()));
        Collections.sort(products, Comparator.comparing(Product::getDueDate));
//        System.out.println(products);
//
//        System.out.println(products);


//        products.removeIf(p -> !p.isActive());
        products.removeIf(p -> TextFilter.removeA(p.getName()));


        List<String> names = new ArrayList<>();
        names.add("A");
        names.add("B");
        names.add("C");


        names.removeIf(TextFilter::removeA); // direct method addressing

        System.out.println(products);

    }
}
