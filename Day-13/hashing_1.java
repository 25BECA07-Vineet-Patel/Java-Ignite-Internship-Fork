import java.util.ArrayList;
import java.util.HashMap;

class Employee {

    int id;
    String department;
    double salary;

    Employee(int id, String department, double salary) {
        this.id = id;
        this.department = department;
        this.salary = salary;
    }
}

public class hashing_1 {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "IT", 50000));
        employees.add(new Employee(102, "HR", 30000));
        employees.add(new Employee(103, "IT", 45000));
        employees.add(new Employee(104, "Finance", 60000));
        employees.add(new Employee(105, "HR", 25000));

        HashMap<String, Double> deptSalary = new HashMap<>();

        // Grouping + Summation
        for (Employee emp : employees) {

            String dept = emp.department;

            if (deptSalary.containsKey(dept)) {
                deptSalary.put(dept,
                        deptSalary.get(dept) + emp.salary);
            } else {
                deptSalary.put(dept, emp.salary);
            }
        }

        System.out.println("Department Salary Totals:");
        System.out.println(deptSalary);

        // Comparison
        String highestDept = "";
        double maxSalary = 0;

        for (String dept : deptSalary.keySet()) {

            if (deptSalary.get(dept) > maxSalary) {
                maxSalary = deptSalary.get(dept);
                highestDept = dept;
            }
        }

        System.out.println("\nDepartment with Highest Total Salary:");
        System.out.println(highestDept + " = " + maxSalary);
    }
}