import java.util.Scanner;

public class pallindrone {
    public static void main(String args[]) {
        int n, num, rev = 0, rem;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        n = sc.nextInt();
        num = n;
        while (n > 0) {
            rem = n % 10;
            n = n / 10;
            rev = rev * 10 + rem;
        }
        if (num == rev)
            System.out.println("Palindrone number");
        else
            System.out.println("Not a Palindrone number");
        sc.close();
    }
}
