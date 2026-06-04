import java.util.Scanner;

public class attendance_tracker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int attendance[] = new int[10];

        int present = 0;
        int absent = 0;

        System.out.println("Enter attendance (1 = Present, 0 = Absent):");

        for (int i = 0; i < attendance.length; i++) {
            attendance[i] = sc.nextInt();

            if (attendance[i] == 1) {
                present++;
            } else {
                absent++;
            }
        }

        double percentage = (present * 100.0) / attendance.length;

        System.out.println("Present Students: " + present);
        System.out.println("Absent Students: " + absent);
        System.out.println("Attendance Percentage: " + percentage + "%");
        sc.close();
    }
}