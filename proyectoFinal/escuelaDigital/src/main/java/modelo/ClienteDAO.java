package modelo;

import config.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class ClienteDAO {
    
    Connection conexion;
    public ClienteDAO(){
         Conexion con = new Conexion(); 
         conexion = con.getConection();
}
    
    public List<Clientes> listarClientes(){
        PreparedStatement ps;
        ResultSet rs; 
        List<Clientes> lista = new ArrayList<>();
        /*Lista es abstracta */
        try {
        
            ps = conexion.prepareStatement("SELECT * FROM participantes");
            rs = ps.executeQuery();
            
            while(rs.next()){
               int id = rs.getInt("Id");
               String nombre = rs.getString("Nombres"); 
               String apellido = rs.getString("Apellidos");
               String email = rs.getString("Email"); 
               int telefono = rs.getInt("Telefóno"); 
               
               Clientes clientes = new Clientes (id, nombre, apellido, email, telefono);
               lista.add(clientes);
               
            }
            return lista;
        
        } catch(SQLException e) {
            System.out.println(e.toString());
            return null;
            
        }
    }
    
    public Clientes mostrarCliente(int _id){
        PreparedStatement ps;
        ResultSet rs; 
        Clientes cliente = null;
        
         try{
            ps = conexion.prepareStatement("SELECT * FROM " 
                    + "participantes WHERE id=?");
            ps.setInt(1,_id);
            rs = ps.executeQuery();
            
            while(rs.next()){
               int id = rs.getInt("Id");
               String nombre = rs.getString("Nombres"); 
               String apellido = rs.getString("Apellidos");
               String email = rs.getString("Email"); 
               int telefono = rs.getInt("Telefóno"); 
               
               cliente = new Clientes (id,nombre,apellido,email,telefono);
               
            }return cliente;
                     
         } catch(SQLException e){
         
             System.out.println(e.toString());          
             return null;
         }   
        
    }
    public boolean insertarCliente(Clientes cliente){
        PreparedStatement ps;
        try{
        ps = conexion.prepareStatement("INSERT INTO participantes"
            + "(nombre, apellido, email, telefono)"
            + "VALUES (?,?,?,?)");
        
        ps.setString(1, cliente.getNombre());
        ps.setString(2, cliente.getApellido());
        ps.setString(3, cliente.getEmail());
        ps.setInt(4, cliente.getTelefono());
        ps.execute();
        return true;
        
        
        } catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }
                
    }
    public boolean actualizarCliente (Clientes cliente){
    
          PreparedStatement ps;
        try{
        ps = conexion.prepareStatement("UPDATE  " 
                + "participantes SET nombre=?"
                + "apellido=?" 
                + "email=?"
                + "telefono =? WHERE id=?");
        
        ps.setString(1, cliente.getNombre());
        ps.setString(2, cliente.getApellido());
        ps.setString(3, cliente.getEmail());
        ps.setInt(4, cliente.getTelefono());
        ps.execute();
        return true;
        
        
        } catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }
                
    }
    
      public boolean eliminarCliente(int _id){
       PreparedStatement ps;
          try{
            ps = conexion.prepareStatement("DELETE * FROM "
                    + "participantes WHERE id=?");
            ps.setInt(1,_id);
            ps.execute();
            return true;
            } catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }
                
    }
    
}
