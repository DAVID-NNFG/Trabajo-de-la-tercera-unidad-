/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Usuario iTC
 */
public class Vigenari {
    
    public static String cifrar(String texto, String clave) {
        StringBuilder resultado = new StringBuilder();
        clave = clave.toUpperCase();
        int claveIndex = 0;
        
        for (char c : texto.toUpperCase().toCharArray()) {
            if (Character.isLetter(c)) {
                int desplazamiento = clave.charAt(claveIndex) - 'A';
                char cifrado = (char) ((c - 'A' + desplazamiento) % 26 + 'A');
                resultado.append(cifrado);
                claveIndex = (claveIndex + 1) % clave.length();
            } else {
                resultado.append(c);
            }
        }
        return resultado.toString();
    }

    public static String descifrar(String texto, String clave) {
        StringBuilder resultado = new StringBuilder();
        clave = clave.toUpperCase();
        int claveIndex = 0;
        
        for (char c : texto.toUpperCase().toCharArray()) {
            if (Character.isLetter(c)) {
                int desplazamiento = clave.charAt(claveIndex) - 'A';
                char descifrado = (char) ((c - 'A' - desplazamiento + 26) % 26 + 'A');
                resultado.append(descifrado);
                claveIndex = (claveIndex + 1) % clave.length();
            } else {
                resultado.append(c);
            }
        }
        return resultado.toString();
    }
    
}
