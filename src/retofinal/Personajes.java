
package retofinal;

public class Personajes {
    protected String nombre;
    protected int nivelVida;
    

    public Personajes(String nombre, int nivelVida) {
        this.nombre = nombre;
        this.nivelVida = nivelVida;
        
    }
    
    public Personajes (){
        
    }
    
    public void aumentarVida(int nivelVida){

    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivelVida() {
        return nivelVida;
    }

    public void setNivelVida(int nivelVida) {
        this.nivelVida = nivelVida;
    }
    
}
