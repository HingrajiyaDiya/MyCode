package MyPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Lab_13_UpdateCustomerEmail 
{

    public static void main(String[] args) 
    {

        String url = "jdbc:mysql://localhost:3306/anp_4066";
        String username = "root";
        String password = "security";   
        String sql = "UPDATE customers SET email = ? WHERE customer_id = ?";

        try 
        (
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement ps = con.prepareStatement(sql);
        ) 
        {

            ps.setString(1, "newemail@gmail.com");
            ps.setInt(2, 3);   
            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) 
            {
                System.out.println("Customer email updated successfully.");
            } 
            else 
            {
                System.out.println("Customer not found.");
            }

        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}