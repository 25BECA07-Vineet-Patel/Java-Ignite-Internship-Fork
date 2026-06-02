import java.util.*;

public class fibonacci {
    public static void main(String args[]) {
        int a = 0, b = 1, s = 0, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n : ");
        n = sc.nextInt();
        System.out.println("Fibonacci series upti to " + n + " terms");
        System.out.println(a);
        System.out.println(b);
        for (int i = 3; i <= n; i++) {
            s = a + b;
            System.out.println(s);
            a = b;
            b = s;
        }
        sc.close();
    }
}
