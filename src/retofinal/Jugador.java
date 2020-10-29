
package retofinal;

public class Jugador extends Personajes{
    private int hadasRescatadas;
    private int casasConstruidas;
    
    public Jugador(String nombre, int poder, int nivelVida) {
        super(nombre, nivelVida);
    }

    public Jugador() {
    }
    
    public void construir (){
        if(casasConstruidas == 20){
            System.out.println("¡Has construido todas las casas para las hadas!");
        }else{
            casasConstruidas +=1;
            System.out.println("¡Casa construida!");
        }
    }
    
    public void rescatarHada(int hadas){
        if(hadasRescatadas == hadas){
            System.out.println("¡Has rescatado a todas las hadas!");
        }else if (casasConstruidas > hadasRescatadas){
            hadasRescatadas += 1;
            System.out.println("¡Hada rescatada!");
        }else{
            System.out.println("¡Construye primero una casa para rescatar al hada!");
        }
    }
    
    public void aumentarVida(Jugador Heroe){
        if(hadasRescatadas == 5){
            nivelVida += 5;
            System.out.println("¡Tu vida aumenta 10 pts!");
        }else if(hadasRescatadas == 10){
            nivelVida += 10;
            System.out.println("¡Tu vida aumenta 5 pts!");
        }
    }
    
    public void perderHada(int hadas){
        if(hadasRescatadas > 0 & hadasRescatadas < hadas){
            hadasRescatadas -= 1;
        }
    }
    
    public void disminuirVida(){
        nivelVida = nivelVida - 5;
    }
    
    public int getHadasRescatadas() {
        return hadasRescatadas;
    }

    public void setHadasRescatadas(int hadasRescatadas) {
        this.hadasRescatadas = hadasRescatadas;
    }

    public int getCasasConstruidas() {
        return casasConstruidas;
    }

    public void setCasasConstruidas(int casasConstruidas) {
        this.casasConstruidas = casasConstruidas;
    }


}
