import java.util.Scanner;

public class ATM_info {
    public static void main() {
        String name;
        double bal, wih, rem;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account holder name : ");
        name = sc.nextLine();
        System.out.println("Enter balance of account : ");
        bal = sc.nextDouble();
        System.out.println("Enter withdrawal account : ");
        wih = sc.nextDouble();
        rem = bal - wih;
        System.out.println("Account holder name : " + name);
        System.out.println("Remaining Balance : " + rem);
        if (bal > wih)
            System.out.println("Balance is greater than withdrawal amount ");
        else
            System.out.println(
                    "Withdraal amount is greater than balance amount ,remaining balance might come negative number ");
        sc.close();
    }
}