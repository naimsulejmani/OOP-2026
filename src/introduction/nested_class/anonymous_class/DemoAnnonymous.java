package introduction.nested_class.anonymous_class;

import java.math.BigDecimal;

public class DemoAnnonymous {
    private Order order = new Order() {
        @Override
        public BigDecimal getDiscount() {
            return BigDecimal.valueOf(0.75);
        }
    };

    static void main() {
        //anonymous class
        Order order = new Order() {
            @Override
            public BigDecimal getDiscount() {
                return BigDecimal.valueOf(0.75);
            }
        };


    }
}
