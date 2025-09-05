import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import javax.swing.*;

public class VentanaSaludo {

    public static void main(String[] args) {
        VentanaSaludo();
    }

    public static void VentanaSaludo(){
        JFrame ventana = new JFrame("App␣de␣Saludo␣ICC490");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(null);
        ventana.getContentPane().setBackground(Color.cyan);

        JTextField campoTexto = new JTextField();
        campoTexto.setBounds(50, 30, 200, 25);

        JLabel cabecera =  new JLabel("Ingrese su nombre");
        cabecera.setBounds(50, 20, 300, 25);

        JButton botonSaludar = new JButton("Saludar");
        botonSaludar.setBounds(270, 30, 100, 25);

        JLabel etiquetaSaludo = new JLabel("");
        etiquetaSaludo.setBounds(50, 80, 300, 25);

        botonSaludar.addActionListener(e-> {
            String nombre = campoTexto.getText();
            if (nombre.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor ingresa tu nombre.");
            } else
            { etiquetaSaludo.setText("Hola:" + nombre); }
        });

        campoTexto.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    botonSaludar.doClick();
                }
            }
        });

        ventana.add(campoTexto);
        ventana.add(botonSaludar);
        ventana.add(etiquetaSaludo);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}
