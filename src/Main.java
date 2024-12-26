import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create items
        Item item1 = new Item(1, "Laptop", 1200.50);
        Item item2 = new Item(2, "Mouse", 25.75);
        Item item3 = new Item(3, "Keyboard", 45.90);

        // Create customer
        Customer customer = new Customer(101, "Dulat Zhambyl", "dulat.zhambyl@gmail.com");

        // Create orders
        Order order1 = new Order(1001, customer, Arrays.asList(item1, item2));
        Order order2 = new Order(1002, customer, Arrays.asList(item3));

        // Output to console
        System.out.println(order1);
        System.out.println(order2);

        // Compare orders
        if (order1.calculateTotal() > order2.calculateTotal()) {
            System.out.println("Order 1 is more expensive.");
        } else {
            System.out.println("Order 2 is more expensive.");
        }
    }
}