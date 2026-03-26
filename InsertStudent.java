package MyPackage;

import java.sql.*;

public class InsertStudent 
{
    public static void main(String[] args) throws Exception 
    {
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/anp_4066", "root", "security");

        String sql = "INSERT INTO student (id, name, marks) VALUES (?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, 1);
        ps.setString(2, "Rahul");
        ps.setInt(3, 85);

        ps.executeUpdate();
        System.out.println("Record Inserted Successfully");

        con.close();
    }
}