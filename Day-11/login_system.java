import java.util.Scanner;

// Custom Exception for Username
class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}

// Custom Exception for Password
class WeakPasswordException extends Exception {
    public WeakPasswordException(String message) {
        super(message);
    }
}

public class login_system {

    static void login(String username, String password)
            throws InvalidUsernameException, WeakPasswordException {

        if (username.trim().isEmpty()) {
            throw new InvalidUsernameException(
                    "Username cannot be empty.");
        }

        if (password.length() < 6) {
            throw new WeakPasswordException(
                    "Password must be at least 6 characters long.");
        }

        System.out.println("Login Successful!");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Username: ");
            String username = sc.nextLine();

            System.out.print("Enter Password: ");
            String password = sc.nextLine();

            login(username, password);

        } catch (InvalidUsernameException e) {
            System.out.println("Exception: " + e.getMessage());

        } catch (WeakPasswordException e) {
            System.out.println("Exception: " + e.getMessage());

        } finally {
            sc.close();
        }
    }
}