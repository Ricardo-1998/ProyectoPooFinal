/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Jugador.Jugador;
import Magia.MagiaThread;
import Villano.Villano;
import java.awt.Color;
import java.awt.TextArea;
import static java.lang.Math.random;
/**
 *
 * @author javie
 */
public class VentanaBatalla extends JFrame{
    private final int   widthB = 250,heightB = 30;
    private final JButton buttonAtaque, buttonMagia, buttonObjetos, buttonCorrer, buttonEnemigo1,buttonEnemigo2,buttonEnemigo3,buttonEnemigo4,buttonRegresar,Continuar,pocionesHP,pocionesMP;
    private final JButton megaHP,megaMP;
    private final JLabel nombreJugador,vidaJugador,manaJugador,nombreVillano1,vidaVillano1,nombreVillano2,vidaVillano2,fondo,personaje,villano1,villano2,fondoB,magia;  
    private final ImageIcon fondoBatalla,imagenPersonaje,imagenEnemigo1,imagenEnemigo2;
    private ImageIcon fondoBoton,magia1,magia2,magia3;
    private TextArea infoBatalla;
    private String lugarDeBatalla = "mapa5.png";
    public MagiaThread procesomagica;

    public String getLugarDeBatalla() {
        return lugarDeBatalla;
    }

