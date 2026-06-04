import java.util.Scanner;

public class input_array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int marks[] = new int[5];

        System.out.println("Enter 5 marks:");

        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }

        System.out.println("Student Marks:");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        sc.close();
    }
}