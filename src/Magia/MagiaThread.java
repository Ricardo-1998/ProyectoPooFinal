/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Magia;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author javie
 */
public class MagiaThread extends Thread{
    private final int  x,y;
    private final JLabel animacion;
    private  ImageIcon icono,icono2,icono3,icono4;
    
    public MagiaThread(JLabel animacion,int x,int y,ImageIcon icono,ImageIcon icono2,ImageIcon icono3){
        this.x = x;
        this.y = y;
        this.animacion = animacion;
        this.icono = icono;
        this.icono2 = icono2;
        this.icono3 = icono3;
    }
   
    
    @Override
    public void run(){
        int contador = 0;
        while(contador<=9){
            switch(contador){
                case 0:
                    this.animacion.setIcon(icono);
                    this.animacion.setLocation(x,y);
                    break;
                case 1:
                    this.animacion.setIcon(icono2);
                    this.animacion.setLocation(x, y);
                    break;     
                case 2:
                    this.animacion.setIcon(icono3);
                    this.animacion.setLocation(x,y);
                    break;
                case 3:
                    this.animacion.setIcon(icono);
                    this.animacion.setLocation(x,y);
                    break;
                case 4:
                    this.animacion.setIcon(icono2);
                    this.animacion.setLocation(x,y);
                    break;
                case 5:
                    this.animacion.setIcon(icono3);
                    this.animacion.setLocation(x,y);
                    break;
                case 6:
                    this.animacion.setIcon(icono);
                    this.animacion.setLocation(x,y);
                    break;
                case 7:
                    this.animacion.setIcon(icono2);
                    this.animacion.setLocation(x,y);
                    break;
                case 8:
                    this.animacion.setIcon(icono3);
                    this.animacion.setLocation(x,y);
                    break;
                case 9:
                    this.animacion.setIcon(icono4);
                    this.animacion.setLocation(x,y);
                    break;
            }
            
            try {
                sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(MagiaThread.class.getName()).log(Level.SEVERE, null, ex);
            }
               
            contador++;
        }
    }
    
}
