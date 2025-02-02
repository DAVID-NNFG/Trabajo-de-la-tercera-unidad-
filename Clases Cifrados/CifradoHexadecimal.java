/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Usuario iTC
 */
public class CifradoHexadecimal {
    
    public static String codificar(String mensaje) {
        StringBuilder codificado = new StringBuilder();
        mensaje = mensaje.toUpperCase(); 

        for (int i = 0; i < mensaje.length(); i++) {
            char caracter = mensaje.charAt(i);
            String hexadecimal = Integer.toHexString((int) caracter).toUpperCase();
            codificado.append(hexadecimal).append(" "); 
        }

        return codificado.toString().trim();
    }

    // Método para decodificar hexadecimal a texto
    public static String decodificar(String codigoHex) {
        StringBuilder mensaje = new StringBuilder();
        String[] caracteres = codigoHex.split(" ");

        for (String hex : caracteres) {
            int valorDecimal = Integer.parseInt(hex, 16);
            mensaje.append((char) valorDecimal);
        }

        return mensaje.toString();
    }
            
    
    
    
}
