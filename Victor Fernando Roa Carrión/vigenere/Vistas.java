/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vigenere;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Vistas {
    public static void mostrarInterfaz() {
        JFrame frame = new JFrame("Cifrado Vigenère");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLayout(new BorderLayout(10, 10)); // Espaciado en los bordes
        frame.getContentPane().setBackground(new Color(245, 222, 179)); // Color pastel de fondo
        
        // Panel superior con el título
        JLabel titulo = new JLabel("Cifrado Vigenère", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        titulo.setForeground(new Color(105, 105, 105)); // Gris oscuro elegante
        frame.add(titulo, BorderLayout.NORTH);
        
        // Panel central con los campos de texto
        JPanel panelCentro = new JPanel();
        panelCentro.setLayout(new GridLayout(6, 1, 10, 10));
        panelCentro.setBackground(new Color(245, 222, 179));
        panelCentro.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        JTextField inputTexto = new JTextField();
        JTextField inputClave = new JTextField();
        JTextArea outputTexto = new JTextArea(3, 20);
        outputTexto.setEditable(false);
        
        panelCentro.add(new JLabel("Texto:"));
        panelCentro.add(inputTexto);
        panelCentro.add(new JLabel("Clave:"));
        panelCentro.add(inputClave);
        panelCentro.add(new JLabel("Resultado:"));
        panelCentro.add(outputTexto);
        
        frame.add(panelCentro, BorderLayout.CENTER);
        
        // Panel inferior con botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(1, 2, 20, 10));
        panelBotones.setBackground(new Color(245, 222, 179));
        panelBotones.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        JButton botonCifrar = new JButton("Cifrar");
        JButton botonDescifrar = new JButton("Descifrar");
        
        botonCifrar.setFont(new Font("Arial", Font.BOLD, 16));
        botonDescifrar.setFont(new Font("Arial", Font.BOLD, 16));
        
        botonCifrar.setBackground(new Color(173, 216, 230)); // Azul pastel
        botonDescifrar.setBackground(new Color(255, 182, 193)); // Rosa pastel
        
        botonCifrar.setPreferredSize(new Dimension(100, 50));
        botonDescifrar.setPreferredSize(new Dimension(100, 50));
        
        botonCifrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String texto = inputTexto.getText();
                String clave = inputClave.getText();
                outputTexto.setText(Controlador.procesarTexto(texto, clave, true));
            }
        });
        
        botonDescifrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String texto = inputTexto.getText();
                String clave = inputClave.getText();
                outputTexto.setText(Controlador.procesarTexto(texto, clave, false));
            }
        });
        
        panelBotones.add(botonCifrar);
        panelBotones.add(botonDescifrar);
        
        frame.add(panelBotones, BorderLayout.SOUTH);
        
        frame.setVisible(true);
    }
}
