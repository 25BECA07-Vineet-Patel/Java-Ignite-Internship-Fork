import java.util.Scanner;
import java.util.InputMismatchException;

public class student_mark {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];

        System.out.println("Enter 5 student marks:");

        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }

        try {
            System.out.print("Enter index (0-4): ");
            int index = sc.nextInt();

            System.out.println("Mark = " + marks[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index!");
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input!");
        }

        sc.close();
    }
}