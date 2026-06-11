import java.util.HashMap;
import java.util.Scanner;

public class student_marks {
    public static void main(String[] args) {

        // Create a HashMap called students
        HashMap<Integer, String> students = new HashMap<>();

        // Add student records
        students.put(101, "John");
        students.put(102, "Priya");
        students.put(103, "Rahul");
        students.put(104, "David");
        students.put(105, "Anu");

        // Display all student records
        System.out.println("Student Records:");
        System.out.println(students);

        // Ask the user to enter a Student ID
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Student ID: ");
        int studentID = sc.nextInt();

        // Check if the ID exists
        if (students.containsKey(studentID)) {

            String studentName = students.get(studentID);

            System.out.println("Student Name: " + studentName);

        } else {

            System.out.println("Student Not Found");

        }

        sc.close();
    }
}