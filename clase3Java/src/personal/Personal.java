package personal;

public class Personal {

   public String nombre, apellido, domicilio;
   public int edad;
   private float sueldo;

    public Personal(String lulu, String cisneros, String bulnes_1321, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   public float getSueldo() {
    return this.sueldo; 
   }
   public float setSueldo(float nuevoSueldo) {
    return this.sueldo=nuevoSueldo; 
   }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
