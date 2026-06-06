package introduction.stream_api;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;

public class ProductDemo {
    static void main() {
        Product p1 = new Product(1, "Laptop", 999.99);
        Product p2 = new Product(2, "Smartphone", 499.99);
        Product p3 = new Product(3, "Tablet", 299.99);
        Product p4 = new Product(4, "Monitor", 199.99);

        List<Product> products = List.of(p1, p2, p3, p4);

        DoubleSummaryStatistics stats = products.stream().mapToDouble(Product::getPrice).summaryStatistics();
        System.out.println("----------STAT-------------------------");
        System.out.println(stats);
        System.out.println("----------END STAT-------------------------");
        // pa lista eshte dasht me iteru me for, while, do..while edhe for-each
        List<Product> lessThan500Dollar = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() < 500) {
                lessThan500Dollar.add(product);
            }
        }

        List<Product> lessThan500DollarStream = products.stream()
                .filter(p -> p.getPrice() < 500).toList();

        products.stream()
                .filter(p -> p.getPrice() < 500)
                .filter(p -> p.getName().length() > 6)
                .forEach(System.out::println);
    }
}
