import java.util.List;

class Order {
    private int orderId;
    private Customer customer;
    private List<Item> items;

    // Constructor
    public Order(int orderId, Customer customer, List<Item> items) {
        this.orderId = orderId;
        this.customer = customer;
        this.items = items;
    }

    // Getters
    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Item> getItems() {
        return items;
    }

    // Methods
    public double calculateTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder itemsStr = new StringBuilder();
        for (Item item : items) {
            itemsStr.append(item.toString()).append(", ");
        }
        return "Order[ID=" + orderId + ", Customer=" + customer.getName() + ", Items=[" + itemsStr + "], Total=" + calculateTotal() + "]";
    }
}
