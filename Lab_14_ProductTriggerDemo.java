package MyPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Lab_14_ProductTriggerDemo 
{

    public static void main(String[] args) 
    {

        String url = "jdbc:mysql://localhost:3306/anp_4066";
        String username = "root";
        String password = "security";  
        try 
        {
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();

            String products = "CREATE TABLE IF NOT EXISTS products ("
                    + "product_id INT PRIMARY KEY AUTO_INCREMENT, "
                    + "product_name VARCHAR(100) NOT NULL, "
                    + "price DECIMAL(10,2) NOT NULL)";
            stmt.executeUpdate(products);

            String metadata = "CREATE TABLE IF NOT EXISTS Product_Metadata ("
                    + "product_id INT PRIMARY KEY, "
                    + "last_modified TIMESTAMP DEFAULT CURRENT_TIMESTAMP)";
            stmt.executeUpdate(metadata);

            stmt.executeUpdate("DROP TRIGGER IF EXISTS product_after_insert");
            stmt.executeUpdate("DROP TRIGGER IF EXISTS product_after_update");

            String insertTrigger = "CREATE TRIGGER product_after_insert "
                    + "AFTER INSERT ON products "
                    + "FOR EACH ROW "
                    + "INSERT INTO Product_Metadata(product_id, last_modified) "
                    + "VALUES (NEW.product_id, CURRENT_TIMESTAMP)";
            stmt.executeUpdate(insertTrigger);

            String updateTrigger = "CREATE TRIGGER product_after_update "
                    + "AFTER UPDATE ON products "
                    + "FOR EACH ROW "
                    + "UPDATE Product_Metadata "
                    + "SET last_modified = CURRENT_TIMESTAMP "
                    + "WHERE product_id = NEW.product_id";
            stmt.executeUpdate(updateTrigger);

            System.out.println("Trigger created successfully.");

            stmt.close();
            con.close();

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}