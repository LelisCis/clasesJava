
package clase3java;

import personal.Departamento;
import personal.Personal;
import recursosHumanos.Finanzas;

public class Clase3Java {

  
    public static void main(String[] args) {
        Personal administrativo = new Personal("Lulu","Cisneros","Bulnes 1321",34);
        administrativo.setSueldo(5000);
        System.out.println("Nombre: "+ administrativo.nombre);
        System.out.println(administrativo.getSueldo());
        Personal it = new Personal("Lulucita", "cis", "corrientes 21", 6);
        it.setSueldo(25000000);
        System.out.println("Nombre: "+ it.nombre);
        System.out.println(it.getSueldo());
        Departamento legales = new Departamento("maria",  "casas", "mario 52", 34, "legales");
        System.out.println(legales.mostrarDatos);
        Finanzas juana = new Finanzas("Juana", "Diaz", "calle 1414", 25, "Desarrollo", "Gerente");
        System.out.println("le abonamos a: " + "nombre");
        ABonarSueldo();
    }
    
    
}
