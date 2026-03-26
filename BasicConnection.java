package MyPackage;

import java.sql.*;

public class BasicConnection 
{
    public static void main(String[] args) 
    {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/anp_4066",
                "root",
                "security"
            );

            if (con != null) 
            {
                System.out.println("Connected Successfully");
            }

            con.close();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}