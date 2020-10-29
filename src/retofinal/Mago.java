
package retofinal;

public class Mago extends Personajes{
    private int cantidadHadas;
    private int nivelPoder;
    public Mago(int cantidadHadas, String nombre, int poder, int nivelVida, int nivelPoder) {
        super(nombre, nivelVida);
        this.cantidadHadas = cantidadHadas;
    }

    public Mago (){
        
    }
    
    public void disminuirHadas(){
        if(cantidadHadas >= 0){
            cantidadHadas -= 1;
        }else{
            
        }
        System.out.println("¡El mago Pierde un hada.\n");
    }
    
    public void disminuirPoder (){
        if(nivelPoder > 0){
            switch(nivelPoder){
            case 65:
                nivelPoder -= 3;
                System.out.println("¡El mago Pierde 3 puntos.\n");
                break;
            default:
                nivelPoder -= 5;
                System.out.println("¡El mago Pierde 5 puntos!\n");
                break;
            }
        }
        
        
    }
    
    public void capturarHada (int hadas){
        cantidadHadas ++;    
        System.out.println("¡El mago ha capturado un hada!\n");
    }
    
    public void aumentarPoder(Mago Hechicero){
        switch (nivelPoder) {
            case 50:
                nivelPoder += 10;
                break;
            case 60:
                nivelPoder+= 5;
                break;
            case 65:
                System.out.println(Hechicero.getNombre() + " Ha alcanzado su máximo poder.");
                break;
            default:
                System.out.println(Hechicero.getNombre() + " No puede subir de nivel. Necesita mas hadas.");
                break;
        }
    }

    public int getCantidadHadas() {
        return cantidadHadas;
    }

    public void setCantidadHadas(int cantidadHadas) {
        this.cantidadHadas = cantidadHadas;
    }

    public int getNivelPoder() {
        return nivelPoder;
    }

    public void setNivelPoder(int nivelPoder) {
        this.nivelPoder = nivelPoder;
    }
    
    
}
