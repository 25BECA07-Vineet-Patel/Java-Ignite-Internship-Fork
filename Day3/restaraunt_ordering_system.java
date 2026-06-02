import java.util.Scanner;

public class restaraunt_ordering_system {

    public static void main(String args[]) {

        int ch1, stat;
        int ch;
        double bill = 0.0;

        Scanner sc = new Scanner(System.in);

        System.out.println("1-Gold");
        System.out.println("2-Silver");
        System.out.println("3-Normal");

        System.out.println("Enter your member status ");
        stat = sc.nextInt();

        System.out.println("1-Veg");
        System.out.println("2-Non Veg");

        System.out.println("Enter your choice ");
        ch = sc.nextInt();

        switch (ch) {

            case 1:

                System.out.println("Veg Menu");
                System.out.println("1-Fried rice - Rs-150");
                System.out.println("2-Noodles - Rs-80");

                System.out.println("Enter your choice :");
                ch1 = sc.nextInt();

                switch (ch1) {

                    case 1:
                        bill = bill + 150;
                        break;

                    case 2:
                        bill = bill + 80;
                        break;

                    default:
                        System.out.println("Invalid selection");
                }

                break;

            case 2:

                System.out.println("Non-Veg Menu");
                System.out.println("1-Chicken Biryani - Rs-300");
                System.out.println("2-Grill Chicken - Rs-200");

                System.out.println("Enter your choice :");
                ch1 = sc.nextInt();

                switch (ch1) {

                    case 1:
                        bill = bill + 300;
                        break;

                    case 2:
                        bill = bill + 200;
                        break;

                    default:
                        System.out.println("Invalid selection");
                }
                break;
            default:
                System.out.println("Invalid selection");
        }
        if (bill > 2000)
            System.out.println("Free Dessert from restaurant side :)");
        if (stat == 1)
            bill = bill - (bill * 0.2);

        else if (stat == 2)
            bill = bill - (bill * 0.1);

        System.out.println("Bill amount payable : " + bill);
        sc.close();
    }
}