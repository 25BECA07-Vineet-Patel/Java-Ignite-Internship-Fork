import java.util.Scanner;

public class employee_bonus {
    public static void main(String args[]) {
        int yrs, rate;
        double per, bon = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter yeas of experience of employee : ");
        yrs = sc.nextInt();
        System.out.println("Enter attedance percentage : ");
        per = sc.nextDouble();
        System.out.println("Enter performance rating : ");
        rate = sc.nextInt();
        if (per < 60)
            System.out.println("Not eligible for bonus");
        else if (yrs >= 3 && per >= 85) {
            System.out.println("Eligible for bonus");
            if (rate == 5.0)
                bon = 50000.0;
            else if (rate == 4.0)
                bon = 30000.0;
            else if (rate == 3.0)
                bon = 10000.0;
            else
                bon = 0.0;
            System.out.println("Bonus : " + bon);
        } else
            System.out.println("Not eligible for bonus");
        sc.close();
    }
}
