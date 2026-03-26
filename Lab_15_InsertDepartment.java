package MyPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Lab_15_InsertDepartment 
{

    public static void main(String[] args) 
    {

        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String username = "system";
        String password = "security";   

        try 
        {
            Connection con = DriverManager.getConnection(url, username, password);

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Department Id: ");
            int id = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Enter Department Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Department Location: ");
            String location = sc.nextLine();

            String sql = "INSERT INTO Department VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, location);

            int rows = ps.executeUpdate();

            if (rows > 0) 
            {
                System.out.println("New Record inserted");
            }

            ps.close();
            con.close();
            sc.close();

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}