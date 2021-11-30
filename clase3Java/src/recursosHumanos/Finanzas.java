
package recursosHumanos;
import departamento.Departamento;

public class Finanzas extends Departamento {
Public String cargo;
    
public Finanzas(String nombre, String apellido, String domicilio, int edad, String dpto);    
   super(nombre, apellido, domicilio, edad, dpto);
   this.cargo= cargo;

    public Finanzas(String juana, String diaz, String calle_1414, int i, String desarrollo, String gerente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
public float AbonarSueldo(){
if(cargo.equals("gerente")){

return 350000;
}else if(cargo.equals("asistente")){

return 80000;
}
return 
}else return 0;
}