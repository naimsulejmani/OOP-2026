package introduction.nested_class.local_class;

import introduction.nested_class.member.Product;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Order {

    private Map<Product, Integer> items = new HashMap();

    public void manageTax(final String saleLocation) {
        class OrderTaxManager {
            private BigDecimal findRate(Product product) {
                return BigDecimal.ZERO;
            }

            BigDecimal calculateTax() {
                return items.entrySet().stream()
                        .map(entry -> findRate(entry.getKey()).multiply(BigDecimal.valueOf(entry.getValue())))
                        .reduce(BigDecimal.ZERO, BigDecimal::add);
            }
        }
        OrderTaxManager orderTaxManager = new OrderTaxManager();
        orderTaxManager.calculateTax();
    }


    class Item {
        private Product product;
        private int quantity;

        public Item(Product product, int quantity) {
            this.product = product;
            this.quantity = quantity;
        }

    }
}
