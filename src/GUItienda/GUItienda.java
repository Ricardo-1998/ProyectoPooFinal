/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUItienda;

import Jugador.Jugador;
import Jugador.Objetos;
import Objetos.Items.Items;
import Objetos.ProductorTienda;
import Objetos.Tienda;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.TextArea;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Ricardo Villeda
 */
public class GUItienda extends JFrame {
    
    public JButton boton,salir;
    public ImageIcon img1, img2, img3;
    public JLabel fondo;
    
    
    

    public GUItienda(Jugador player) {
        img1 = new ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"));
        fondo = new JLabel(img1);
        fondo.setBounds(0, 0, 900, 700);
        
        img2 = new ImageIcon(getClass().getResource("/Imagenes/boton_1.png"));
        boton = new JButton();
        boton.setIcon(img2);
        boton.setBounds(413, 53, 80 , 70);
        
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame ve =  new JFrame("ventana");
                ve = new Tienda2(player);
                ve.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                ve.setResizable(false);
                ve.pack();
                ve.setVisible(true);
                
                

            }

        });
        img3 = new ImageIcon(getClass().getResource("/Imagenes/PuertaSalida.png"));
        salir = new JButton();
        salir.setIcon(img3);
        salir.setBounds(360, 535, 163 , 114);
        
        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               dispose();
            }

        });
        add(boton);
        add(fondo);
        add(salir);
        
        setLayout(null);
        setPreferredSize(new Dimension(900, 700));
        
        
    }  
}
    
    
