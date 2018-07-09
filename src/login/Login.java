/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import game.Game;
import java.awt.Container;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import usuario.User;
import usuario.UserDao;

/**
 *
 * @author Karina Mina <https://github.com/karinamina3>
 */
public class Login extends JFrame {

    public JLabel lbluser, lblpassword, lblfondo, lblincorrecta;
    public JTextField user, password;
    public JButton iniciar;
    Font fuente = new Font("Century Gothic", 1, 16);

    public Login() {
        super("El legado de Afriend");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLayout(null);        
        
        Container container = getContentPane();

        lblfondo = new JLabel();
        lblfondo.setIcon(new ImageIcon(getClass().getResource("/login/login.jpg")));
        getLayeredPane().add(lblfondo, JLayeredPane.FRAME_CONTENT_LAYER);
        lblfondo.setBounds(0, 0, 500, 500);

        lbluser = new JLabel("Usuario: ");
        lblpassword = new JLabel("Contraseña: ");

        lbluser.setBounds(120, 300, 130, 30);
        lblpassword.setBounds(120, 335, 130, 30);

        lbluser.setForeground(Color.black);
        lbluser.setFont(fuente);
        lblpassword.setForeground(Color.black);
        lblpassword.setFont(fuente);

        user = new JTextField();
        password = new JPasswordField();

        user.setBounds(250, 300, 130, 30);
        password.setBounds(250, 335, 130, 30);

        user.setBackground(Color.black);
        user.setForeground(Color.white);
        user.setFont(fuente);
        password.setBackground(Color.black);
        password.setForeground(Color.white);

        lblincorrecta = new JLabel("Contraseña, incorrecta.");
        lblincorrecta.setBounds(180, 370, 200, 30);
        lblincorrecta.setForeground(Color.black);
        lblincorrecta.setVisible(false);

        iniciar = new JButton("Iniciar");
        iniciar.setBounds(200, 400, 100, 30);

        iniciar.setForeground(Color.white);
        iniciar.setBackground(Color.black);
        iniciar.setFont(fuente);

        iniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = user.getText();
                String contrasenia = password.getText();
                iniciarJuego(usuario, contrasenia);
            }
        });

        container.add(lbluser);
        container.add(lblpassword);
        container.add(user);
        container.add(password);
        container.add(iniciar);
        container.add(lblincorrecta);
        container.add(lblfondo);
        setSize(500, 500);

    }

    public void iniciarJuego(String usuario, String contrasenia) {
        lblincorrecta.setVisible(false);
        if (!(usuario.equals("") && contrasenia.equals(""))) {

            System.out.println("getText: " + usuario);
            System.out.println("getText: " + contrasenia);
            User jugador;
            UserDao dao = new UserDao();
            jugador = dao.read(usuario);
            System.out.println("read: " + jugador);
            if (jugador == null) {
                jugador = new User(usuario, contrasenia, 1, 1000);
                dao.insert(jugador);
                System.out.println("ingresando nuevo usuario...");
            } else {
                if (jugador.getPassword().equals(contrasenia)) {
                    System.out.println("SE INICIÓ EL JUEGO");
                    dispose();
//                    
                    new Game();
                } else {
                    System.out.println("contraseña incorrecta...");
                    lblincorrecta.setVisible(true);
                }
            }
        }
    }

    public static void main(String... args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
}
