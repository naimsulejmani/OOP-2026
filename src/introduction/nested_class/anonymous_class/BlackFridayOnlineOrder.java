package introduction.nested_class.anonymous_class;

import java.math.BigDecimal;

public class BlackFridayOnlineOrder extends Order {
    @Override
    public BigDecimal getDiscount() {
        return new BigDecimal("0.5");
    }
}
