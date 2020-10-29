
package retofinal;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class RetoFinal {
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        Jugador Heroe = new Jugador();
        Heroe.setNivelVida(50);
        Mago Hechicero = new Mago();
        Hechicero.setNombre("Supremus");
        Hechicero.setNivelPoder(50);
        Hechicero.setNivelVida(50);
        int hadas = 20;
        int terminar;
        int respuesta;
        int numTurno= 1;
        int continuar;
        
        
        
            
           
            do{
               System.out.println("=>[HADA]: ¡Necesitamos ayuda!, misterioso Heroe, ¿cuál es tu nombre?");
               String nombreHeroe = entrada.readLine();
               Heroe.setNombre(nombreHeroe);
               System.out.println("=>[HADA]: "+ Heroe.getNombre()+", ¡Tienes que ayudarnos! \n=>[HADA]: ¡El malvado Hechicero "+ Hechicero.getNombre()+" esta atacando el pueblo de Karmaland! Ayuda a las hadas a construir sus casas, por cada una que construyas, el mago perdera poder. \n¡Pero ten cuidado, el ogro guardian de "+ Hechicero.getNombre()+ " tiene poderosos ataques!");
               System.out.println("(...\n)");
            do{
                
                
                Random valor = new Random(System.nanoTime());
                int turno = valor.nextInt(3)+1;
                System.out.println(turno);
                System.out.println("Turno: " + numTurno++);
                
                System.out.println("-------["+ Heroe.getNombre()+"]-------");
                System.out.println("Nivel de vida: " + Heroe.getNivelVida());
                System.out.println("Casas construidas: " + Heroe.getCasasConstruidas());
                System.out.println("Hadas rescatadas: " + Heroe.getHadasRescatadas());
                
                System.out.println("-------["+ Hechicero.getNombre()+"]-------");
                System.out.println("Nivel de poder: "+Hechicero.getNivelPoder());
                System.out.println("Hadas capturadas: "+ Hechicero.getCantidadHadas()+ "\n");
                switch(turno){
                    case 1:
                        //Movimientos jugador.
                        
                        try{
                            System.out.println("¿Que deseas hacer? \n1) Construir casa. \n2) Rescatar hada. \nNota: Recuerda que no puedes rescatar un hada si no tienes las casas suficientes.");
                            respuesta = Integer.parseInt(entrada.readLine());
                            switch(respuesta){
                            case 1:
                                Heroe.construir();
                                break;
                            case 2:
                                Heroe.rescatarHada(hadas);
                                Hechicero.disminuirHadas();
                                Heroe.aumentarVida(Heroe.getNivelVida()); 
                                if(Heroe.getHadasRescatadas() == 5 || Heroe.getHadasRescatadas() == 10 || Heroe.getHadasRescatadas() == 15 || Heroe.getHadasRescatadas() == 20){
                                   Hechicero.disminuirPoder(); 
                                }
                            default:
                                break;
                        }     
                        }catch(NumberFormatException b){
                            System.out.println("Valor no numerico ingresado, intente de nuevo.");
                        }
                                         
                        break;
                    case 2:
                        //Movimientos Mago
                         Random m = new Random(System.nanoTime());
                         int accion = m.nextInt(3)+1;
                         switch(accion){
                             case 1:
                                 //Capturar hada.
                                 Hechicero.capturarHada(hadas);
                                 Heroe.perderHada(hadas);
                                 
                                 break;
                             case 2:
                                 //Atacar.
                                 if(Hechicero.getCantidadHadas() == 5 || Hechicero.getCantidadHadas() == 10 || Hechicero.getCantidadHadas() == 15 || Hechicero.getCantidadHadas() == 20){
                                 Heroe.disminuirVida();
                                 }
                         
                                 break;
                             case 3:
                                 System.out.println("¡" +Hechicero.getNombre() + " Ha fallado en su ataque! \n");
                             default:
                                 break;
                         }                        
                        break;
                    case 3:
                        System.out.println("¡Has bloqueado el ataque!");
                        break;
                    default:
                        break;
                        }
                
                    if(Heroe.getNivelVida() <= 0 || Hechicero.getNivelPoder() <= 0 || Heroe.getHadasRescatadas()== hadas || Hechicero.getCantidadHadas() == hadas){
                            terminar = 0;
                    }else{
                        terminar = 1;
                    }
            }while( terminar != 0);
            
            if(Heroe.getNivelVida() <= 0 || Heroe.getHadasRescatadas() <= 0){
                System.out.println(Hechicero.getNombre()+ "te ha derrotado, ¡fin del juego!");
            }else{
                System.out.println("Has derrotado a " + Hechicero.getNombre()+ ", ¡fin del juego!");
            }
            
            try{
                System.out.println("¿Deseas jugar otra vez? 1) Si   0) No");
                continuar = Integer.parseInt(entrada.readLine());
            }catch(NumberFormatException num){
                System.out.println("Valor no numerico ingresado. Intente de nuevo.");
                continuar = 1;
            }
            }while(continuar != 0);
       
    }
}
