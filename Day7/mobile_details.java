class mobile {
    int stor;
    String brand;
    private double price;

    mobile(String brand, double price, int stor) {
        this.brand = brand;
        this.price = price;
        this.stor = stor;
    }

    void display() {
        System.out.println("Brand : " + brand);
        System.out.println("Price : " + price);
        System.out.println("Storage : " + stor);
    }
}

public class mobile_details {
    public void main(String args[]) {
        mobile m1 = new mobile("Samsung", 84000.0, 256);
        mobile m2 = new mobile("Oneplus", 43500.0, 256);
        m1.display();
        m2.display();
    }
}
