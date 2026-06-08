import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Employee {

    int employeeId;
    String name;

    Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    void displayRole() {
        System.out.println("Employee");
    }
}

class Doctor extends Employee {

    String specialization;

    Doctor(int employeeId, String name, String specialization) {
        super(employeeId, name);
        this.specialization = specialization;
    }

    @Override
    void displayRole() {
        System.out.println("Role: Doctor");
        System.out.println("Specialization: " + specialization);
    }
}

class Nurse extends Employee {

    String shift;

    Nurse(int employeeId, String name, String shift) {
        super(employeeId, name);
        this.shift = shift;
    }

    @Override
    void displayRole() {
        System.out.println("Role: Nurse");
        System.out.println("Shift: " + shift);
    }
}

public class hospital_system {

    // Method to save employee details
    static void saveEmployee(Employee emp) {

        try {
            FileWriter fw = new FileWriter("employees.txt", true);

            if (emp instanceof Doctor) {

                Doctor d = (Doctor) emp;

                fw.write("Employee ID: " + d.employeeId +
                        ", Name: " + d.name +
                        ", Role: Doctor" +
                        ", Specialization: " + d.specialization + "\n");
            }

            else if (emp instanceof Nurse) {

                Nurse n = (Nurse) emp;

                fw.write("Employee ID: " + n.employeeId +
                        ", Name: " + n.name +
                        ", Role: Nurse" +
                        ", Shift: " + n.shift + "\n");
            }

            fw.close();

            System.out.println("Employee details saved successfully.");

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    // Method to read employee details
    static void readEmployees() {

        try {

            FileReader fr = new FileReader("employees.txt");

            int ch;

            System.out.println("\n----- Employee Records -----");

            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        // Runtime Polymorphism
        Employee emp1 = new Doctor(
                101,
                "Rahul Sharma",
                "Cardiologist");

        Employee emp2 = new Nurse(
                102,
                "Priya Singh",
                "Night");

        // Overridden Methods
        emp1.displayRole();
        System.out.println();

        emp2.displayRole();
        System.out.println();

        // Save to File
        saveEmployee(emp1);
        saveEmployee(emp2);

        // Read from File
        readEmployees();
    }
}