    public void setLugarDeBatalla(String lugarDeBatalla) {
        this.lugarDeBatalla = lugarDeBatalla;
    }

    
    public VentanaBatalla(Jugador j,boolean boss){
        Villano v = new Villano(boss,1);
        Villano s = new Villano(boss,2);
        //Imagen 
        if(!j.getMagiaEquipada().isEmpty()){
            magia1 = new ImageIcon(getClass().getResource("/Magia/"+j.getMagiaEquipada().get(0).getName()+"1.png"));
            magia2 = new ImageIcon(getClass().getResource("/Magia/"+j.getMagiaEquipada().get(0).getName()+"2.png"));
            magia3 = new ImageIcon(getClass().getResource("/Magia/"+j.getMagiaEquipada().get(0).getName()+"3.png"));
        }
        
        magia = new JLabel();
        magia.setBounds(0,0,150,150);
        add(magia);
        
        fondoBatalla = new ImageIcon(getClass().getResource("/Imagenes/"+lugarDeBatalla));
        fondo = new JLabel(fondoBatalla);
        fondo.setBounds(0,0,900,500);
        
        fondoBoton = new ImageIcon(getClass().getResource("/Imagenes/fondoBotones.png"));
        fondoB = new JLabel(fondoBoton);
        fondoB.setBounds(0,500,500,200);
        
        imagenPersonaje = new ImageIcon(getClass().getResource("/Imagenes/jugador.png"));
        personaje = new JLabel(imagenPersonaje);
        personaje.setBounds(700,250,100,100);
        
        imagenEnemigo1 = new ImageIcon(getClass().getResource("/Imagenes/"+v.getNombre()+".png"));
        villano1 = new JLabel(imagenEnemigo1);
        villano1.setBounds(25,150,150,150);
        
        imagenEnemigo2 = new ImageIcon(getClass().getResource("/Imagenes/"+s.getNombre()+".png"));
        villano2 = new JLabel(imagenEnemigo2);
        villano2.setBounds(100,300,150,150);
        
        //
        infoBatalla = new TextArea();
        infoBatalla.isOpaque();
        infoBatalla.setBackground(new Color(86,10,216));
        infoBatalla.setBounds(500, 500, 400,200);
        add(infoBatalla);
        infoBatalla.disable();
        
        //Botones
        megaHP = new JButton();
        fondoBoton = new ImageIcon(getClass().getResource("/Imagenes/botonHP+.png"));
        megaHP.setIcon(fondoBoton);
        megaHP.setBounds(new Rectangle(5,571,145,33));
        
        megaMP = new JButton();
        fondoBoton = new ImageIcon(getClass().getResource("/Imagenes/botonMP+.png"));
        megaMP.setIcon(fondoBoton);
        megaMP.setBounds(new Rectangle(5,604,145,33));
        
        buttonAtaque = new JButton();
        fondoBoton = new ImageIcon(getClass().getResource("/Imagenes/botonAtacar.png"));
        buttonAtaque.setIcon(fondoBoton);
        buttonAtaque.setBounds(new Rectangle(5,505,145,33));
        
        buttonMagia = new JButton();
        fondoBoton = new ImageIcon(getClass().getResource("/Imagenes/botonMagia.png"));
        buttonMagia.setIcon(fondoBoton);
        buttonMagia.setBounds(new Rectangle(5,538,145,33));
        
        buttonObjetos = new JButton();
        fondoBoton = new ImageIcon(getClass().getResource("/Imagenes/botonObjetos.png"));
        buttonObjetos.setIcon(fondoBoton);
        buttonObjetos.setBounds(new Rectangle(5,571,145,33));
        
        pocionesHP = new JButton();
        fondoBoton = new ImageIcon(getClass().getResource("/Imagenes/botonHP.png"));
        pocionesHP.setIcon(fondoBoton);
        pocionesHP.setBounds(new Rectangle(5,505,145,33));
        
        pocionesMP = new JButton();
        fondoBoton = new ImageIcon(getClass().getResource("/Imagenes/botonMP.png"));
        pocionesMP.setIcon(fondoBoton);
        pocionesMP.setBounds(new Rectangle(5,538,145,33));
        
        buttonCorrer = new JButton();
        fondoBoton = new ImageIcon(getClass().getResource("/Imagenes/botonEscapar.png"));
        buttonCorrer.setIcon(fondoBoton);
        buttonCorrer.setBounds(new Rectangle(5,604,145,33));
        
        buttonRegresar = new JButton();
        fondoBoton = new ImageIcon(getClass().getResource("/Imagenes/botonRegresar.png"));
        buttonRegresar.setIcon(fondoBoton);
        buttonRegresar.setBounds(new Rectangle(155,604,145,33));
               
        buttonEnemigo1 = new JButton();
        fondoBoton = new ImageIcon(getClass().getResource("/Imagenes/boton "+v.getNombre()+".png"));
        buttonEnemigo1.setIcon(fondoBoton);
        buttonEnemigo1.setBounds(new Rectangle(5,505,145,33));
        
        buttonEnemigo2 = new JButton();
        fondoBoton = new ImageIcon(getClass().getResource("/Imagenes/boton "+s.getNombre()+".png"));
        buttonEnemigo2.setIcon(fondoBoton);
        buttonEnemigo2.setBounds(new Rectangle(5,538,145,33));
        
        buttonEnemigo3 = new JButton();
        fondoBoton = new ImageIcon(getClass().getResource("/Imagenes/boton "+v.getNombre()+".png"));
        buttonEnemigo3.setIcon(fondoBoton);
        buttonEnemigo3.setBounds(new Rectangle(5,505,145,33));
        
        buttonEnemigo4 = new JButton();
        fondoBoton = new ImageIcon(getClass().getResource("/Imagenes/boton "+s.getNombre()+".png"));
        buttonEnemigo4.setIcon(fondoBoton);
        buttonEnemigo4.setBounds(new Rectangle(5,538,145,33));
        
        Continuar = new JButton();
        fondoBoton = new ImageIcon(getClass().getResource("/Imagenes/continuar.png"));
        Continuar.setIcon(fondoBoton);
        Continuar.setBounds(new Rectangle(5,505,145,33));
        
        //Nombres,vida
        nombreJugador = new JLabel(j.getNombre());
        nombreJugador.setBounds(160,500,widthB,heightB);
        nombreJugador.setFont(new java.awt.Font("Arial", 1, 20));  
        nombreJugador.setForeground(new java.awt.Color(255, 255, 255));
        
        nombreVillano1 = new JLabel(v.getNombre());
        nombreVillano1.setBounds(160,500,widthB,heightB);
        nombreVillano1.setFont(new java.awt.Font("Arial", 1, 20));  
        nombreVillano1.setForeground(new java.awt.Color(255, 255, 255));
        
        nombreVillano2 =  new JLabel(s.getNombre());
        nombreVillano2.setBounds(160,525,widthB,heightB);
        nombreVillano2.setFont(new java.awt.Font("Arial", 1, 20));  
        nombreVillano2.setForeground(new java.awt.Color(255, 255, 255));
  
        vidaJugador = new JLabel("HP: "+j.getVidaActual()+" / "+j.getVidaTotal());
        vidaJugador.setBounds(300,500,widthB,heightB);
        vidaJugador.setFont(new java.awt.Font("Arial", 1, 20));  
        vidaJugador.setForeground(new java.awt.Color(255, 255, 255));
        
        manaJugador = new JLabel("MP: "+j.getMagiaActual()+" / "+j.getMagiaTotal());
        manaJugador.setBounds(300,525,widthB,heightB);
        manaJugador.setFont(new java.awt.Font("Arial", 1, 20));  
        manaJugador.setForeground(new java.awt.Color(255, 255, 255));
        
        vidaVillano1 = new JLabel("HP: "+v.getVidaActual()+" / "+v.getVidaTotal());
        vidaVillano1.setBounds(350,500,widthB,heightB);
        vidaVillano1.setFont(new java.awt.Font("Arial", 1, 20));  
        vidaVillano1.setForeground(new java.awt.Color(255, 255, 255));
        
        vidaVillano2 = new JLabel("HP: "+s.getVidaActual()+" / "+s.getVidaTotal());
        vidaVillano2.setBounds(350,525,widthB,heightB);
        vidaVillano2.setFont(new java.awt.Font("Arial", 1, 20));  
        vidaVillano2.setForeground(new java.awt.Color(255, 255, 255));
            
        buttonAtaque.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuInvisible();
                buttonRegresar.setVisible(true);
                if(v.getVidaActual()>0 && s.getVidaActual()>0){
                    buttonEnemigo1.setVisible(true);
                    nombreVillano1.setVisible(true);
                    vidaVillano1.setVisible(true);
                    buttonEnemigo2.setVisible(true);
                    nombreVillano2.setVisible(true);
                    vidaVillano2.setVisible(true);
                }
                if(v.getVidaActual()>0 && s.getVidaActual()<=0){
                    buttonEnemigo1.setVisible(true);
                    nombreVillano1.setVisible(true);
                    vidaVillano1.setVisible(true);
                }
                if(s.getVidaActual()>0 && v.getVidaActual()<=0){
                    buttonEnemigo2.setVisible(true);
                    nombreVillano2.setVisible(true);
                    vidaVillano2.setVisible(true);
                }
            }
        });
        
        buttonMagia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if(j.getMagiaEquipada().isEmpty()){
                    infoBatalla.insert("No tienes equipado ningun ataque magico\n", 0);
                }
                else{
                    if(j.getMagiaActual()>=j.getMagiaEquipada().get(0).getCosto()){
                        MenuInvisible();
                        buttonRegresar.setVisible(true);
                        if(v.getVidaActual()>0 && s.getVidaActual()>0){
                            buttonEnemigo3.setVisible(true);
                            nombreVillano1.setVisible(true);
                            vidaVillano1.setVisible(true);
                            buttonEnemigo4.setVisible(true);
                            nombreVillano2.setVisible(true);
                            vidaVillano2.setVisible(true);
                        }
                        if(v.getVidaActual()>0 && s.getVidaActual()<=0){
                            buttonEnemigo3.setVisible(true);
                            nombreVillano1.setVisible(true);
                            vidaVillano1.setVisible(true);
                        }
                        if(s.getVidaActual()>0 && v.getVidaActual()<=0){
                            buttonEnemigo4.setVisible(true);
                            nombreVillano2.setVisible(true);
                            vidaVillano2.setVisible(true);
                        }
                    }
                    else{
                        infoBatalla.insert("No tienes la suficiente magia\n", 0);
                    }
                }
            }
        });
               
        buttonObjetos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                MenuInvisible();
                if(j.getItems().isEmpty()){
                    infoBatalla.insert("No tienes objetos\n",0);
                    MenuVisible();
                }
                else{
                    pocionesMP.setVisible(true);
                    pocionesHP.setVisible(true);
                    megaHP.setVisible(true);
                    megaMP.setVisible(true);
                    buttonRegresar.setVisible(true);
                }
                
            }
        });
        
        pocionesHP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                boolean b = false;
                int contador = 0;
                pocionesMP.setVisible(false);
                pocionesHP.setVisible(false);
                megaHP.setVisible(false);
                megaMP.setVisible(false);
                buttonRegresar.setVisible(false);
                while(!b || contador-1 == j.getItems().size()){
                    if(j.getItems().get(contador).getNombre().equals("PocionHP")){
                        j.setVidaActual(j.getVidaActual()+j.getItems().get(contador).getAtributo());
                        if(j.getVidaActual()>j.getVidaTotal()){
                            j.setVidaActual(j.getVidaTotal());
                        }
                        j.getItems().remove(contador);
                        b = true;
                    }
                    contador++;
                }
                if(!b){
                    infoBatalla.insert("No tiene pociones de hp\n", 0);
                }
                MenuVisible();
            }
        });
        
        pocionesMP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                boolean b = false;
                int contador = 0;
                pocionesMP.setVisible(false);
                pocionesHP.setVisible(false);
                megaHP.setVisible(false);
                megaMP.setVisible(false);
                buttonRegresar.setVisible(false);
                while(!b || contador-1 == j.getItems().size()){
                    if(j.getItems().get(contador).getNombre().equals("PocionMP")){
                        j.setMagiaActual(j.getMagiaActual()+j.getItems().get(contador).getAtributo());
                        if(j.getMagiaActual()>j.getMagiaTotal()){
                            j.setMagiaActual(j.getMagiaTotal());
                            
                        }
                        j.getItems().remove(contador);
                        b = true;
                    }
                    contador++;
                 }
                if(!b){
                    infoBatalla.insert("No tiene pociones de mp\n", 0);
                }
                MenuVisible();
            }
        });
        
        megaHP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                boolean b = false;
                int contador = 0;
                pocionesMP.setVisible(false);
                pocionesHP.setVisible(false);
                megaHP.setVisible(false);
                megaMP.setVisible(false);
                buttonRegresar.setVisible(false);
                while(!b || contador-1 == j.getItems().size()){
                    if(j.getItems().get(contador).getNombre().equals("MegaHP")){
                        j.setVidaActual(j.getVidaActual()+j.getItems().get(contador).getAtributo());
                        if(j.getVidaActual()>j.getVidaTotal()){
                            j.setVidaActual(j.getVidaTotal());
                        }
                        j.getItems().remove(contador);
                        b = true;
                    }
                    contador++;
                }
                if(!b){
                    infoBatalla.insert("No tiene pociones de hp\n", 0);
                }
                MenuVisible();
            }
        });
        
        megaMP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                boolean b = false;
                int contador = 0;
                pocionesMP.setVisible(false);
                pocionesHP.setVisible(false);
                megaHP.setVisible(false);
                megaMP.setVisible(false);
                buttonRegresar.setVisible(false);
                while(!b || contador-1 == j.getItems().size()){
                    if(j.getItems().get(contador).getNombre().equals("MegaMP")){
                        j.setMagiaActual(j.getMagiaActual()+j.getItems().get(contador).getAtributo());
                        if(j.getMagiaActual()>j.getMagiaTotal()){
                            j.setMagiaActual(j.getMagiaTotal());
                            
                        }
                        j.getItems().remove(contador);
                        b = true;
                    }
                    contador++;
                 }
                if(!b){
                    infoBatalla.insert("No tiene pociones de mp\n", 0);
                }
                MenuVisible();
            }
        });
        
        buttonCorrer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n = (int)(random()*3)+1;
                if(boss){
                    infoBatalla.insert("No puedes escapar en esta batalla\n",0);
                }
                else{
                    if(n==3){
                        Atacado(j,v,s);
                        infoBatalla.insert("No has podido escapar\n", 0);
                    }
                    else{
                        infoBatalla.insert("Has logrado escapar\n", 0);
                        MenuInvisible();
                        Continuar.setVisible(true);
                    }
                }
            }
        });
        
        Continuar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        
        buttonEnemigo1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonEnemigo1.setVisible(false);
                buttonEnemigo2.setVisible(false);
                nombreVillano1.setVisible(false);
                vidaVillano1.setVisible(false);
                nombreVillano2.setVisible(false);
                vidaVillano2.setVisible(false);
                buttonRegresar.setVisible(false);
                v.setVidaActual(Atacar(j,v));
                if(v.getVidaActual()<=0){
                    villano1.setVisible(false);
                }
                
                vidaVillano1.setText("HP: "+v.getVidaActual()+" / "+v.getVidaTotal());
                Atacado(j,v,s);
            }
        });
        
        buttonEnemigo2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonEnemigo1.setVisible(false);
                buttonEnemigo2.setVisible(false);
                nombreVillano1.setVisible(false);
                vidaVillano1.setVisible(false);
                nombreVillano2.setVisible(false);
                vidaVillano2.setVisible(false);
                buttonRegresar.setVisible(false);
                s.setVidaActual(Atacar(j,s));
                if(s.getVidaActual()<=0){
                    villano2.setVisible(false);
                }
                vidaVillano2.setText("HP: "+s.getVidaActual()+" / "+s.getVidaTotal());
                Atacado(j,v,s);
            }
        });
        
        buttonEnemigo3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonEnemigo3.setVisible(false);
                buttonEnemigo4.setVisible(false);
                nombreVillano1.setVisible(false);
                vidaVillano1.setVisible(false);
                nombreVillano2.setVisible(false);
                vidaVillano2.setVisible(false);
                buttonRegresar.setVisible(false);
                
                procesomagica = new MagiaThread(magia,50,175,magia1,magia2,magia3);
                procesomagica.start();
                v.setVidaActual(AtaqueMagico(j,v));
                if(v.getVidaActual()<=0){
                    villano1.setVisible(false);
                }
                vidaVillano1.setText("HP: "+v.getVidaActual()+" / "+v.getVidaTotal());
                Atacado(j,v,s);
            }
        });
        
        buttonEnemigo4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonEnemigo3.setVisible(false);
                buttonEnemigo4.setVisible(false);
                nombreVillano1.setVisible(false);
                vidaVillano1.setVisible(false);
                nombreVillano2.setVisible(false);
                vidaVillano2.setVisible(false);
                buttonRegresar.setVisible(false);
                
                procesomagica = new MagiaThread(magia,130,325,magia1,magia2,magia3);
                procesomagica.start();
                
                s.setVidaActual(AtaqueMagico(j,s));
                if(s.getVidaActual()<=0){
                    villano2.setVisible(false);
                }
                vidaVillano2.setText("HP: "+s.getVidaActual()+" / "+s.getVidaTotal());
                Atacado(j,v,s);
            }
        });
        
        buttonRegresar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonEnemigo1.setVisible(false);
                buttonEnemigo2.setVisible(false);
                buttonEnemigo3.setVisible(false);
                buttonEnemigo4.setVisible(false);
                nombreVillano2.setVisible(false);
                pocionesHP.setVisible(false);
                pocionesMP.setVisible(false);
                vidaVillano2.setVisible(false);
                nombreVillano1.setVisible(false);
                vidaVillano1.setVisible(false);
                buttonRegresar.setVisible(false);
                MenuVisible();
            } 
        }); 
        
        add(Continuar);
        add(pocionesHP);
        add(pocionesMP);
        add(buttonAtaque);
        add(buttonMagia);
        add(buttonObjetos);
        add(buttonCorrer);
        add(nombreJugador);
        add(nombreVillano1);
        add(nombreVillano2);
        add(vidaVillano1);
        add(vidaVillano2);
        add(vidaJugador);
        add(manaJugador);
        add(personaje);
        add(villano1);
        add(villano2);
        add(buttonRegresar);
        add(fondo);
        add(buttonEnemigo1);
        add(buttonEnemigo2);
        add(buttonEnemigo3);
        add(buttonEnemigo4);
        add(fondoB);
        add(megaHP);
        add(megaMP);
        
        pocionesMP.setVisible(false);
        pocionesHP.setVisible(false);
        megaHP.setVisible(false);
        megaMP.setVisible(false);
        buttonEnemigo1.setVisible(false);
        buttonEnemigo2.setVisible(false);
        buttonEnemigo3.setVisible(false);
        buttonEnemigo4.setVisible(false);
        nombreVillano1.setVisible(false);
        vidaVillano1.setVisible(false);
        nombreVillano2.setVisible(false);
        vidaVillano2.setVisible(false);
        buttonRegresar.setVisible(false);
        Continuar.setVisible(false);
        setLayout(null);
        
    }
    
    public void MenuInvisible(){
        buttonAtaque.setVisible(false);
        buttonMagia.setVisible(false);
        buttonObjetos.setVisible(false);
        buttonCorrer.setVisible(false);
        nombreJugador.setVisible(false);
        vidaJugador.setVisible(false);
        manaJugador.setVisible(false);
    }
    
    public void MenuVisible(){
        buttonAtaque.setVisible(true);
        buttonMagia.setVisible(true);
        buttonObjetos.setVisible(true);
        buttonCorrer.setVisible(true);
        manaJugador.setVisible(true);
        nombreJugador.setVisible(true);
        vidaJugador.setVisible(true);
    }
    
    public int Atacar(Jugador j,Villano v){
        v.setVidaActual(v.getVidaActual()-j.getAtaque());
        if(v.getVidaActual()<=0){
            j.Mision(v.getNombre());
            j.VerificarMisiones();
            int dineroObtenido = (int)(random()*50)+25;
            infoBatalla.insert(v.getNombre()+" ha sido derrotado\n",0);
            j.setDinero(j.getDinero()+dineroObtenido);
            infoBatalla.insert("Se obtuvo "+dineroObtenido+" de oro\n",0);
            j.setExperiencia(j.getExperiencia()+v.getExp());
            infoBatalla.insert("Se obtuvo "+v.getExp()+" de experiencia\n",0);
            if(j.getExperiencia()>=100){
                j.LevelUp();
                infoBatalla.insert("Has subido al nivel "+j.getNivel()+"\n",0);
            }
        }
        return v.getVidaActual();
    }
    
    public int AtaqueMagico(Jugador j,Villano v){
        v.setVidaActual(v.getVidaActual()-j.getMagiaEquipada().get(0).getDaño());
        j.setMagiaActual(j.getMagiaActual()-j.getMagiaEquipada().get(0).getCosto());
        manaJugador.setText("MP: "+j.getMagiaActual()+" / "+j.getMagiaTotal());
        infoBatalla.insert("Has usado "+j.getMagiaEquipada().get(0).getName()+"\n", 0);
        if(v.getVidaActual()<=0){
            j.Mision(v.getNombre());
            j.VerificarMisiones();
            int dineroObtenido = (int)(random()*50)+25;
            infoBatalla.insert(v.getNombre()+" ha sido derrotado\n",0);
            j.setDinero(j.getDinero()+dineroObtenido);
            infoBatalla.insert("Se obtuvo "+dineroObtenido+" de oro\n",0);
            j.setExperiencia(j.getExperiencia()+v.getExp());
            infoBatalla.insert("Se obtuvo "+v.getExp()+" de experiencia\n",0);
            if(j.getExperiencia()>=100){
                j.LevelUp();
                infoBatalla.insert("Has subido al nivel "+j.getNivel()+"\n",0);
            }
        }
        return v.getVidaActual();
    }
    
    public void EnemigoAtaca(Jugador j,Villano v){
        int n = (int)(random()*4)+1;
        if(n!=1){
            int ataque = v.getAtaque()-j.getArmadura();
            if(ataque<=0){
                ataque = 1;
            }
            j.setVidaActual(j.getVidaActual()-ataque);
            if(j.getVidaActual()<0){
                j.setVidaActual(0);
            }
            infoBatalla.insert("El enemigo "+v.getNombre()+" te ha atacado tu vida actual es de "+j.getVidaActual()+"\n",0);
        }
        else{
            infoBatalla.insert("has evadido el ataque del "+v.getNombre()+"\n",0);
        }
    }
    
    public void Atacado(Jugador j,Villano v,Villano s){
        if(s.getVidaActual()>0 && v.getVidaActual()>0){
            EnemigoAtaca(j,s);
            EnemigoAtaca(j,v);
        }
        if(s.getVidaActual()<=0 && v.getVidaActual()>0){
            EnemigoAtaca(j,v);
        }
        if(s.getVidaActual()>0 && v.getVidaActual()<=0){
            EnemigoAtaca(j,s);
        }
        if(j.getVidaActual()<0){
            j.setVidaActual(0);
        }
        vidaJugador.setText("HP: "+j.getVidaActual()+" / "+j.getVidaTotal());
        MenuVisible();
        if(j.getVidaActual() == 0){
            MenuInvisible();
            Continuar.setVisible(true);
            infoBatalla.insert("Has muerto\n",0);
        }
        if(s.getVidaActual()<=0 && v.getVidaActual()<=0){
            MenuInvisible();
            Continuar.setVisible(true);
        }
    }
}