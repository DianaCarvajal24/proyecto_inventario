
package Config;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    Connection con;
    public Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3308/appinventary","root","");            
        } catch (Exception e) {
            System.err.println("Error"+e);
        }
    }
    public Connection getConnection(){
        return con;
    }
}
//public class Conexion {
//    static Connection con = null;
//    public static Connection getConnection(){
//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//            con=DriverManager.getConnection("jdbc:mysql://localhost:3308/almacend?userTimezone=true&serverTimezone=UTC","root","");
//            
//            JOptionPane.showMessageDialog(null, "ya se conecto","informacion", JOptionPane.INFORMATION_MESSAGE);
//            Connection cn = Conexion.getConnection();
//        }catch(Exception ex){
//            
//            ex.printStackTrace();
//        }
//            return con;
//    }
//}
//    public static void main (String [] args){
//        
//    }
//}