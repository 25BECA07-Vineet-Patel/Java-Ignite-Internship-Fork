import java.util.Scanner;

public class sum_negative {
    public static void main(String args[]) {
        int num, s = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number : ");
            num = sc.nextInt();
            if (num < 0)
                break;
            s = s + num;
        }
        System.out.println("Sum of number : " + s);
        sc.close();
    }
}
