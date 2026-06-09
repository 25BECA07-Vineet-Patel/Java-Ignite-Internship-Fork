
import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnection {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/mysql";
            String username = "root";
            String password = "Yash@12345+=";

            Connection con = DriverManager.getConnection(
                    url,
                    username,
                    password);

            System.out.println("Connected Successfully!");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}