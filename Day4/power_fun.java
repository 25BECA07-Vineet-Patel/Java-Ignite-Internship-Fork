import java.util.Scanner;

public class power_fun {
    public static void main(String args[]) {
        int n, p;
        double power;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base of number : ");
        n = sc.nextInt();
        System.out.println("Enter exponenet of number : ");
        p = sc.nextInt();
        power = Math.pow(n, p);
        System.out.println("Output : " + power);
        sc.close();
    }
}
