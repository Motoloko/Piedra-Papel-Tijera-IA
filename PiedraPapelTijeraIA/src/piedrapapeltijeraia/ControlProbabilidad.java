package piedrapapeltijeraia;

/* Definiendo los valores de
    0.- piedra
    1.- papel
    2.- tijera
*/
public class ControlProbabilidad {
    float[] probs = new float[3];
    
    void probinicial(){
        probs[0] = 15;
        probs[1] = 60;
        probs[2] = 15;
    }
    
    void cambio(int id){
        float totaldif = 0;
        
        for(int i=0 ; i<3 ; i++){
            if (i != id){
                probs[i] = probs[i] / 2;
                totaldif += probs[i];
            }
        }
        
        probs[id] += totaldif;
        
    }
    
    void mostrarProbs(){
        System.out.println("Probabilidades: ");
        for(int i = 0 ; i < 3 ; i++){
            System.out.println(i+1 + ": " + probs[i]);
        }
    }
    
    float[] probas(){
        return probs;
    }
    
    public static void main(String[] args) {
        ControlProbabilidad obj = new ControlProbabilidad();
        
        obj.probinicial();
        obj.mostrarProbs();
        obj.cambio(0);
        obj.mostrarProbs();      
                
    }
    
    
    
}
