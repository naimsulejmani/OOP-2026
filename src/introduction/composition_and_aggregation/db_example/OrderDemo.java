package introduction.composition_and_aggregation.db_example;

import java.time.LocalDate;
import java.util.List;

public class OrderDemo {
    static void main() {
        Category catBook = new Category(1, "Books", null, null);
        Category catFurniture = new Category(2, "Furniture", null, null);
        //INSERT INTO ....

        Supplier supplier = new Supplier(1, "Supplier 1");


        Product p1 = new Product(1, "Book 1", 10, 100.0, 100, 0, 10, false, catBook, supplier);
        Product p2 = new Product(2, "Book 2", 10, 150.0, 100, 0, 10, false, catBook, supplier);
        catBook.setProducts(List.of(p1, p2));
        Product p3 = new Product(3, "Furniture 1", 10, 200.0, 100, 0, 10, false, catFurniture, supplier);
        Product p4 = new Product(4, "Furniture 2", 10, 250.0, 100, 0, 10, false, catFurniture, supplier);
        catFurniture.setProducts(List.of(p3, p4));

        supplier.setProducts(List.of(p1, p2, p3, p4));


        Employee employee = new Employee(1, "John", "Doe", LocalDate.now(), LocalDate.now(), "Manager", null);
        Shipper shipper = new Shipper(1, "Shipper 1", "1234567890");
        Customer customer = new Customer(1, "Cacttus Education");

        Order order = new Order(1, LocalDate.now(), LocalDate.now(), LocalDate.now(), "Pending", customer, shipper, employee);
        OrderDetail detail1 = new OrderDetail(1, p1, order, 10, 100, 0.10);
        OrderDetail detail2 = new OrderDetail(2, p2, order, 5, 150, 0.10);
        OrderDetail detail3 = new OrderDetail(3, p3, order, 10, 200, 0.10);
        OrderDetail detail4 = new OrderDetail(4, p4, order, 5, 250, 0.10);


        order.setOrderDetails(List.of(detail1, detail2, detail3, detail4));

        employee.setOrders(List.of(order));
        shipper.setOrders(List.of(order));
        customer.setOrders(List.of(order));

//        System.out.println(order);
        order.print();


    }
}
