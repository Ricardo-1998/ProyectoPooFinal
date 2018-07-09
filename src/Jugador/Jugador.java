
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugador;

import Misiones.Misiones;
import java.util.ArrayList;

/**
 *
 * @author javie
 */
public class Jugador {
    private String nombre = "Mir";
    private int vidaTotal = 20,magiaTotal = 20,magiaActual = 20,vidaActual = 20,resistencia=0;
    private int ataque = 50,experiencia = 0,nivel = 1;
    private ArrayList <Objetos> items = new ArrayList<>();
    private ArrayList <Objetos> arma = new ArrayList<>();
    private ArrayList <Objetos> armadura = new ArrayList<>();
    private ArrayList <Magia> magiaBloqueada = new ArrayList<>();
    private ArrayList <Magia> magiaDesbloqueada = new ArrayList<>();
    private ArrayList <Magia> magiaEquipada = new ArrayList<>();
    private ArrayList <Misiones> MisionesCompletadas = new ArrayList<>();
    private ArrayList <Misiones> MisionesIncompletadas = new ArrayList<>();
    private int dinero=1000;
    private int contadorColmillo=0,contadorShaguma=0,contadorAtila=0,contadorUnsahganasi=0,contadorKanna=0,contadorBoss=0;
    private static Jugador instance;
    
    public synchronized static Jugador getInstance(){
        if(instance == null){
            instance = new Jugador();
        }
        return instance;
    }
    
    
    public ArrayList <Misiones> getMisionesCompletadas(){
        return this.MisionesCompletadas;
    }
    
    public int getContadorShaguma() {
        return contadorShaguma;
    }

    public void setContadorShaguma(int contadorShaguma) {
        this.contadorShaguma = contadorShaguma;
    }

    public int getContadorColmillo() {
        return contadorColmillo;
    }

    public void setContadorColmillo(int contadorColmillo) {
        this.contadorColmillo = contadorColmillo;
    }

    public int getContadorAtila() {
        return contadorAtila;
    }

    public void setContadorAtila(int contadorAtila) {
        this.contadorAtila = contadorAtila;
    }

    public int getContadorUnsahganasi() {
        return contadorUnsahganasi;
    }

    public void setContadorUnsahganasi(int contadorUnsahganasi) {
        this.contadorUnsahganasi = contadorUnsahganasi;
    }

    public int getContadorKanna() {
        return contadorKanna;
    }

    public void setContadorKanna(int contadorKanna) {
        this.contadorKanna = contadorKanna;
    }

    public int getContadorBoss() {
        return contadorBoss;
    }

    public void setContadorBoss(int contadorBoss) {
        this.contadorBoss = contadorBoss;
    }
    
    
    
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

    public ArrayList<Objetos> getItems() {
        return items;
    }

    public void setItems(ArrayList<Objetos> items) {
        this.items = items;
    }

    public int getMagiaTotal() {
        return magiaTotal;
    }

    public void setMagiaTotal(int magiaTotal) {
        this.magiaTotal = magiaTotal;
    }

    public int getMagiaActual() {
        return magiaActual;
    }

    public void setMagiaActual(int magiaActual) {
        this.magiaActual = magiaActual;
    }

    public ArrayList<Magia> getMagiaBloqueada() {
        return magiaBloqueada;
    }

    public void setMagiaBloqueada(ArrayList<Magia> magiaBloqueada) {
        this.magiaBloqueada = magiaBloqueada;
    }

    public ArrayList<Magia> getMagiaDesbloqueada() {
        return magiaDesbloqueada;
    }

    public void setMagiaDesbloqueada(ArrayList<Magia> magiaDesbloqueada) {
        this.magiaDesbloqueada = magiaDesbloqueada;
    }

    public ArrayList<Magia> getMagiaEquipada() {
        return magiaEquipada;
    }

