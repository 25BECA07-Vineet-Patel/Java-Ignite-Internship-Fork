import java.util.Scanner;

public class shopping_bil {
    public static void main(String args[]) {
        String name, product;
        int quan;
        double price, bill = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input name of customer : ");
        name = sc.nextLine();
        System.out.println("Input product name : ");
        product = sc.nextLine();
        System.out.println("Input product price : ");
        price = sc.nextDouble();
        System.out.println("Input quantity : ");
        quan = sc.nextInt();
        bill = price * quan;
        System.out.println("Output :");
        System.out.println("Name of customer : " + name);
        System.out.println("Product: " + product);
        System.out.println("Product price : " + price);
        System.out.println("Quantity of product : " + quan);
        System.out.println("Total Bill : " + bill);
        sc.close();
    }
}
