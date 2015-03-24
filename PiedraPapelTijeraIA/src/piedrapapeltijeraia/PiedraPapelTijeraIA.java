package piedrapapeltijeraia;

public class PiedraPapelTijeraIA {

    Jugador j1 = new Jugador();
    Jugador j2 = new Jugador();
    
    void jugar(){
        j1.mano();
        j2.mano();
        
        System.out.println("El jugador 1 eligio: " + j1.regMano());
        System.out.println("El jugador 2 eligio: " + j2.regMano());
        
        if(j1.regMano()==j2.regMano()){
            System.out.println("Empate");}
        else{
        if(((j1.regMano()+j2.regMano())-1)==2){
            if(j1.regMano()>j2.regMano())
                    System.out.println("Gano j1 tijera");
            else
                System.out.println("Gano j2 tijera");
        }
        
         if(((j1.regMano()+j2.regMano())-1)==1){
            if(j1.regMano()>j2.regMano())
                    System.out.println("Gano j1 piedra");
            else
                System.out.println("Gano j2 piedra");
        }
        if(((j1.regMano()+j2.regMano())-1)==0){
            if(j1.regMano()>j2.regMano())
                    System.out.println("Gano j1 papel");
            else
                System.out.println("Gano j2 papel");
        }
        }
        
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
