package piedrapapeltijeraia;

/* Definiendo los valores de
    0.- piedra
    1.- papel
    2.- tijera
*/
public class ControlProbabilidad {
    float[] probs = new float[3];
    float[] probsT = new float[3];

    public ControlProbabilidad() {
        probinicial();
        probT();
    }
    
    public void probinicial(){
        probs[0] = 30;
        probs[1] = 30;
        probs[2] = 30;
    }
    
    void probT(){
        probsT[0] = probs[0];
        probsT[1] = probsT[0] + probs[1];
        probsT[2] = probsT[1] + probs[2];
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
        probT();
    }
    
    void mostrarProbs(){
        System.out.println("Probabilidades: ");
        for(int i = 0 ; i < 3 ; i++){
            System.out.println(i+1 + ": " + probs[i]);
        }
    }
    
    float[] probas(){
        return probsT;
    }
    
    public static void main(String[] args) {
        ControlProbabilidad obj = new ControlProbabilidad();
        
        obj.probinicial();
        obj.mostrarProbs();
        obj.cambio(2);
        obj.mostrarProbs();
        System.out.println("probt 2 " + obj.probsT[1]);
                
    }
    
    
    
}
