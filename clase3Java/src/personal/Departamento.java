
package personal;


public class Departamento extends Personal{

    public boolean mostrarDatos;
    public Departamento(String nombre, String apellido, String domicilio, int edad, String depto) {
    super(nombre,apellido,domicilio,edad);
        }
  public String mostrarDatos(){
  return  nombre + apellido;
  
  
}
    
    
    
}
