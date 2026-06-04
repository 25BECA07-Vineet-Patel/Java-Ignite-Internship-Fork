import java.util.Scanner;

public class marks_tracker {
    public static void main(String args[]) {
        int p = 0, f = 0, i;
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        System.out.println("Enter marks of 10 students : ");
        for (i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < 10; i++) {
            if (a[i] >= 35)
                p++;
            else
                f++;
        }
        System.out.println("No of students passed : " + p);
        System.out.println("No of students failed : " + f);
        sc.close();
    }
}
