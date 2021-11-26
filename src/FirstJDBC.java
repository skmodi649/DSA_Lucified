import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstJDBC {
    public static void main(String[] args) throws ClassNotFoundException {
        Connection con = null;
        try{
            // Loading the driver
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded!");

            // Now establish the connection
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","");
            System.out.println("Connection Estabslished!");

            Statement s=con.createStatement(); // insert a record into table
            s.executeUpdate("INSERT INTO food_item_tabel VALUES(1006 , 'Faluda' , 179);");
            System.out.println("Record Inserted!");
            s.close();
            con.close();

        }catch(ClassNotFoundException e){
            System.out.println("Exception!"+e.getMessage());
        }
        catch (SQLException e){
            System.out.println("SQL Exception!"+e.getMessage());
        }
    }
}
