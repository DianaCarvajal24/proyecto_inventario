
package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection con;
<<<<<<< HEAD
    String url="jdbc:mysql://localhost:3306/bd_ventas";
    String user="root";
    String pass="12345678";
=======
    String url="jdbc:mysql://localhost:3307/bd_ventas";
    String user="root";
    String pass="usbw";
>>>>>>> 7f94ac169a897a11b7763404c55c6c774a984d1b
    public Connection Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {
        }
        return con;
    }
}
