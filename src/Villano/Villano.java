/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Villano;

import static java.lang.Math.random;

/**
 *
 * @author javie
 */
public class Villano {
    private String nombre;
    private int vidaTotal;
    private int vidaActual,ataque,exp;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVidaTotal() {
        return vidaTotal;
    }

    public void setVidaTotal(int vidaTotal) {
        this.vidaTotal = vidaTotal;
    }

    public int getVidaActual() {
        return vidaActual;
    }

    public void setVidaActual(int vidaActual) {
        this.vidaActual = vidaActual;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
    
    public Villano(boolean boss,int n){
        if(boss){
            GenerarBoss(n);
        }
        else{
            GeneradorVillanos();
        }
    }
    
    public void GenerarBoss(int n){
        if(n==1){
            this.nombre ="kanna kamuy red";
        }
        else{
            this.nombre= "kanna kamuy blue";
        }
        this.ataque = 8;
        this.vidaTotal = 1000;
        this.vidaActual = this.vidaTotal;
        this.exp = 100;
        
    }
    
    public void GeneradorVillanos(){
        int n = (int)(random()*5)+1;
        int mounstroClaseB = (int)(random()*3)+1;
        int mounstroClaseA = (int)(random()*2)+1;
        switch(n){
            case 1:
            case 2:
            case 3:
            case 4:
                switch(mounstroClaseB){
                    case 1:
                        this.nombre = "colmillo sangriento";
                        this.ataque = 3;
                        this.vidaTotal = 150;
                        this.vidaActual = this.vidaTotal;
                        this.exp = 40;
                        break;
                    case 2:
                        this.nombre = "shaguma";
                        this.ataque = 1;
                        this.vidaTotal = 400;
                        this.vidaActual = this.vidaTotal;
                        this.exp = 50;
                        break;
                    case 3:
                        this.nombre = "atila";
                        this.ataque = 2;
                        this.vidaTotal = 250;
                        this.vidaActual = this.vidaTotal;
                        this.exp = 60;
                        break;
                }
                break;
            case 5:
                switch(mounstroClaseA){
                    case 1:
                        this.nombre = "unsahganasi";
                        this.ataque = 3;
                        this.vidaTotal = 400;
                        this.vidaActual = this.vidaTotal;
                        this.exp = 80;
                        break;
            
                    case 2:
                        this.nombre = "kanna kamuy green";
                        this.ataque = 5;
                        this.vidaTotal = 100;
                        this.vidaActual = this.vidaTotal;
                        this.exp = 80;
                        break;
                }
                break;
        }
        
    }
}
