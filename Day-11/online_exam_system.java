import java.util.Scanner;

// Custom Exception for marks > 100
class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

// Custom Exception for negative marks
class NegativeMarksException extends Exception {
    public NegativeMarksException(String message) {
        super(message);
    }
}

public class online_exam_system {

    static void validateMarks(int marks)
            throws InvalidMarksException, NegativeMarksException {

        if (marks < 0) {
            throw new NegativeMarksException(
                    "Negative marks are not allowed.");
        }

        if (marks > 100) {
            throw new InvalidMarksException(
                    "Marks cannot exceed 100.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Student ID: ");
            String studentId = sc.nextLine();

            // Nested try block
            try {

                if (studentId == null || studentId.trim().isEmpty()) {
                    throw new NullPointerException(
                            "Student ID cannot be null or empty.");
                }

                System.out.print("Enter Marks: ");
                int marks = sc.nextInt();

                validateMarks(marks);

                double percentage = marks;

                System.out.println("Student ID: " + studentId);
                System.out.println("Percentage: " + percentage + "%");

            } catch (NullPointerException e) {
                System.out.println("NullPointerException: "
                        + e.getMessage());
            }

        } catch (InvalidMarksException e) {
            System.out.println("InvalidMarksException: "
                    + e.getMessage());

        } catch (NegativeMarksException e) {
            System.out.println("NegativeMarksException: "
                    + e.getMessage());

        } catch (Exception e) {
            System.out.println("Invalid Input!");

        } finally {
            sc.close();
        }
    }
}