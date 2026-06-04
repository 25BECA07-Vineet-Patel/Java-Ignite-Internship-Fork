import java.util.Scanner;

public class email_validator {
    public static void main(String args[]) {
        String s, u, l;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        s = sc.nextLine();
        u = s.toUpperCase();
        l = s.toLowerCase();
        System.out.println("Upper Case : " + u);
        System.out.println("Lower Case : " + l);
        sc.close();
    }
}
