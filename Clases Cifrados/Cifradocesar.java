/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Usuario iTC
 */
public class Cifradocesar {
     public static String codificar(String abecedario, String mensaje) {
        String codificado = "";
        mensaje = mensaje.toUpperCase();
        char caracter;
        for (int i = 0; i < mensaje.length(); i++) {
            caracter = mensaje.charAt(i);
            int posicion = abecedario.indexOf(caracter);
            if (posicion == -1) {
                codificado += caracter;
            } else {
                codificado += abecedario.charAt((posicion + 3) % abecedario.length());
            }
        }
        return codificado;

    }
    
}
