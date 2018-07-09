/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugador;

import java.util.ArrayList;

/**
 *
 * @author javie
 */
public class Objetos {
    int Atributo;
    String Nombre;
    int costo, cantidad;
    Jugador player = new Jugador();

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public int getAtributo() {
        return Atributo;
    }

    public void setAtributo(int Atributo) {
        this.Atributo = Atributo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public int getCosto() {
        return costo;
    }
    
    public void setCosto(int costo) {
        this.costo = costo;
    }
    
    
    
}