    public void setMagiaEquipada(ArrayList<Magia> magiaEquipada) {
        this.magiaEquipada = magiaEquipada;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getNivel() {
        return nivel;
    }
    
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getArmadura() {
        return resistencia;
    }

    public void setArmadura(int armadura) {
        this.resistencia = armadura;
    }
    
    public Jugador(){
        CrearMagia();
        CrearMisiones();
    }
    
    public void AgregarObjeto(Objetos obj){
        System.out.println(obj.getAtributo());
        System.out.println(obj.getNombre());
        if(alcanzaDinero(obj)){
            items.add(obj);
            System.out.println(items.get(0));
        }
        else{
            System.out.println("No te alcanza");
        }
        
    }
    
    public boolean alcanzaDinero(Objetos obj){
        if(obj.getCosto() <= dinero){
            System.out.println(dinero);
            dinero = dinero - obj.getCosto();
            System.out.println(dinero);
            return true;
        }
        return false;
    }
    
    public void LevelUp(){
        while(experiencia>=100){
            if(this.experiencia >= 100){
                this.experiencia =  this.experiencia -100;
                this.nivel++;
                this.vidaTotal = this.vidaTotal+20;
                this.vidaActual = this.vidaActual+20;
                this.magiaTotal = this.magiaTotal + 5;
                this.magiaActual = this.magiaActual + 5;
                MagiaDesbloqueada();
            }
        }
    }
    
    public void CrearMagia(){
        Magia s1,s2,s3,s4,s5; 
        s1 = new Magia("Ice",60,5,2);
        magiaBloqueada.add(s1);
        s1 = new Magia("Holy",120,7,4);
        magiaBloqueada.add(s1);
        s1 = new Magia("Fire",180,9,6);
        magiaBloqueada.add(s1);
        s1 = new Magia("Bolt",240,11,8);
        magiaBloqueada.add(s1);
        s1 = new Magia("Aero",300,13,10);
        magiaBloqueada.add(s1);
    }
    
    public void MagiaDesbloqueada(){
        for(int x=0;x<this.magiaBloqueada.size();x++){
            if(this.magiaBloqueada.get(x).getNivel()== this.nivel){
                this.magiaDesbloqueada.add(this.magiaBloqueada.get(x));
            }
        }
    }
    
    public void EquiparMagia(String nombre){
        for(int x=0;x<this.magiaDesbloqueada.size();x++){
            if(this.magiaDesbloqueada.get(x).getName().equals(nombre)){
                if(magiaEquipada.isEmpty()){
                    this.magiaEquipada.add(this.magiaDesbloqueada.get(x));
                }
                else{
                    this.magiaEquipada.remove(0);
                    this.magiaEquipada.add(this.magiaDesbloqueada.get(x));
                }
            }
        }
    }
    
    public void Mision(String nombre){
        switch(nombre){
            case "colmillo sangriento":
                this.contadorColmillo++;
                break;
            case "shaguma":
                this.contadorShaguma++;
                break;
            case "atila":
                this.contadorAtila++;
                break;
            case "unsahganasi":
                this.contadorUnsahganasi++;
                break;
            case "kanna kamuy green":
                this.contadorKanna++;
                break;
            case "kanna kamuy blue":
                this.contadorBoss++;
                break;
            case "kanna kamuy red":
                this.contadorBoss++;
                break;
        }
    }
    
    public void CrearMisiones(){
        Misiones m,n,b,v,c,x;
        m = new Misiones("mision1",false,100);
        this.MisionesIncompletadas.add(m);
        n = new Misiones("mision2",false,100);
        this.MisionesIncompletadas.add(n);
        b = new Misiones("mision3",false,100);
        this.MisionesIncompletadas.add(b);
        v = new Misiones("mision4",false,100);
        this.MisionesIncompletadas.add(v);
        c = new Misiones("mision5",false,100);
        this.MisionesIncompletadas.add(c);
        x = new Misiones("mision6",false,500);
        this.MisionesIncompletadas.add(x);
    }
    public void VerificarMisiones(){
       for(int i = 0; i<this.MisionesIncompletadas.size();i++){
           switch(this.MisionesIncompletadas.get(i).getNombreMision()){
               case "mision1":
                   if(10<=this.contadorShaguma){
                       this.MisionesCompletadas.add(this.MisionesIncompletadas.get(i));
                       this.MisionesIncompletadas.remove(i);
                   }
                   break;
               case "mision2":
                   if(10<=this.contadorAtila){
                       this.MisionesCompletadas.add(this.MisionesIncompletadas.get(i));
                       this.MisionesIncompletadas.remove(i);
                   }
                   break;
               case "mision3":
                   if(10<=this.contadorUnsahganasi){
                       this.MisionesCompletadas.add(this.MisionesIncompletadas.get(i));
                       this.MisionesIncompletadas.remove(i);
                   }
                   break;
               case "mision4":
                   if(10<=this.contadorKanna){
                       this.MisionesCompletadas.add(this.MisionesIncompletadas.get(i));
                       this.MisionesIncompletadas.remove(i);
                   }
                   break;
               case "mision5":
                   if(10<=this.contadorColmillo){
                       this.MisionesCompletadas.add(this.MisionesIncompletadas.get(i));
                       this.MisionesIncompletadas.remove(i);
                   }
                   break;
               case "mision6":
                   if(2<=this.contadorBoss){
                       this.MisionesCompletadas.add(this.MisionesIncompletadas.get(i));
                       this.MisionesIncompletadas.remove(i);
                   }
                   break;
           }
       }
        
    
    }
    
    public void Equipar(Objetos o,String tipo){
        switch(tipo){
            case "armadura":
                if(this.armadura.isEmpty()){
                    this.armadura.add(o);
                    this.resistencia = this.armadura.get(0).getAtributo();
                }
                else{
                    this.armadura.remove(0);
                    this.armadura.add(o);
                    this.resistencia = this.armadura.get(0).getAtributo();
                }
            case "arma":
                if(this.arma.isEmpty()){
                    this.arma.add(o);
                    this.ataque = this.ataque + this.arma.get(0).getAtributo();
                }
                else{
                    this.arma.remove(0);
                    this.arma.add(o);
                    this.ataque = this.ataque + this.arma.get(0).getAtributo();
                }
        }
    }
    
    public int ContarCantidadObjetos(String nombre){
        
        if(!items.isEmpty()){
            for(int i=0;i< items.size();i++){
                if(items.get(i).getNombre() ==nombre){
                    return items.get(i).getCantidad();
                }        
            }
        }
        
        return 0;
    
    }   
    
}
