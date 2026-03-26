package MyPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Lab_13_InsertCustomer 
{

    public static void main(String[] args) 
    {

        String url = "jdbc:mysql://localhost:3306/anp_4066";
        String username = "root";
        String password = "security";  
        String sql = "INSERT INTO customers (customer_id, first_name, last_name) VALUES (?, ?, ?)";

        try 
        {
            Connection con = DriverManager.getConnection(url, username, password);

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, 6);
            ps.setString(2, "Ankit");
            ps.setString(3, "Sharma");

            int rows = ps.executeUpdate();

            if (rows > 0) 
            {
                System.out.println("Customer inserted successfully.");
            }

            ps.close();
            con.close();

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}