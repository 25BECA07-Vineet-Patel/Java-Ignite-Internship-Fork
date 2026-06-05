import java.util.Scanner;
import java.util.InputMismatchException;

public class atm_withdrawal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Account Balance: ");
            double balance = sc.nextDouble();

            System.out.print("Enter Withdrawal Amount: ");
            double withdrawal = sc.nextDouble();

            if (withdrawal < 0) {
                throw new IllegalArgumentException();
            }

            if (withdrawal > balance) {
                throw new ArithmeticException();
            }

            balance -= withdrawal;

            System.out.println("Transaction Successful");
            System.out.println("Remaining Balance = " + balance);
        } catch (ArithmeticException e) {
            System.out.println("Insufficient Balance");
        } catch (IllegalArgumentException e) {
            System.out.println("Withdrawal amount cannot be negative");
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            sc.close();
        }
    }
}