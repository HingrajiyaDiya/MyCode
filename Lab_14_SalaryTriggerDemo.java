package MyPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Lab_14_SalaryTriggerDemo 
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

            String empTable = "CREATE TABLE IF NOT EXISTS Emps ("
                    + "employee_id INT PRIMARY KEY AUTO_INCREMENT, "
                    + "name VARCHAR(100) NOT NULL, "
                    + "salary DECIMAL(10,2) NOT NULL)";
            stmt.executeUpdate(empTable);

            String logTable = "CREATE TABLE IF NOT EXISTS Salary_Log ("
                    + "log_id INT PRIMARY KEY AUTO_INCREMENT, "
                    + "employee_id INT, "
                    + "new_salary DECIMAL(10,2), "
                    + "change_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP)";
            stmt.executeUpdate(logTable);

            stmt.executeUpdate("DROP TRIGGER IF EXISTS salary_update_trigger");

            String trigger = "CREATE TRIGGER salary_update_trigger "
                    + "AFTER UPDATE ON Emps "
                    + "FOR EACH ROW "
                    + "INSERT INTO Salary_Log(employee_id, new_salary) "
                    + "VALUES (NEW.employee_id, NEW.salary)";
            stmt.executeUpdate(trigger);

            System.out.println("Tables and Trigger created successfully.");

            stmt.close();
            con.close();

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}