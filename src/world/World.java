
package world;

import GUI.VentanaBatalla;
import Jugador.Jugador;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author feranstirman
 */
public class World extends JFrame{
    
    private int WIDTH=1000;
    private int HEIGHT=700;
    
    private ImageIcon imagenMundo;
    private JLabel mundo;
    
    public World(){
        super("JUEGO UNTITLED");
        inicializarComponentes();
    }
    
    public void inicializarComponentes(){
        imagenMundo= new ImageIcon(getClass().getResource("/Imagenes/world.png"));
        mundo= new JLabel(imagenMundo);
        mundo.setBounds(0, 0, WIDTH, HEIGHT);
        add(mundo);
        
        //PROPIEDADES DE LA VENTANA
        setLayout(null);
        setPreferredSize(new Dimension(1000,700));
        setMaximumSize(new Dimension(1000,700));
        setMinimumSize(new Dimension(1000,700));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    
}
