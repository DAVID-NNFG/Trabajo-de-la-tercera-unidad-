/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Usuario iTC
 */
public class CIfradoVigenari {
    public static String procesarTexto(String texto, String clave, boolean cifrar) {
        if (cifrar) {
            return Vigenari.cifrar(texto, clave); // Llamada a Vigenari.cifrar
        } else {
            return Vigenari.descifrar(texto, clave); // Llamada a Vigenari.descifrar
        }
    }
    
}
