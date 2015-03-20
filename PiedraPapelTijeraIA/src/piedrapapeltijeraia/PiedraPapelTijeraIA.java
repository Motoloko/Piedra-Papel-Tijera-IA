/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package piedrapapeltijeraia;

/**
 *
 * @author Gerardo
 */
public class PiedraPapelTijeraIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jugador j1 = new Jugador();
        Jugador j2 = new Jugador();
        
        j1.mano();
        j2.mano();
        
        System.out.println("El jugador 1 eligio: " + j1.regMano());
        System.out.println("El jugador 2 eligio: " + j2.regMano());
                
    }
    
}
