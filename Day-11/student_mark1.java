import java.util.Scanner;

// Custom Exception
class InvalidMarksException extends Exception {

    public InvalidMarksException(String message) {
        super(message);
    }
}

public class student_mark1 {

    // throws used in method signature
    static void validateMarks(int marks)
            throws InvalidMarksException {

        // throw used inside method
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException(
                    "Marks must be between 0 and 100.");
        }

        System.out.println("Valid Marks: " + marks);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();

            validateMarks(marks);

        } catch (InvalidMarksException e) {

            System.out.println(
                    "InvalidMarksException: " + e.getMessage());

        } finally {
            sc.close();
        }
    }
}