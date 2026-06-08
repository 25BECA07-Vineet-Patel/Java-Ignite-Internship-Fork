import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class Student {

    int rollNo;
    String name;
    int marks;

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    void calculateGrade() {

        if (marks >= 80)
            System.out.println("Grade: A");
        else if (marks >= 60)
            System.out.println("Grade: B");
        else if (marks >= 40)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: F");
    }

    void displayResult() {
        System.out.println("\nStudent Result");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    void displayResult(String semester) {
        System.out.println("\nSemester: " + semester);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

class GraduateStudent extends Student {

    GraduateStudent(int rollNo, String name, int marks) {
        super(rollNo, name, marks);
    }

    @Override
    void calculateGrade() {

        if (marks >= 85)
            System.out.println("Grade: A+");
        else if (marks >= 70)
            System.out.println("Grade: A");
        else if (marks >= 55)
            System.out.println("Grade: B");
        else
            System.out.println("Grade: C");
    }
}

public class student_result {

    // Save data using FileOutputStream
    static void saveResult(Student s) {

        try {

            FileOutputStream fos = new FileOutputStream("result.txt");

            String data = "Roll No: " + s.rollNo +
                    "\nName: " + s.name +
                    "\nMarks: " + s.marks + "\n";

            fos.write(data.getBytes());

            fos.close();

            System.out.println("\nResult saved successfully.");

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    static void readResult() {

        try {

            FileInputStream fis = new FileInputStream("result.txt");

            int ch;

            System.out.println("\n----- Stored Result -----");

            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }

            fis.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        GraduateStudent gs = new GraduateStudent(
                101,
                "Rahul",
                88);

        // Overloaded Methods
        gs.displayResult();

        gs.displayResult("Semester 4");

        // Overridden Method
        gs.calculateGrade();

        // File Handling
        saveResult(gs);

        readResult();
    }
}