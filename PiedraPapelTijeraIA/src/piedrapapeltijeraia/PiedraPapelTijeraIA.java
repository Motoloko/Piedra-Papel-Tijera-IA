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

    Jugador j1 = new Jugador();
    Jugador j2 = new Jugador();
    
    void jugar(){
        j1.mano();
        j2.mano();
        
        System.out.println("El jugador 1 eligio: " + j1.regMano());
        System.out.println("El jugador 2 eligio: " + j2.regMano());
        
        j1.control.cambio(j2.regMano());
        j2.control.cambio(j1.regMano());
        
        j1.control.mostrarProbs();
        j2.control.mostrarProbs();
    }
    
    public static void main(String[] args) {
        PiedraPapelTijeraIA juego = new PiedraPapelTijeraIA();
        juego.jugar();
        juego.jugar();
        juego.jugar();
        juego.jugar();
    }
    
}
