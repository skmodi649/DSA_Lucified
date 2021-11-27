import java.sql.*;

public class FirstJDBC {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Name : Suraj Kumar");
        System.out.println("Registration Number : 20BCE2835");
        Connection con = null;
        try{
            // Loading the driver
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded!");

            // Now establish the connection
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","");
            System.out.println("Connection Estabslished!");

            Statement s=con.createStatement(); // insert a record into table
            s.executeUpdate("INSERT INTO food_item_tabel VALUES(1006 , 'Faluda' , 79);");
            s.executeUpdate("INSERT INTO food_item_tabel VALUES(1007 , 'Kachauri' , 15);");
            System.out.println("Record Inserted!");
            s.executeUpdate("DELETE from food_item_tabel where id=1001;");
            System.out.println("Record deleted!");
            s.executeUpdate("UPDATE food_item_tabel set price=101 WHERE id=1006;");
            System.out.println("Price updated!");
            ResultSet rs=s.executeQuery("SELECT * FROM food_item_tabel;");
            //Fetching data from ResultSet and display
            while (rs.next())
            {
                //to fetch value from a column having number type of value
                int x = rs.getInt("id");
                //to fetch value from a column having varchar/text type of value
                String y = rs.getString("Name");
                //to fetch value from a column having number type of value
                int z = rs.getInt("Price");
                System.out.println(x + "   " + y + " " + z);
            }
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
