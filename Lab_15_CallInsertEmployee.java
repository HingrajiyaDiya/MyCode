package MyPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;

public class Lab_15_CallInsertEmployee 
{

    public static void main(String[] args) 
    {

        String url = "jdbc:mysql://localhost:3306/anp_4066";
        String username = "root";
        String password = "security"; 

        try 
        {
            Connection con = DriverManager.getConnection(url, username, password);

            CallableStatement cs = con.prepareCall("{call InsertEmployee(?, ?, ?, ?)}");

            cs.setInt(1, 101);
            cs.setString(2, "Riya");
            cs.setString(3, "Ahmedabad");
            cs.setInt(4, 50000);

            cs.execute();

            System.out.println("Employee inserted successfully");

            cs.close();
            con.close();

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}