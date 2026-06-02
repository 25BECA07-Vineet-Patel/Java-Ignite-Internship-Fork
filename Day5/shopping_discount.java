import java.util.Scanner;

public class shopping_discount {
    double discount(double bill) {
        bill = bill - bill * 0.1;
        return bill;
    }

    public static void main(String args[]) {
        double bill, fbill = 0.0;
        shopping_discount obj = new shopping_discount();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter bill amount : ");
        bill = sc.nextDouble();
        fbill = obj.discount(bill);
        System.out.println("Discounted bill : " + fbill);
        sc.close();
    }
}
