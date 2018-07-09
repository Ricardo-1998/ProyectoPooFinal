/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Misiones;

import Jugador.Jugador;

/**
 *
 * @author Ricardo Villeda
 */
public class Misiones {
   
    private String nombreMision;
    private boolean estadoMision;
    private int recompensa, avance = 0, totMounstros=10, totJefes=2;
    
    public Misiones() {
    }

    public Misiones(String mision1, boolean b, int i) {
        this.nombreMision = mision1;
        this.estadoMision = b;
        this.recompensa = i;
    }

    public int getAvance() {
        return avance;
    }

    public void setAvance(int avance) {
        this.avance = avance;
    }
    
    public int getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(int recompensa) {
        this.recompensa = recompensa;
    }
    

    public String getNombreMision() {
        return nombreMision;
    }

    public void setNombreMision(String nombreMision) {
        this.nombreMision = nombreMision;
    }

    public boolean isEstadoMision() {
        return estadoMision;
    }

    public void setEstadoMision(boolean estadoMision) {
        this.estadoMision = estadoMision;
    }

    public int getTotMounstros() {
        return totMounstros;
    }

    public int getTotJefes() {
        return totJefes;
    }
    
}
