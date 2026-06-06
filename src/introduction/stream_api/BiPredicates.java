package introduction.stream_api;

import java.util.function.BiPredicate;

public class BiPredicates {
    static void main() {

        BiPredicate<Konsumatori, Product> isProductForConsumer = (c, p) -> p.getName().equals(c.getName());

    }
}
