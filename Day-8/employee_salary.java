import java.util.Scanner;

public class employee_salary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int salary[] = new int[5];
        int total = 0;

        System.out.println("Enter salaries of 5 employees:");

        for (int i = 0; i < salary.length; i++) {
            salary[i] = sc.nextInt();
            total += salary[i];
        }

        double average = (double) total / salary.length;

        System.out.println("Total Salary = " + total);
        System.out.println("Average Salary = " + average);
        sc.close();
    }
}