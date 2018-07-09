/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Misiones;

import Jugador.Jugador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author javie
 */
public class guiMisiones extends JFrame{
    private final JButton mision1,mision2,mision3,mision4,mision5,mision6,salir;
    private ImageIcon imagen;
    private final JLabel fondo,info1,info2,info3,info4,info5,info6,estampa;
    private JLabel recompensa,cantidad;
    
    
    public guiMisiones(Jugador j){
        imagen = new ImageIcon(getClass().getResource("/Imagenes/fondomision.png"));
        fondo = new JLabel(imagen);
        fondo.setBounds(0,0,900,700);
        
        imagen = new ImageIcon(getClass().getResource("/Imagenes/estampa.png"));
        estampa = new JLabel(imagen);
        estampa.setBounds(400,25,450,400);
        
        recompensa = new JLabel();
        recompensa.setBounds(620, 340,300, 100);
        cantidad = new JLabel();
        cantidad.setBounds(550, 375,300, 100);
        
        imagen = new ImageIcon(getClass().getResource("/Imagenes/infoShaguma.png"));
        info1 = new JLabel(imagen);
        info1.setBounds(400,25,450,600);
        
        imagen = new ImageIcon(getClass().getResource("/Imagenes/infoAtila.png"));
        info2 = new JLabel(imagen);
        info2.setBounds(400,25,450,600);
        
        imagen = new ImageIcon(getClass().getResource("/Imagenes/infoUnsahganasi.png"));
        info3 = new JLabel(imagen);
        info3.setBounds(400,25,450,600);
        
        imagen = new ImageIcon(getClass().getResource("/Imagenes/infokannakamuygreen.png"));
        info4 = new JLabel(imagen);
        info4.setBounds(400,25,450,600);
        
        imagen = new ImageIcon(getClass().getResource("/Imagenes/infocolmillosangriento.png"));
        info5 = new JLabel(imagen);
        info5.setBounds(400,25,450,600);
        
        imagen = new ImageIcon(getClass().getResource("/Imagenes/infomision6.png"));
        info6 = new JLabel(imagen);
        info6.setBounds(400,25,450,600);
        
        imagen = new ImageIcon(getClass().getResource("/Imagenes/mision1.png"));
        mision1 = new JButton();
        mision1.setIcon(imagen);
        mision1.setBounds(50,50,306,62);
        
        imagen = new ImageIcon(getClass().getResource("/Imagenes/mision2.png"));
        mision2 = new JButton();
        mision2.setIcon(imagen);
        mision2.setBounds(50,112,306,62);
        
        imagen = new ImageIcon(getClass().getResource("/Imagenes/mision3.png"));
        mision3 = new JButton();
        mision3.setIcon(imagen);
        mision3.setBounds(50,162,306,62);
        
        imagen = new ImageIcon(getClass().getResource("/Imagenes/mision4.png"));
        mision4 = new JButton();
        mision4.setIcon(imagen);
        mision4.setBounds(50,212,306,62);
        
        imagen = new ImageIcon(getClass().getResource("/Imagenes/mision5.png"));
        mision5 = new JButton();
        mision5.setIcon(imagen);
        mision5.setBounds(50,262,306,62);
        
        imagen = new ImageIcon(getClass().getResource("/Imagenes/mision6.png"));
        mision6 = new JButton();
        mision6.setIcon(imagen);
        mision6.setBounds(50,312,306,62);
        
        imagen = new ImageIcon(getClass().getResource("/Imagenes/salir.png"));
        salir = new JButton();
        salir.setIcon(imagen);
        salir.setBounds(50,374,306,62);
        
        
        mision1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                invisible();
                for(int i = 0;i<j.getMisionesCompletadas().size();i++){
                    if(j.getMisionesCompletadas().get(i).getNombreMision().equals("mision1")){
                        estampa.setVisible(true);
                    }
                }
                info1.setVisible(true);
                recompensa.setText("100 oro");
                recompensa.setVisible(true);
                cantidad.setText(j.getContadorShaguma()+" / 10");
                cantidad.setVisible(true);
            } 
        });
        
        mision2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                invisible();
                for(int i = 0;i<j.getMisionesCompletadas().size();i++){
                    if(j.getMisionesCompletadas().get(i).getNombreMision().equals("mision2")){
                        estampa.setVisible(true);
                    }
                }
                info2.setVisible(true);
                recompensa.setText("100 oro");
                recompensa.setVisible(true);
                cantidad.setText(j.getContadorAtila()+" / 10");
                cantidad.setVisible(true);
            } 
        });
        
        mision3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                invisible();
                for(int i = 0;i<j.getMisionesCompletadas().size();i++){
                    if(j.getMisionesCompletadas().get(i).getNombreMision().equals("mision3")){
                        estampa.setVisible(true);
                    }
                }
                info3.setVisible(true);
                recompensa.setText("100 oro");
                recompensa.setVisible(true);
                cantidad.setText(j.getContadorUnsahganasi()+" / 10");
                cantidad.setVisible(true);
            } 
        });
        
        mision4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                invisible();
                for(int i = 0;i<j.getMisionesCompletadas().size();i++){
                    if(j.getMisionesCompletadas().get(i).getNombreMision().equals("mision4")){
                        estampa.setVisible(true);
                    }
                }
                info4.setVisible(true);
                recompensa.setText("100 oro");
                recompensa.setVisible(true);
                cantidad.setText(j.getContadorKanna()+" / 10");
                cantidad.setVisible(true);
            } 
        });
        
        mision5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                invisible();
                for(int i = 0;i<j.getMisionesCompletadas().size();i++){
                    if(j.getMisionesCompletadas().get(i).getNombreMision().equals("mision5")){
                        estampa.setVisible(true);
                    }
                }
                info5.setVisible(true);
                recompensa.setText("100 oro");
                recompensa.setVisible(true);
                cantidad.setText(j.getContadorColmillo()+" / 10");
                cantidad.setVisible(true);
            } 
        });
        
        mision6.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                invisible();
                for(int i = 0;i<j.getMisionesCompletadas().size();i++){
                    if(j.getMisionesCompletadas().get(i).getNombreMision().equals("mision6")){
                        estampa.setVisible(true);
                    }
                }
                info6.setVisible(true);
                recompensa.setText("500 oro");
                recompensa.setVisible(true);
                cantidad.setText("?? / ??");
                cantidad.setVisible(true);
            } 
        });
        
        salir.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            } 
        });
        add(estampa);
        add(recompensa);
        add(cantidad);
        add(mision1);
        add(mision2);
        add(mision3);
        add(mision4);
        add(mision5);
        add(mision6);
        add(info1);
        add(info2);
        add(info3);
        add(info4);
        add(info5);
        add(info6);
        add(salir);
        add(fondo);
        invisible();
    }
    
    public void invisible(){
        boolean b = false;
        estampa.setVisible(b);
        recompensa.setVisible(b);
        cantidad.setVisible(b);
        info1.setVisible(b);
        info2.setVisible(b);
        info3.setVisible(b);
        info4.setVisible(b);
        info5.setVisible(b);
        info6.setVisible(b);
    }
    
}
