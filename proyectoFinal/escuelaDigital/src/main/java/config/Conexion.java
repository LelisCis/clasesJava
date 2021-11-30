package config;

import java.sql.*;

public class Conexion {
    public String driver = "com.mysql.cj.jdbc.Driver";
    public Connection getConection(){
        Connection c = null;
        try{
            Class.forName(driver);
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/comision2160",
                    "leliuscris","123456");
        }catch(ClassNotFoundException | SQLException error){
            System.out.println(error.toString());
        }
        return c;
    }
    public static void main(String[] lelis) throws SQLException{
        Connection conexion = null;
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
                   
          
            System.out.println("id: " + id + "\n nombre: " +nombre +
                    "\n Apellido: " + apellido +"\n Email: "+email + 
                    "\n Telefono: "+  telefono);
        }
        
        
    }
}
