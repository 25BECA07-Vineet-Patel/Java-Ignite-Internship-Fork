import java.util.Scanner;
import java.util.InputMismatchException;

public class banking_system {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter account balance: ");
            double balance = sc.nextDouble();

            System.out.print("Enter withdrawal amount: ");
            double withdrawal = sc.nextDouble();

            if (withdrawal > balance) {
                throw new ArithmeticException("Insufficient balance");
            }

            balance -= withdrawal;

            System.out.println("Withdrawal successful");
            System.out.println("Remaining Balance = " + balance);
        } catch (ArithmeticException e) {
            System.out.println("Insufficient balance");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        }

        finally {
            sc.close();
        }
    }
}