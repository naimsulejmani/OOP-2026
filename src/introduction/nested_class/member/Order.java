package introduction.nested_class.member;

import java.util.HashSet;
import java.util.Set;

public class Order {

    public Set<Item> items = new HashSet<>();

    public void addItem(Product product, int quantity) {
        var item = new Item(product, quantity);
//        item.quantity=100; //po mundemi me ju qas varibalave private po edhe metodave
        items.add(item);
    }

    public void removeItem(Product product) {
        items.removeIf(item -> item.product.equals(product));
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
