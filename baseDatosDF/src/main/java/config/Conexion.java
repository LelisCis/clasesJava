
package config;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {
    public String driver = "com.mysql.cj.jdbc.Driver";
    public Connection getConection(){
        Connection conexion=null;
        try{
            Class.forName(driver);
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/comision2160",
                    "leliuscris","123456");
        }catch(SQLException e){
            System.out.println(e.toString());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;
    }
    public static void main(String [] args) throws SQLException, ClassNotFoundException{
        Connection conexion =null;
        Conexion con = new Conexion();
        conexion = con.getConection();
        PreparedStatement ps;
        ResultSet rs;
        
        ps = conexion.prepareStatement("SELECT * FROM participantes");
        rs = ps.executeQuery();
        while(rs.next()){
            int id =rs.getInt("id");
            String nombre = rs.getString("nombre");
            String apellido = rs.getString("apellido");
            String email =rs.getString("email");
            int telefono = rs.getInt("telefono");
                    
            System.out.println("id: " + id + "\n Nombre: " +nombre +
                    "\n Apellido: " + apellido +"\n Email: "+email + 
                    "\n Telefono: "+  telefono);
        }
        
    }
}
