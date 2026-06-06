package introduction.stream_api;

import java.math.BigDecimal;
import java.util.function.*;

public class ExampleOfFunctions {
    static void main() {
        Predicate<String> isBlank = String::isBlank;

        Function<String, Integer> length = String::length;


        Function<Product, String> getName = p -> p.toString();

        String tt = getName.apply(new Product(1, "Laptop", 999.99));
        System.out.println(tt);
        // DTO -> ENTITY ose prej ENTITY -> DTO

        UnaryOperator<String> reverse = s -> new StringBuilder(s).reverse().toString();
        String reversed = reverse.apply("Hello");
        System.out.println(reversed);

        UnaryOperator<Product> updatePrice = product -> {
            product.setPrice(product.getPrice() * 0.9); // 10% zbritje
            return product;
        };

        Consumer<String> print = System.out::println;
        print.accept("Hello");

        Consumer<Product> printProduct = System.out::println;
        printProduct.accept(new Product(1, "Laptop", 999.99));

        Supplier<Product> createProduct = () -> new Product(
                (int) (Math.random() * 1_000_000_000),
                "Product-" + (int) (Math.random() * 1_000_000_000),
                Math.random() * 1_000_000_000

        );

        Product p = createProduct.get();
        Function<Product, BigDecimal> getPrice = prod -> BigDecimal.valueOf(p.getPrice());

        System.out.println(p);
        BigDecimal price = getPrice.apply(p);
        System.out.println(price);


    }
}
