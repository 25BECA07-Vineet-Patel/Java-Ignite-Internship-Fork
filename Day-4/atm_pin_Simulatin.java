import java.util.Scanner;

public class atm_pin_Simulatin {
    public static void main(String args[]) {
        int pin, cpin = 8741;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the pin : ");
            pin = sc.nextInt();
            if (pin == cpin) {
                System.out.println("Correct pin :) ");
                break;
            }
            System.out.println("Pin wrong TRY AGAIN");
        }
        sc.close();
    }
}
