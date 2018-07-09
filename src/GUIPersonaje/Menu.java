/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIPersonaje;

import Inventario.GUIinventario;
import Jugador.Jugador;
import Misiones.guiMisiones;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author javie
 */
public class Menu extends JFrame{
    private final int WIDTH=237,HEIGHT = 72;
    private final JButton perfil,inventario,magia,salir,prueba,magia1,magia2,magia3,magia4,magia5,regresar, misiones,volver;
    private final JLabel nombreJugador,fondo,vidaActual,manaActual,fireIcon,iceIcon,boltIcon,holyIcon,aeroIcon,fondo2,fondoPerfil;
    private final JLabel nombre,nivel,mana,vida,ataque,defensa,misionesCum,magiaDes,exp;
    public ImageIcon jugadorImg,botonImg,fondoImg;
    
    
    public Menu(Jugador j){
        fondoImg = new ImageIcon(getClass().getResource("/Imagenes/estadisticas.png"));
        fondoPerfil = new JLabel(fondoImg);
        fondoPerfil.setBounds(0, 0 , 900, 700);
        
        nombre = new JLabel();
        nombre.setText(j.getNombre());
        nombre.setBounds(250,15, 300,100);
        nombre.setFont(new java.awt.Font("AR DARLING", 1, 28));  
        nombre.setForeground(new java.awt.Color(255, 255, 255));
        
        nivel = new JLabel();
        nivel.setText(j.getNivel()+"");
        nivel.setBounds(200,435, 300,100);
        nivel.setFont(new java.awt.Font("AR DARLING", 1, 28));  
        nivel.setForeground(new java.awt.Color(255, 255, 255));
        
        mana = new JLabel();
        mana.setText(j.getMagiaActual()+" / " +j.getMagiaTotal());
        mana.setBounds(200,385, 300,100);
        mana.setFont(new java.awt.Font("AR DARLING", 1, 28));  
        mana.setForeground(new java.awt.Color(255, 255, 255));

        
        vida = new JLabel();
        vida.setText(j.getVidaActual()+" / "+j.getVidaTotal());
        vida.setBounds(200,340, 300,100);
        vida.setFont(new java.awt.Font("AR DARLING", 1, 28));  
        vida.setForeground(new java.awt.Color(255, 255, 255));
        
        ataque = new JLabel();
        ataque.setText(j.getAtaque()+"");
        ataque.setBounds(560,340, 300,100);
        ataque.setFont(new java.awt.Font("AR DARLING", 1, 28));  
        ataque.setForeground(new java.awt.Color(255, 255, 255));
               
        exp = new JLabel();
        exp.setText(j.getExperiencia()+"");
        exp.setBounds(560,435, 300,100);
        exp.setFont(new java.awt.Font("AR DARLING", 1, 28));  
        exp.setForeground(new java.awt.Color(255, 255, 255)); 
        
        defensa = new JLabel();
        defensa.setText(j.getArmadura()+"");
        defensa.setBounds(560,385, 300,100);
        defensa.setFont(new java.awt.Font("AR DARLING", 1, 28));  
        defensa.setForeground(new java.awt.Color(255, 255, 255));
        
        misionesCum = new JLabel();
        misionesCum.setText(j.getMisionesCompletadas().size()+"");
        misionesCum.setBounds(700,485, 300,100);
        misionesCum.setFont(new java.awt.Font("AR DARLING", 1, 28));  
        misionesCum.setForeground(new java.awt.Color(255, 255, 255));
        
        magiaDes = new JLabel();
        magiaDes.setText(j.getMagiaDesbloqueada().size()+"");
        magiaDes.setBounds(310,485, 300,100);
        magiaDes.setFont(new java.awt.Font("AR DARLING", 1, 28));  
        magiaDes.setForeground(new java.awt.Color(255, 255, 255));
        
        botonImg = new ImageIcon(getClass().getResource("/Imagenes/BotonEstadisticas.png"));
        perfil = new JButton();
        perfil.setIcon(botonImg);
        perfil.setBounds(286,201, WIDTH,HEIGHT);
        
        botonImg = new ImageIcon(getClass().getResource("/Imagenes/BotonInventario_1.png"));
        inventario = new JButton();
        inventario.setIcon(botonImg);
        inventario.setBounds(288,290, WIDTH, HEIGHT);
        
        botonImg = new ImageIcon(getClass().getResource("/Imagenes/BotonMagia_1.png"));
        magia = new JButton();
        magia.setIcon(botonImg);
        magia.setBounds(288,380, WIDTH, HEIGHT);
        
        botonImg = new ImageIcon(getClass().getResource("/Imagenes/BotonMisiones.png"));
        misiones = new JButton();
        misiones.setIcon(botonImg);
        misiones.setBounds(289,463, WIDTH, HEIGHT);
        
        fondoImg = new ImageIcon(getClass().getResource("/Imagenes/BotonSalir_1.png"));
        salir = new JButton();
        salir.setIcon(fondoImg);
        salir.setBounds(290,546, WIDTH, HEIGHT);
        
        botonImg = new ImageIcon(getClass().getResource("/Imagenes/volverMenu.png"));
        volver = new JButton();
        volver.setIcon(botonImg);
        volver.setBounds(550,270, 306,62);
        //////////////////////////////////////////////////////////////////////// 
        fondoImg = new ImageIcon(getClass().getResource("/Imagenes/botonEquipar.png"));
        magia1 = new JButton();
        magia1.setIcon(fondoImg);
        magia1.setBounds(125,235,145,33);
        
        magia2 = new JButton();
        magia2.setIcon(fondoImg);
        magia2.setBounds(345,235,145,33);
        
        magia3 = new JButton();
        magia3.setIcon(fondoImg);
        magia3.setBounds(565,235,145,33);
        
        magia4 = new JButton();
        magia4.setIcon(fondoImg);
        magia4.setBounds(125, 500,145,33);
        
        magia5 = new JButton();
        magia5.setIcon(fondoImg);
        magia5.setBounds(345, 500,145,33);
        
        
        for(int i = 0; i<=j.getMagiaDesbloqueada().size();i++){
            switch(i){
                case 0:
                    magia1.setEnabled(false);
                    magia2.setEnabled(false);
                    magia3.setEnabled(false);
                    magia4.setEnabled(false);
                    magia5.setEnabled(false);
                    break;
                case 1:
                    magia1.setEnabled(true);
                    break;
                case 2:
                    magia2.setEnabled(true);
                    break;
                case 3:
                    magia3.setEnabled(true);
                    break;
                case 4:
                    magia4.setEnabled(true);
                    break;
                case 5:
                    magia5.setEnabled(true);
                    break;
            }
        }
        ////////////////////////////////////////////////////////////////////////
        fondoImg = new ImageIcon(getClass().getResource("/Imagenes/BotonRegresar.png"));
        regresar = new JButton();
        regresar.setIcon(fondoImg);
        regresar.setBounds(600,500, 145,33);

        
        prueba = new JButton("IMAGEN");
        prueba.setBounds(400,15,300,300);
        
        nombreJugador = new JLabel();
        nombreJugador.setText(j.getNombre());
        Font auxFont1 = nombreJugador.getFont();
        nombreJugador.setFont(new Font(auxFont1.getFontName(), auxFont1.getStyle(), 30));
        nombreJugador.setBounds(450, 350, 100, 100);
        
        ////////////////////////////////////////////
        fondoImg = new ImageIcon(getClass().getResource("/Imagenes/RunaFuego.png"));
        fireIcon = new JLabel();
        fireIcon.setIcon(fondoImg);
        fireIcon.setBounds(565, 80, 133, 130);
        
        fondoImg = new ImageIcon(getClass().getResource("/Imagenes/RunaIce.png"));
        iceIcon = new JLabel();
        iceIcon.setIcon(fondoImg);
        iceIcon.setBounds(125, 80, 133, 130);
        
        fondoImg = new ImageIcon(getClass().getResource("/Imagenes/RunaHoly.png"));
        holyIcon = new JLabel();
        holyIcon.setIcon(fondoImg);
        holyIcon.setBounds(345, 80, 133, 130);
        
        fondoImg = new ImageIcon(getClass().getResource("/Imagenes/RunaRayo.png"));
        boltIcon = new JLabel();
        boltIcon.setIcon(fondoImg);
        boltIcon.setBounds(125, 340, 133, 130);
        
        fondoImg = new ImageIcon(getClass().getResource("/Imagenes/RunaAire.png"));
        aeroIcon = new JLabel();
        aeroIcon.setIcon(fondoImg);
        aeroIcon.setBounds(345, 340, 133, 130);
        ////////////////////////////////////////////
        vidaActual = new JLabel();
        vidaActual.setText("HP: "+j.getVidaActual()+" / "+j.getVidaTotal());
        Font auxFont2 = vidaActual.getFont();
        vidaActual.setFont(new Font(auxFont2.getFontName(), auxFont2.getStyle(), 30));
        vidaActual.setBounds(400, 400, 300, 100);

        manaActual = new JLabel();
        manaActual.setText("MP: "+j.getMagiaActual()+" / "+j.getMagiaTotal());
        Font auxFont4 = manaActual.getFont();
        manaActual.setFont(new Font(auxFont4.getFontName(), auxFont4.getStyle(), 30));
        manaActual.setBounds(400, 450, 300, 100);
        
        fondoImg = new ImageIcon(getClass().getResource("/Imagenes/FondoMenu_1.png"));
        fondo = new JLabel();
        fondo.setIcon(fondoImg);
        fondo.setBounds(0, 0, 900, 700);
        
        fondoImg = new ImageIcon(getClass().getResource("/Imagenes/FondoMagia2.png"));
        fondo2 = new JLabel();
        fondo2.setIcon(fondoImg);
        fondo2.setBounds(0, 0, 900, 700);
        
        perfil.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                vi();
            }
        });
        
        inventario.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                GUIinventario ventanaInventario = new GUIinventario(j);
                ventanaInventario.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                ventanaInventario.setResizable(false);
                ventanaInventario.pack();
                ventanaInventario.setVisible(true);
            }
        });
        
        magia.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                visible();
            }
        });
        
        salir.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        
        magia1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                invisible();
                j.EquiparMagia("Ice");
            }
        });
        
        magia2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                invisible();
                j.EquiparMagia("Holy");
            }
        });
        
        magia3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                invisible();
                j.EquiparMagia("Fire");
            }
        });
        
        magia4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                invisible();
                j.EquiparMagia("Bolt");
            }
        });
        
        magia5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                invisible();
                j.EquiparMagia("Aero");
            }
        });
        
        misiones.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                guiMisiones m = new guiMisiones(j);
                m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                m.setSize(900,700);
                m.setVisible(true);
            }
      
        });
        
        volver.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                invisible();
                
            }
      
        });
        
        regresar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                invisible();
                
            }
      
        });
        add(exp);
        add(volver);
        add(nombre);
        add(nivel);
        add(mana);
        add(vida);
        add(ataque);
        add(defensa);
        add(misionesCum);
        add(magiaDes);
        add(magia1);
        add(magia2);
        add(magia3);
        add(magia4);
        add(magia5);
        add(misiones);
        add(regresar);
        add(fireIcon);
        add(holyIcon);
        add(iceIcon);
        add(boltIcon);
        add(aeroIcon);
        add(perfil);
        add(magia);
        add(inventario);
        add(salir);
        add(fondo2);
        add(fondo);
        add(fondoPerfil);
        invisible();
        
        setLayout(null);
        
        
    }
    
    public void invisible(){
        boolean b = false;
        magia1.setVisible(b);
        magia2.setVisible(b);
        magia3.setVisible(b);
        magia4.setVisible(b);
        magia5.setVisible(b);
        regresar.setVisible(b);
        fireIcon.setVisible(b);
        holyIcon.setVisible(b);
        boltIcon.setVisible(b);
        iceIcon.setVisible(b);
        aeroIcon.setVisible(b);
        misiones.setVisible(!b);
        exp.setVisible(b);
        fondoPerfil.setVisible(b);
        nombre.setVisible(b);
        nivel.setVisible(b);
        mana.setVisible(b);
        vida.setVisible(b);
        ataque.setVisible(b);
        defensa.setVisible(b);
        misionesCum.setVisible(b);
        magiaDes.setVisible(b);
        volver.setVisible(b);
        
        nombreJugador.setVisible(!b);
        vidaActual.setVisible(!b);
        manaActual.setVisible(!b);
        perfil.setVisible(!b);
        magia.setVisible(!b);
        inventario.setVisible(!b);
        salir.setVisible(!b);
        prueba.setVisible(!b);
        fondo2.setVisible(b);
        fondo.setVisible(!b);
        
    }
    
    public void visible(){
        boolean b = true;
        magia1.setVisible(b);
        magia2.setVisible(b);
        magia3.setVisible(b);
        magia4.setVisible(b);
        magia5.setVisible(b);
        regresar.setVisible(b);
        fireIcon.setVisible(b);
        holyIcon.setVisible(b);
        exp.setVisible(!b);
        fondoPerfil.setVisible(!b);
        nombre.setVisible(!b);
        nivel.setVisible(!b);
        mana.setVisible(!b);
        vida.setVisible(!b);
        ataque.setVisible(!b);
        defensa.setVisible(!b);
        misionesCum.setVisible(!b);
        magiaDes.setVisible(!b);
        volver.setVisible(!b);
        
        boltIcon.setVisible(b);
        iceIcon.setVisible(b);
        aeroIcon.setVisible(b);
        nombreJugador.setVisible(!b);
        vidaActual.setVisible(!b);
        manaActual.setVisible(!b);
        perfil.setVisible(!b);
        misiones.setVisible(!b);
        magia.setVisible(!b);
        inventario.setVisible(!b);
        salir.setVisible(!b);
        prueba.setVisible(!b);
        fondo2.setVisible(b);
        fondo.setVisible(!b);
        
    }
    
    public void vi(){
        boolean b = false;
        magia1.setVisible(b);
        magia2.setVisible(b);
        magia3.setVisible(b);
        magia4.setVisible(b);
        magia5.setVisible(b);
        regresar.setVisible(b);
        fireIcon.setVisible(b);
        holyIcon.setVisible(b);
        volver.setVisible(!b);
        exp.setVisible(!b);
        fondoPerfil.setVisible(!b);
        nombre.setVisible(!b);
        nivel.setVisible(!b);
        mana.setVisible(!b);
        vida.setVisible(!b);
        ataque.setVisible(!b);
        defensa.setVisible(!b);
        misionesCum.setVisible(!b);
        magiaDes.setVisible(!b);
        
        boltIcon.setVisible(b);
        iceIcon.setVisible(b);
        aeroIcon.setVisible(b);
        nombreJugador.setVisible(b);
        vidaActual.setVisible(b);
        manaActual.setVisible(b);
        perfil.setVisible(b);
        misiones.setVisible(b);
        magia.setVisible(b);
        inventario.setVisible(b);
        salir.setVisible(b);
        prueba.setVisible(b);
        fondo2.setVisible(b);
        fondo.setVisible(b);
        
    }
}