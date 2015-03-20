
package piedrapapeltijeraia;
import java.util.Random;

public class Jugador {
    float[] probs;
    ControlProbabilidad control = new ControlProbabilidad();
    Random aleatorio = new Random();
    int manoJuego;
    float num; 
    
    Jugador(){
       
        control.mostrarProbs();
        System.out.println("constructor");
        
    }
    
    int regMano(){
        return manoJuego;
    }
    
    void mano(){
        probs = control.probas();
        System.out.println("probt " + control.probsT[1]);
        //control.mostrarProbs();
        num = aleatorio.nextFloat() * (90 - 1) + 1;
        System.out.println("num = " + num);
        //Seleccion de mano
        if(num <= probs[0]){
            manoJuego = 0;
        }
        else if( num <= probs[1]){
            manoJuego = 1;
        }
        else if( num <= probs[2]){
            manoJuego = 2;
        }
            
        System.out.println("Eleji: " + manoJuego);
        
    }
    
    public static void main(String[] args){
        Jugador jug1 = new Jugador();
        jug1.mano();
        
        jug1.mano();
    }
    
}
