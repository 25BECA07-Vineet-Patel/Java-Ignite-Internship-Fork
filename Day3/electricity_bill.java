import java.util.Scanner;

public class electricity_bill {

    public static void main(String args[]) {
        int choice, units;
        double bill = 0;
        char pf;
        Scanner sc = new Scanner(System.in);
        System.out.println("----- Electricity Bill Generator -----");
        System.out.println("1. Domestic");
        System.out.println("2. Commercial");
        System.out.println("3. Industrial");

        System.out.print("Enter connection type: ");
        choice = sc.nextInt();

        if (choice == 1) {

            System.out.print("Enter units consumed: ");
            units = sc.nextInt();

            if (units <= 100) {
                bill = 0;
            }

            else if (units <= 300) {
                bill = (units - 100) * 5;
            }

            else {
                bill = (200 * 5) + ((units - 300) * 8);
            }

            System.out.println("Domestic Bill = ₹" + bill);
        }

        else if (choice == 2) {

            System.out.print("Enter units consumed: ");
            units = sc.nextInt();

            if (units < 200) {
                bill = units * 10;
            }

            else {
                bill = units * 15;
            }

            System.out.println("Commercial Bill = ₹" + bill);
        }

        else if (choice == 3) {

            System.out.print("Enter units consumed: ");
            units = sc.nextInt();

            System.out.print("Is power factor good? (Y/N): ");
            pf = sc.next().charAt(0);

            bill = units * 20;

            if (units > 500 && (pf == 'Y' || pf == 'y')) {

                bill = bill - (bill * 0.10);

                System.out.println("10% Discount Applied");
            }

            System.out.println("Industrial Bill = ₹" + bill);
        }

        else {

            System.out.println("Invalid Connection Type");
        }

        sc.close();
    }
}