/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;

import Jugador.Jugador;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Ricardo Villeda
 */
public class GUIinventario extends JFrame {
    public JButton salir;
    public ImageIcon img1, img2;
    public JLabel fondo, info1,info2,info3,info4,info5,info6,info7,info8,info9,info10;
    public JLabel info11,info12,info13,info14,info15,info16,info17,info18,info19,info20;
    public JLabel info21,info22,info23,info24;
    int x =0;    
    
    public GUIinventario(Jugador j) {
        
        
        img1 = new ImageIcon(getClass().getResource("InventarioFondo.png"));
        fondo = new JLabel(img1);
        fondo.setBounds(0, 0, 900, 700);
        
        
        
        info1 = new JLabel();
        info1.setText(Integer.toString(j.ContarCantidadObjetos("Anillo")));
        info1.setForeground(Color.white);
        Font auxFont=info1.getFont(); 
        info1.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        info1.setBounds(235, 130, 62, 62);
        
        info2 = new JLabel();
        info2.setText(Integer.toString(j.ContarCantidadObjetos("Vara")));
        info2.setForeground(Color.white);
        info2.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        info2.setBounds(393, 130, 62, 62);
        
        info3 = new JLabel();
        info3.setText(Integer.toString(j.ContarCantidadObjetos("Espada1")));
        info3.setForeground(Color.white);
        info3.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        info3.setBounds(551, 130, 62, 62);
        
        info4 = new JLabel();
        info4.setText(Integer.toString(j.ContarCantidadObjetos("PocionHP")));
        info4.setForeground(Color.white);
        info4.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        info4.setBounds(709, 130, 62, 62);
        
        info5 = new JLabel();
        info5.setText(Integer.toString(j.ContarCantidadObjetos("Botas")));
        info5.setForeground(Color.white);
        info5.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        info5.setBounds(235, 210, 62, 62);
        
        info6 = new JLabel();
        info6.setText(Integer.toString(j.ContarCantidadObjetos("SoulCalibur")));
        info6.setForeground(Color.white);
        info6.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        info6.setBounds(393, 210, 62, 62);
        
        info7 = new JLabel();
        info7.setText(Integer.toString(j.ContarCantidadObjetos("Espada2")));
        info7.setForeground(Color.white);
        info7.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        info7.setBounds(551, 210, 62, 62);
        
        info8 = new JLabel();
        info8.setText(Integer.toString(j.ContarCantidadObjetos("PocionMP")));
        info8.setForeground(Color.white);
        info8.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        info8.setBounds(709, 210, 62, 62);
        
        info9 = new JLabel();
        info9.setText(Integer.toString(j.ContarCantidadObjetos("VaraLuz")));
        info9.setForeground(Color.white);
        info9.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        info9.setBounds(235, 290, 62, 62);
        
        info10 = new JLabel();
        info10.setText(Integer.toString(j.ContarCantidadObjetos("Fuego")));
        info10.setForeground(Color.white);
        info10.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        info10.setBounds(393, 290, 62, 62);
        
        info11 = new JLabel();
        info11.setText(Integer.toString(j.ContarCantidadObjetos("Espada3")));
        info11.setForeground(Color.white);
        info11.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        info11.setBounds(551, 290, 62, 62);
        
        info12 = new JLabel();
        info12.setText(Integer.toString(j.ContarCantidadObjetos("MegaMP")));
        info12.setForeground(Color.white);
        info12.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        info12.setBounds(709, 290, 62, 62);
        
        info13 = new JLabel();
        info13.setText(Integer.toString(j.ContarCantidadObjetos("VaraPincipiante")));
        info13.setForeground(Color.white);
        info13.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        info13.setBounds(235, 370, 62, 62);
        
        info14 = new JLabel();
        info14.setText(Integer.toString(j.ContarCantidadObjetos("Daga")));
        info14.setForeground(Color.white);
        info14.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        info14.setBounds(393, 370, 62, 62);
        
        info15 = new JLabel();
        info15.setText(Integer.toString(j.ContarCantidadObjetos("Espada4")));
        info15.setForeground(Color.white);
        info15.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        info15.setBounds(551, 370, 62, 62);
        
        info16 = new JLabel();
        info16.setText(Integer.toString(j.ContarCantidadObjetos("MegaHP")));
        info16.setForeground(Color.white);
        info16.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        info16.setBounds(709, 370, 62, 62);
        
        info17 = new JLabel();
        info17.setText(Integer.toString(j.ContarCantidadObjetos("VaraElectrica")));
        info17.setForeground(Color.white);
        info17.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        info17.setBounds(235, 450, 62, 62);
        
        info18 = new JLabel();
        info18.setText(Integer.toString(j.ContarCantidadObjetos("Daga2")));
        info18.setForeground(Color.white);
        info18.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        info18.setBounds(393, 450, 62, 62);
        
        info19 = new JLabel();
        info19.setText(Integer.toString(j.ContarCantidadObjetos("Espada5")));
        info19.setForeground(Color.white);
        info19.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        info19.setBounds(551, 450, 62, 62);
        
        info20 = new JLabel();
        info20.setText(Integer.toString(j.ContarCantidadObjetos("EspadaDemonio")));
        info20.setForeground(Color.white);
        info20.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        info20.setBounds(709, 450, 62, 62);
        
        info21 = new JLabel();
        info21.setText(Integer.toString(j.ContarCantidadObjetos("Armadura1")));
        info21.setForeground(Color.white);
        info21.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        info21.setBounds(235, 535, 62, 62);
        
        info22 = new JLabel();
        info22.setText(Integer.toString(j.ContarCantidadObjetos("Armadura2")));
        info22.setForeground(Color.white);
        info22.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        info22.setBounds(393, 535, 62, 62);
        
        info23 = new JLabel();
        info23.setText(Integer.toString(j.ContarCantidadObjetos("Armadura3")));
        info23.setForeground(Color.white);
        info23.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        info23.setBounds(551, 535, 62, 62);
        
        info24 = new JLabel();
        info24.setText(Integer.toString(j.ContarCantidadObjetos("Armadura4")));
        info24.setForeground(Color.white);
        info24.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        info24.setBounds(709, 535, 62, 62);
        
        
        
        
        img2 = new ImageIcon(getClass().getResource("SalirInventario.png"));
        salir = new JButton(img2);
        salir.setBounds(761, 449, 62, 62);
        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();

            }

        });
        
        
        
        add(info1);
        add(info2);
        add(info3);
        add(info4);
        add(info5);
        add(info6);
        add(info7);
        add(info8);
        add(info9);
        add(info10);
        add(info11);
        add(info12);
        add(info13);
        add(info14);
        add(info15);
        add(info16);
        add(info17);
        add(info18);
        add(info19);
        add(info20);
        add(info21);
        add(info22);
        add(info23);
        add(info24);
        
        add(salir);
        add(fondo);
        
    }
    
}
