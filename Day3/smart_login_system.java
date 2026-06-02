import java.util.Scanner;

public class smart_login_system {
    public static void main(String args[]) {
        String usern, pwd;
        int otp, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username : ");
        usern = sc.nextLine();
        for (i = 1; i <= 3; i++) {
            System.out.println("Attempt-" + i);
            System.out.println("Enter password : ");
            pwd = sc.nextLine();
            if ((usern.equals("admin") && pwd.equals("Java@123"))) {
                System.out.println("Username and password is corrcet ");
                System.out.println("Enter OTP");
                otp = sc.nextInt();
                if (otp >= 1000 && otp <= 9999)
                    System.out.println("Login Success ");
                else
                    System.out.println("Wrong OTP");
                break;
            } else if (usern.equals("admin") && pwd.equals("Java123")) {
                System.out.println("Password almost correct ");
            } else
                System.out.println("Either password or username is wrong TRY AGIAN!!");
        }
        if (i == 4)
            System.out.println("Account blcoked ");
        sc.close();
    }
}
// I have knowledge of using loops and stirng funcation therefore use those in
// these program instead of using switch