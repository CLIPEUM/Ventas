
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    Connection con;
    public Connection getConnection(){
        try{
            String myBD = "jdbc:mysql://lacomarca.mysql.database.azure.com:3306/bd_ventas?serverTimezone=UTC"; 
            con = DriverManager.getConnection(myBD,"Hobit@lacomarca","Carrobonito84");
            return con;
        }catch(SQLException e){
            System.out.println(e.toString());  
        }
        return null;
    }
}
