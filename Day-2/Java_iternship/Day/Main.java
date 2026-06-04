import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Creating Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Using operators
        int sum = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        double div = (double) num1 / num2;

        // Printing output using concatenation
        System.out.println("\n----- OUTPUT -----");

        System.out.println("Hello " + name);

        System.out.println("Addition = " + sum);
        System.out.println("Subtraction = " + sub);
        System.out.println("Multiplication = " + mul);

        System.out.printf("Division = %.2f\n", div);

        // Using only if statements
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        }

        if (num1 < num2) {
            System.out.println(num1 + " is smaller than " + num2);
        }

        if (num1 == num2) {
            System.out.println("Both numbers are equal");
        }

        // Closing scanner
        sc.close();
    }
}