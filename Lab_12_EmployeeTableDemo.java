package MyPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class Lab_12_EmployeeTableDemo 
{

    public static void main(String[] args) 
    {

        String url = "jdbc:mysql://localhost:3306/anp_4066";
        String username = "root";
        String password = "security";

        try 
        {
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection: " + con);

            Statement stmt = con.createStatement();

            String sql = "CREATE TABLE IF NOT EXISTS Employee ("
                    + "eid INT PRIMARY KEY AUTO_INCREMENT, "
                    + "name VARCHAR(100) NOT NULL, "
                    + "address VARCHAR(100) NOT NULL, "
                    + "salary INT NOT NULL)";

            stmt.executeUpdate(sql);
            System.out.println("table creation done successfully\n");

            ResultSet rs = stmt.executeQuery("SELECT * FROM Employee");

            while (rs.next()) 
            {
                System.out.println("Id: " + rs.getInt("eid"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Address: " + rs.getString("address"));
                System.out.println("Salary: " + rs.getInt("salary"));
                System.out.println("========================================\n");
            }

            rs.close();
            stmt.close();
            con.close();

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}