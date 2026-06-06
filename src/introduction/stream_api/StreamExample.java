package introduction.stream_api;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    static void main() {
        IntStream.generate(() -> (int) (Math.random() * 100)).takeWhile(x -> x < 50).forEach(System.out::println);

        Stream.of(new Product(1, "Laptop", 999.99),
                        new Product(2, "Smartphone", 499.99),
                        new Product(3, "Tablet", 299.99),
                        new Product(4, "Monitor", 199.99))
                .forEach(p -> p.setPrice(100));

        //cmimi mesatar i produckteve
        OptionalDouble averagePrice = Stream.of(new Product(1, "Laptop", 999.99),
                        new Product(2, "Smartphone", 499.99),
                        new Product(3, "Tablet", 299.99),
                        new Product(4, "Monitor", 199.99))
                .mapToDouble(Product::getPrice)
                .average();


        averagePrice.ifPresent(System.out::println);

        List<String> names = List.of("John", "Jane", "Jack", "Jill", "James");

        names.stream().mapToInt(String::length).average().ifPresent(System.out::println);

        List<Integer> namesLengths = names.stream().mapToInt(String::length).boxed().toList();

        System.out.println(namesLengths);

    }
}
