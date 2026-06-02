class Order {

    int orderId;
    String customerName;
    String productName;
    int quantity;
    private double pricePerItem;

    Order(int orderId, String customerName, String productName,
            int quantity, double pricePerItem) {

        this.orderId = orderId;
        this.customerName = customerName;
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    double calculateTotal() {
        return quantity * pricePerItem;
    }

    double applyDiscount() {

        double total = calculateTotal();

        if (total > 10000) {
            return total - (total * 0.20);
        } else if (total > 5000) {
            return total - (total * 0.10);
        } else {
            return total;
        }
    }

    void display() {
        System.out.println("Order ID      : " + orderId);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Product Name  : " + productName);
        System.out.println("Quantity      : " + quantity);

        System.out.println("Total Amount  : Rs" + calculateTotal());
        System.out.println("Final Amount  : Rs" + applyDiscount());
    }
}

public class e_commerce {
    public static void main(String[] args) {

        Order o1 = new Order(
                101,
                "Vineet",
                "Laptop",
                2,
                6000);

        o1.display();
    }
}