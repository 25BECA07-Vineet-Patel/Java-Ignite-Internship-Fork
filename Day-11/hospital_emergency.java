import java.util.Scanner;

// Custom Exception for Invalid Age
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Custom Exception for Invalid Priority
class InvalidPriorityException extends Exception {
    public InvalidPriorityException(String message) {
        super(message);
    }
}

public class hospital_emergency {

    static void assignPriority(String name, int age, int emergencyLevel)
            throws InvalidAgeException, InvalidPriorityException {

        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Invalid Age! Age must be between 0 and 120.");
        }

        if (emergencyLevel < 1 || emergencyLevel > 5) {
            throw new InvalidPriorityException(
                    "Invalid Emergency Level! Must be between 1 and 5.");
        }

        System.out.println("\nPatient Name: " + name);

        switch (emergencyLevel) {
            case 5:
                System.out.println("Priority Level Assigned: CRITICAL");
                break;

            case 4:
                System.out.println("Priority Level Assigned: HIGH");
                break;

            case 3:
                System.out.println("Priority Level Assigned: MEDIUM");
                break;

            case 2:
                System.out.println("Priority Level Assigned: LOW");
                break;

            case 1:
                System.out.println("Priority Level Assigned: VERY LOW");
                break;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Patient Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            System.out.print("Enter Emergency Level (1-5): ");
            int emergencyLevel = sc.nextInt();

            assignPriority(name, age, emergencyLevel);

        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());

        } catch (InvalidPriorityException e) {
            System.out.println("Exception: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Invalid Input!");
        }

        sc.close();
    }
}