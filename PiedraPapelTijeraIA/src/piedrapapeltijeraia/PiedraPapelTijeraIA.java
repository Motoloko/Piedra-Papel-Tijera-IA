/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package piedrapapeltijeraia;

import java.awt.*;
import javax.swing.*;


public class PiedraPapelTijeraIA{

    Jugador j1 = new Jugador();
    Jugador j2 = new Jugador();
    
    juegon me = new juegon();
    
    ImageIcon menu = new ImageIcon("menu.jpg");
    ImageIcon jugar = new ImageIcon("jugar.jpg");
    ImageIcon juego = new ImageIcon("juego.png");
    ImageIcon wait = new ImageIcon("wait.png");
    ImageIcon cero = new ImageIcon("0.png");
    ImageIcon uno = new ImageIcon("1.png");
    ImageIcon dos = new ImageIcon("dos.png");
    ImageIcon wait2 = new ImageIcon("wait2.png");
    
    int[] guarMano1 = new int [3];
    int[] guarMano2 = new int [3];
    int j1pie=0, j1pap=0, j1tij=0;
    int j2pie=0, j2pap=0, j2tij=0;
    int empate=0, maxj1=0, maxj2=0;
    

    
    void jugar(){
        j1.mano();
        j2.mano();
        
        int m1 = 0,m2=0;
        
        
        
        System.out.println("El jugador 1 eligio: " + j1.regMano());
        
        System.out.println("El jugador 2 eligio: " + j2.regMano());
        m1=j1.regMano();
        m2=j2.regMano();
        
        ImageIcon mano1, mano2;
        
        
        
        System.out.println(String.valueOf(m1));
        me.jButton1.setIcon(new ImageIcon("piedrapapeltijeraia.imagenes\0.png"));
        
        
        //me.jButton1.setIcon(new javax.swing.ImageIcon(cero));
        //Formas de ganar el jugador 1
        me.jTextArea1.append("\n\t----------Ronda---------\n");
        if(j1.regMano()== 0 && j2.regMano() == 2){
            j1pie++;
            guarMano1[0]=j1pie;
            //jButton2.setIcon(papel);
            //jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\JuanJose\\Pictures\\piedra.png"));
            System.out.println("Gano el jugador 1\n");
            me.jTextArea1.append("\tGano el jugador 1\n");
        }
        else if(j1.regMano()== 1 && j2.regMano() == 0){
            j1pap++;
            guarMano1[1]=j1pap;
            
            System.out.println("Gano el jugador 1\n");
            me.jTextArea1.append("\tGano el jugador 1\n");
        }
        else if(j1.regMano()== 2 && j2.regMano() == 1){
            j1tij++;
            guarMano1[2]=j1tij;
            System.out.println("Gano el jugador 1\n");
            me.jTextArea1.append("\tGano el jugador 1\n");
        }
        //Formas de ganar el jugador 2
        else if(j2.regMano()== 0 && j1.regMano() == 2){
            j2pie++;
            guarMano2[0]=j2pie;
            System.out.println("Gano el jugador 2\n");
            me.jTextArea1.append("\tGano el jugador 2\n");
        }
        else if(j2.regMano()== 1 && j1.regMano() == 0){
            j2pap++;
            guarMano2[1]=j2pap;
            System.out.println("Gano el jugador 2\n");
            me.jTextArea1.append("\tGano el jugador 2\n");
        }
        else if(j2.regMano()== 2 && j1.regMano() == 1){
            j2tij++;
            guarMano2[2]=j2tij;
            System.out.println("Gano el jugador 2\n");
            me.jTextArea1.append("\tGano el jugador 2\n");
        }
        else{
            System.out.println("Quedaron empate\n");
            me.jTextArea1.append("\tQuedaron empate\n");
            empate++;
         
        
        }
            
        //me.jTextArea1.append("\t---------------Juego------------\n");
        //j1.control.cambio(j2.regMano());
        //j2.control.cambio(j1.regMano());
        
        //j1.control.mostrarProbs();
        //j2.control.mostrarProbs();
    }
    public void mejor(){
        //mejor del J1
        if((guarMano1[0]>guarMano1[1]) && (guarMano1[0]>guarMano1[2])){
            maxj1=0;
        }
        else if(guarMano1[1]>guarMano1[2]){
            maxj1=1;
        }
        else{
            maxj1=2;
        }
        System.out.println("El jugador 1 gano mas veces con "+maxj1+"\n");
        //mejor del J2
        if((guarMano2[0]>guarMano2[1]) && (guarMano2[0]>guarMano2[2])){
            maxj2=0;
        }
        else if(guarMano2[1]>guarMano2[2]){
            maxj2=1;
        }
        else{
            maxj2=2;
        }
        System.out.println("El jugador 2 gano mas veces con "+maxj2+"\n");
        
    }
    
    public void cambiarPro(){
        j1.control.cambio(maxj2);
        j2.control.cambio(maxj1);
        j1.control.mostrarProbs();
        j2.control.mostrarProbs();
    }

   



 public static void main(String[] args) {
        //m.setVisible(true);
        
         PiedraPapelTijeraIA juego = new PiedraPapelTijeraIA();
        juego.me.setVisible(true);
        for(int j=0 ; j < 3; j++){
            for (int i = 0; i < 10; i++) {
                System.out.println("Juego " + (i+1));
                
                juego.jugar();
                
            }
            
            juego.mejor();
            juego.cambiarPro();
            
            
        }
        
        
        /*juegon
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new juegon().setVisible(true);
            }
        });
        */
        //juego.m.jButton1.setIcon(juego.cero);
        
    }
}
