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
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Hp
 */
public class Tienda2 extends JFrame {

    public JButton boton, boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9, boton10;
    public JButton boton11, boton12, boton13, boton14, boton15, boton16, boton17, boton18, boton19, boton20, boton21, boton22, salir;
    public JButton boton23, boton24;
    public ImageIcon imagenFondo, imagen1, imagen2, imagen3, imagen4, imagen5, imagen6, imagen7, imagen8, imagen9, imagen10;
    public ImageIcon imagen11, imagen12, imagen13, imagen14, imagen15, imagen16, imagen17, imagen18, imagen19, imagen20, imagen21, imagen22;
    public ImageIcon imagen23, imagen24,imgSalida;
    public JLabel fondo, dinero;
    
    Objetos obj = new Objetos();

    public Tienda2(Jugador j) {
        imagenFondo = new ImageIcon(getClass().getResource("/Imagenes/tiendaFondoFinal.png"));
        fondo = new JLabel(imagenFondo);
        fondo.setBounds(0, 0, 900, 700);
        
        dinero = new JLabel();
        dinero.setText(Integer.toString(j.getDinero()));
        dinero.setForeground(Color.white);
        Font auxFont=dinero.getFont(); 
        dinero.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 20));
        dinero.setBounds(830, 130, 100, 100);
        
        /*
       Agregando los botones de los objetos de la tienda
         */
        imagen1 = new ImageIcon(getClass().getResource("/Imagenes/espada1.png"));
        boton1 = new JButton();
        boton1.setIcon(imagen1);
        boton1.setBounds(105, 127, 62, 62);

        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tienda factory;
                factory = ProductorTienda.getFactory("Items");
                Items item = factory.GetItem("Espada1");
                obj.setNombre(item.getNombre());
                obj.setAtributo(item.getAtributo());
                obj.setCosto(item.getCosto());
                item.setCantidad(item.getCantidad()+1);
                obj.setCantidad(item.getCantidad());
                j.AgregarObjeto(obj);
                j.Equipar(obj,"arma");
            }

        });

        imagen2 = new ImageIcon(getClass().getResource("/Imagenes/espada2.png"));
        boton2 = new JButton();
        boton2.setIcon(imagen2);
        boton2.setBounds(263, 127, 62, 62);

        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tienda factory;
                factory = ProductorTienda.getFactory("Items");
                Items item = factory.GetItem("Espada2");
                obj.setNombre(item.getNombre());
                obj.setAtributo(item.getAtributo());
                obj.setCosto(item.getCosto());
                item.setCantidad(item.getCantidad()+1);
                obj.setCantidad(item.getCantidad());
                j.AgregarObjeto(obj);
                j.Equipar(obj,"arma");
            }

        });

        imagen3 = new ImageIcon(getClass().getResource("/Imagenes/espada3.png"));
        boton3 = new JButton();
        boton3.setIcon(imagen3);
        boton3.setBounds(421, 127, 62, 62);

        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tienda factory;
                factory = ProductorTienda.getFactory("Items");
                Items item = factory.GetItem("Espada3");
                obj.setNombre(item.getNombre());
                obj.setAtributo(item.getAtributo());
                obj.setCosto(item.getCosto());
                item.setCantidad(item.getCantidad()+1);
                obj.setCantidad(item.getCantidad());
                j.AgregarObjeto(obj);
                j.Equipar(obj,"arma");
            }

        });

        imagen4 = new ImageIcon(getClass().getResource("/Imagenes/espada4.png"));
        boton4 = new JButton();
        boton4.setIcon(imagen4);
        boton4.setBounds(579, 127, 62, 62);

        boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tienda factory;
                factory = ProductorTienda.getFactory("Items");
                Items item = factory.GetItem("Espada4");
                obj.setNombre(item.getNombre());
                obj.setAtributo(item.getAtributo());
                obj.setCosto(item.getCosto());
                item.setCantidad(item.getCantidad()+1);
                obj.setCantidad(item.getCantidad());
                j.AgregarObjeto(obj);
                j.Equipar(obj,"arma");
            }

        });

        imagen5 = new ImageIcon(getClass().getResource("/Imagenes/espada5.png"));
        boton5 = new JButton();
        boton5.setIcon(imagen3);
        boton5.setBounds(105, 206, 62, 62);

        boton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tienda factory;
                factory = ProductorTienda.getFactory("Items");
                Items item = factory.GetItem("Espada5");
                obj.setNombre(item.getNombre());
                obj.setAtributo(item.getAtributo());
                obj.setCosto(item.getCosto());
                item.setCantidad(item.getCantidad()+1);
                obj.setCantidad(item.getCantidad());
                j.AgregarObjeto(obj);
                j.Equipar(obj,"arma");
            }

        });

        imagen6 = new ImageIcon(getClass().getResource("/Imagenes/anillo.png"));
        boton6 = new JButton();
        boton6.setIcon(imagen6);
        boton6.setBounds(263, 206, 62, 62);

        boton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tienda factory;
                factory = ProductorTienda.getFactory("Items");
                Items item = factory.GetItem("Anillo");
                obj.setNombre(item.getNombre());
                obj.setAtributo(item.getAtributo());
                obj.setCosto(item.getCosto());
                item.setCantidad(item.getCantidad()+1);
                obj.setCantidad(item.getCantidad());
                j.AgregarObjeto(obj);
                j.Equipar(obj,"armadura");
            }

        });

        imagen7 = new ImageIcon(getClass().getResource("/Imagenes/botas.png"));
        boton7 = new JButton();
        boton7.setIcon(imagen7);
        boton7.setBounds(421, 206, 62, 62);

        boton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tienda factory;
                factory = ProductorTienda.getFactory("/Imagenes/Items");
                Items item = factory.GetItem("Botas");
                obj.setNombre(item.getNombre());
                obj.setAtributo(item.getAtributo());
                obj.setCosto(item.getCosto());
                item.setCantidad(item.getCantidad()+1);
                obj.setCantidad(item.getCantidad());
                j.AgregarObjeto(obj);
                j.Equipar(obj,"armadura");
            }

        });

        imagen8 = new ImageIcon(getClass().getResource("/Imagenes/daga.png"));
        boton8 = new JButton();
        boton8.setIcon(imagen8);
        boton8.setBounds(579, 206, 62, 62);

        boton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tienda factory;
                factory = ProductorTienda.getFactory("Items");
                Items item = factory.GetItem("Daga");
                obj.setNombre(item.getNombre());
                obj.setAtributo(item.getAtributo());
                obj.setCosto(item.getCosto());
                item.setCantidad(item.getCantidad()+1);
                obj.setCantidad(item.getCantidad());
                j.AgregarObjeto(obj);
                j.Equipar(obj,"arma");
            }

        });

        imagen9 = new ImageIcon(getClass().getResource("/Imagenes/daga2.png"));
        boton9 = new JButton();
        boton9.setIcon(imagen9);
        boton9.setBounds(105, 285, 62, 62);

        boton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tienda factory;
                factory = ProductorTienda.getFactory("/Imagenes/Items");
                Items item = factory.GetItem("Daga2");
                obj.setNombre(item.getNombre());
                obj.setAtributo(item.getAtributo());
                obj.setCosto(item.getCosto());
                item.setCantidad(item.getCantidad()+1);
                obj.setCantidad(item.getCantidad());
                j.AgregarObjeto(obj);
                j.Equipar(obj,"arma");
            }

        });

        imagen10 = new ImageIcon(getClass().getResource("/Imagenes/SoulCalibur.png"));
        boton10 = new JButton();
        boton10.setIcon(imagen10);
        boton10.setBounds(263, 285, 62, 62);

        boton10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tienda factory;
                factory = ProductorTienda.getFactory("Items");
                Items item = factory.GetItem("SoulCalibur");
                obj.setNombre(item.getNombre());
                obj.setAtributo(item.getAtributo());
                obj.setCosto(item.getCosto());
                item.setCantidad(item.getCantidad()+1);
                obj.setCantidad(item.getCantidad());
                j.AgregarObjeto(obj);
                j.Equipar(obj,"arma");
            }

        });

        imagen11 = new ImageIcon(getClass().getResource("/Imagenes/espadaDemonio.png"));
        boton11 = new JButton();
        boton11.setIcon(imagen11);
        boton11.setBounds(421, 285, 62, 62);

        boton11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tienda factory;
                factory = ProductorTienda.getFactory("Items");
                Items item = factory.GetItem("EspadaDemonio");
                obj.setNombre(item.getNombre());
                obj.setAtributo(item.getAtributo());
                obj.setCosto(item.getCosto());
                item.setCantidad(item.getCantidad()+1);
                obj.setCantidad(item.getCantidad());
                j.AgregarObjeto(obj);
                j.Equipar(obj,"arma");
            }

        });

        imagen12 = new ImageIcon(getClass().getResource("/Imagenes/fuego.png"));
        boton12 = new JButton();
        boton12.setIcon(imagen12);
        boton12.setBounds(579, 285, 62, 62);

        boton12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tienda factory;
                factory = ProductorTienda.getFactory("Items");
                Items item = factory.GetItem("Fuego");
                obj.setNombre(item.getNombre());
                obj.setAtributo(item.getAtributo());
                obj.setCosto(item.getCosto());
                item.setCantidad(item.getCantidad()+1);
                obj.setCantidad(item.getCantidad());
                j.AgregarObjeto(obj);
                
            }

        });

        imagen13 = new ImageIcon(getClass().getResource("/Imagenes/vara.png"));
        boton13 = new JButton();
        boton13.setIcon(imagen13);
        boton13.setBounds(105, 364, 62, 62);

        boton13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tienda factory;
                factory = ProductorTienda.getFactory("Items");
                Items item = factory.GetItem("Vara");
                obj.setNombre(item.getNombre());
                obj.setAtributo(item.getAtributo());
                obj.setCosto(item.getCosto());
                item.setCantidad(item.getCantidad()+1);
                obj.setCantidad(item.getCantidad());
                j.AgregarObjeto(obj);
                j.Equipar(obj,"arma");
            }

        });

        imagen14 = new ImageIcon(getClass().getResource("/Imagenes/varaElectrica.png"));
        boton14 = new JButton();
        boton14.setIcon(imagen14);
        boton14.setBounds(263, 364, 62, 62);

        boton14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tienda factory;
                factory = ProductorTienda.getFactory("Items");
                Items item = factory.GetItem("VaraElectrica");
                obj.setNombre(item.getNombre());
                obj.setAtributo(item.getAtributo());
                obj.setCosto(item.getCosto());
                item.setCantidad(item.getCantidad()+1);
                obj.setCantidad(item.getCantidad());
                j.AgregarObjeto(obj);
                j.Equipar(obj,"arma");

            }

        });

        imagen15 = new ImageIcon(getClass().getResource("/Imagenes/varaLuz.png"));
        boton15 = new JButton();
        boton15.setIcon(imagen15);
        boton15.setBounds(421, 364, 62, 62);

        boton15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tienda factory;
                factory = ProductorTienda.getFactory("Items");
                Items item = factory.GetItem("VaraLuz");
                obj.setNombre(item.getNombre());
                obj.setAtributo(item.getAtributo());
                obj.setCosto(item.getCosto());
                item.setCantidad(item.getCantidad()+1);
                obj.setCantidad(item.getCantidad());
                j.AgregarObjeto(obj);
                j.Equipar(obj,"arma");
            }

        });

        imagen16 = new ImageIcon(getClass().getResource("/Imagenes/varaPrin.png"));
        boton16 = new JButton();
        boton16.setIcon(imagen16);
        boton16.setBounds(579, 364, 62, 62);

        boton16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tienda factory;
                factory = ProductorTienda.getFactory("Items");
                Items item = factory.GetItem("VaraPrincipiante");
                obj.setNombre(item.getNombre());
                obj.setAtributo(item.getAtributo());
                obj.setCosto(item.getCosto());
                item.setCantidad(item.getCantidad()+1);
                obj.setCantidad(item.getCantidad());
                j.AgregarObjeto(obj);

            }

        });

        imagen17 = new ImageIcon(getClass().getResource("/Imagenes/megaHP.png"));
        boton17 = new JButton();
        boton17.setIcon(imagen17);
        boton17.setBounds(105, 443, 62, 62);

        boton17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tienda factory;
                factory = ProductorTienda.getFactory("Items");
                Items item = factory.GetItem("MegaHP");
                obj.setNombre(item.getNombre());
                obj.setAtributo(item.getAtributo());
                obj.setCosto(item.getCosto());
                item.setCantidad(item.getCantidad()+1);
                obj.setCantidad(item.getCantidad());
                j.AgregarObjeto(obj);

            }

        });

        imagen18 = new ImageIcon(getClass().getResource("/Imagenes/pocionMP.png"));
        boton18 = new JButton();
        boton18.setIcon(imagen18);
        boton18.setBounds(263, 443, 62, 62);

        boton18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tienda factory;
                factory = ProductorTienda.getFactory("Items");
                Items item = factory.GetItem("PocionMP");
                obj.setNombre(item.getNombre());
                obj.setAtributo(item.getAtributo());
                obj.setCosto(item.getCosto());
                item.setCantidad(item.getCantidad()+1);
                obj.setCantidad(item.getCantidad());
                j.AgregarObjeto(obj);

            }

        });

        imagen19 = new ImageIcon(getClass().getResource("/Imagenes/pocionHP.png"));
        boton19 = new JButton();
        boton19.setIcon(imagen19);
        boton19.setBounds(421, 443, 62, 62);

        boton19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tienda factory;
                factory = ProductorTienda.getFactory("Items");
                Items item = factory.GetItem("PocionHP");
                obj.setNombre(item.getNombre());
                obj.setAtributo(item.getAtributo());
                obj.setCosto(item.getCosto());
                item.setCantidad(item.getCantidad()+1);
                obj.setCantidad(item.getCantidad());
                j.AgregarObjeto(obj);

            }

        });

        imagen20 = new ImageIcon(getClass().getResource("/Imagenes/megaMP.png"));
        boton20 = new JButton();
        boton20.setIcon(imagen20);
        boton20.setBounds(579, 443, 62, 62);

        boton20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tienda factory;
                factory = ProductorTienda.getFactory("Items");
                Items item = factory.GetItem("MegaMP");
                obj.setNombre(item.getNombre());
                obj.setAtributo(item.getAtributo());
                obj.setCosto(item.getCosto());
                item.setCantidad(item.getCantidad()+1);
                obj.setCantidad(item.getCantidad());
                j.AgregarObjeto(obj);

            }

        });
        imagen21 = new ImageIcon(getClass().getResource("/Imagenes/Armadura1.png"));
        boton21 = new JButton();
        boton21.setIcon(imagen21);
        boton21.setBounds(105, 530, 62, 62);

        boton21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tienda factory;
                factory = ProductorTienda.getFactory("Items");
                Items item = factory.GetItem("Armadura1");
                obj.setNombre(item.getNombre());
                obj.setAtributo(item.getAtributo());
                item.setCantidad(item.getCantidad()+1);
                obj.setCantidad(item.getCantidad());
                obj.setCosto(item.getCosto());
                j.AgregarObjeto(obj);
                j.Equipar(obj,"armadura");
            }

        });
        
        imagen22 = new ImageIcon(getClass().getResource("/Imagenes/Armadura2.png"));
        boton22 = new JButton();
        boton22.setIcon(imagen22);
        boton22.setBounds(263, 530, 62, 62);

        boton22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tienda factory;
                factory = ProductorTienda.getFactory("Items");
                Items item = factory.GetItem("Armadura2");
                obj.setNombre(item.getNombre());
                obj.setAtributo(item.getAtributo());
                obj.setCosto(item.getCosto());
                item.setCantidad(item.getCantidad()+1);
                obj.setCantidad(item.getCantidad());
                j.AgregarObjeto(obj);
                j.Equipar(obj,"armadura");
            }

        });
        
        imagen23 = new ImageIcon(getClass().getResource("/Imagenes/Armadura3.png"));
        boton23 = new JButton();
        boton23.setIcon(imagen23);
        boton23.setBounds(421, 530, 62, 62);

        boton23.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tienda factory;
                factory = ProductorTienda.getFactory("Items");
                Items item = factory.GetItem("Armadura3");
                obj.setNombre(item.getNombre());
                obj.setAtributo(item.getAtributo());
                obj.setCosto(item.getCosto());
                item.setCantidad(item.getCantidad()+1);
                obj.setCantidad(item.getCantidad());
                j.AgregarObjeto(obj);
                j.Equipar(obj,"armadura");
            }

        });
        
        imagen24 = new ImageIcon(getClass().getResource("/Imagenes/Armadura4.png"));
        boton24 = new JButton();
        boton24.setIcon(imagen24);
        boton24.setBounds(579, 530, 62, 62);

        boton24.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tienda factory;
                factory = ProductorTienda.getFactory("Items");
                Items item = factory.GetItem("Armadura4");
                obj.setNombre(item.getNombre());
                obj.setAtributo(item.getAtributo());
                obj.setCosto(item.getCosto());
                item.setCantidad(item.getCantidad()+1);
                obj.setCantidad(item.getCantidad());
                j.AgregarObjeto(obj);
                j.Equipar(obj,"armadura");

            }

        });
        
        imgSalida = new ImageIcon(getClass().getResource("/Imagenes/SalirInventario.png"));
        salir = new JButton();
        salir.setIcon(imgSalida);
        salir.setBounds(733, 446, 62, 62);

        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();

            }

        });
        add(boton1);
        add(boton2);
        add(boton3);
        add(boton4);
        add(boton5);
        add(boton6);
        add(boton7);
        add(boton8);
        add(boton9);
        add(boton10);
        add(boton11);
        add(boton12);
        add(boton13);
        add(boton14);
        add(boton15);
        add(boton16);
        add(boton17);
        add(boton18);
        add(boton19);
        add(boton20);
        add(boton21);
        add(boton22);
        add(boton23);
        add(boton24);
        add(dinero);
        add(salir);

        add(fondo);

        setLayout(null);
        setPreferredSize(new Dimension(900, 700));

    }
}
