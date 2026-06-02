import java.util.Scanner;

public class result_analyser {
    public static void main() {
        String name;
        int s1, s2, s3, total;
        double avg = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name :  ");
        name = sc.nextLine();
        System.out.println("Enter marks of 3 subjects : ");
        s1 = sc.nextInt();
        s2 = sc.nextInt();
        s3 = sc.nextInt();
        total = s1 + s2 + s3;
        avg = total / 3.0;
        System.out.println("Output :");
        System.out.println("Name : " + name);
        System.out.println("Total marks : " + total);
        System.out.println("Average marks : " + avg);
        if (avg >= 50)
            System.out.println("Average is greater than 50");
        else
            System.out.println("Average is not greater than 50");
        sc.close();
    }
}
