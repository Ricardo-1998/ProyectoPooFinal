/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos.Items;

/**
 *
 * @author Ricardo Villeda
 */
public class Anillo implements Items{
    String nombre = "Anillo";
    int atributo = 3;
    int costo = 15;
    int cantidad = 0;
    @Override
    public int getCantidad() {
        return cantidad;
    }
    @Override
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    @Override
    public int getCosto() {
        return costo;
    }
    
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getAtributo() {
        return atributo;
    }

    

   

    
}
