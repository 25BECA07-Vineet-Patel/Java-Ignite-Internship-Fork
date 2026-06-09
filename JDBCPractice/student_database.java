
import java.sql.*;

public class student_database {

        public static void main(String[] args) {

                try {

                        Class.forName("com.mysql.cj.jdbc.Driver");

                        // Connect to MySQL Server
                        Connection con = DriverManager.getConnection(
                                        "jdbc:mysql://localhost:3306/",
                                        "root",
                                        "Yash@12345+=");

                        Statement st = con.createStatement();

                        // Create database if it doesn't exist
                        st.executeUpdate("CREATE DATABASE IF NOT EXISTS college_db");

                        System.out.println("Database Ready!");

                        // Use database
                        st.executeUpdate("USE college_db");

                        // Create table if it doesn't exist
                        st.executeUpdate(
                                        "CREATE TABLE IF NOT EXISTS students (" +
                                                        "id INT PRIMARY KEY, " +
                                                        "name VARCHAR(50), " +
                                                        "marks INT)");

                        System.out.println("Table Ready!");

                        // Insert sample data only if table is empty
                        ResultSet check = st.executeQuery(
                                        "SELECT COUNT(*) AS total FROM students");

                        check.next();

                        if (check.getInt("total") == 0) {

                                st.executeUpdate(
                                                "INSERT INTO students VALUES " +
                                                                "(1,'Vineet',90)," +
                                                                "(2,'Rahul',75)," +
                                                                "(3,'Aman',85)," +
                                                                "(4,'Priya',65)");

                                System.out.println("Sample Data Inserted!");
                        }

                        check.close();

                        // Calculate average marks
                        ResultSet rsAvg = st.executeQuery(
                                        "SELECT AVG(marks) AS avg_marks FROM students");

                        double average = 0;

                        if (rsAvg.next()) {
                                average = rsAvg.getDouble("avg_marks");
                        }

                        rsAvg.close();

                        System.out.println("\nAverage Marks = " + average);

                        // Fetch all students
                        ResultSet rs = st.executeQuery(
                                        "SELECT * FROM students");

                        int count = 0;

                        System.out.println("\nStudents Above Average:");

                        while (rs.next()) {

                                count++;

                                int id = rs.getInt("id");
                                String name = rs.getString("name");
                                int marks = rs.getInt("marks");

                                if (marks > average) {

                                        System.out.println(
                                                        "ID: " + id +
                                                                        " Name: " + name +
                                                                        " Marks: " + marks);
                                }
                        }

                        System.out.println(
                                        "\nTotal Students Processed: " + count);

                        rs.close();
                        st.close();
                        con.close();

                } catch (Exception e) {
                        e.printStackTrace();
                }
        }
}