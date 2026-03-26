package MyPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_CreateTable {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
            	    "jdbc:mysql://localhost:3306/companydb?useSSL=false&serverTimezone=UTC",
            	    "root",
            	    "DiyaMCA"
            	);

            Statement st = con.createStatement();

            String sql = "CREATE TABLE employees (" +
                         "eno INT PRIMARY KEY, " +
                         "ename VARCHAR(50), " +
                         "esal DOUBLE, " +
                         "eaddr VARCHAR(100))";

            st.executeUpdate(sql);

            System.out.println("Table created successfully!");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
