package MyPackage;

import java.sql.Connection;
import java.sql.DriverManager;

public class Lab_12_JDBCConnectionExample 
{

    public static void main(String[] args) 
    {

        String url = "jdbc:mysql://localhost:3306/anp_4066";
        String username = "root";
        String password = "security";

        try 
        {        
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, username, password);

            System.out.println("Connection: " + con);

        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}