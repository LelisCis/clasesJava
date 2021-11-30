package clase2java;

public class Ingreso {
    private String usuario, pass;
    private String miUsuario= "Lulu";
    private String miPass ="123456";

    public String getUsuario() {
        return usuario;
    }
    
     public String getPass() {
        return pass;
    }
       

    public void setPass(String pass) {
        this.pass = pass;
    }

 
    public void setMiUsuario(String us) {
       usuario = us;
    }
    
    public boolean validar(){
    return usuario.equals(miUsuario) && pass.equals(miPass);
    
    }

    void setUsuario(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



   


    

  

    
}
