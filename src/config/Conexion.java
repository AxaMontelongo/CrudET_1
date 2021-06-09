
package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection con;
    public Conexion(){
        try {
            //si es workbrenchpuerto 3306 o xampp 3307, cambiar el nombre de la base de datos de registro al nombre que seleccionado 
            con=DriverManager.getConnection("jdbc:mysql://localhost:3307/registro","root","");
        } catch (Exception e) {
            System.err.println("Error:"+e);
        }        
    }
    public Connection getConnection(){
        return con;
    }
  }
