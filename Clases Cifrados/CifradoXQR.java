/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Usuario iTC
 */
public class CifradoXQR {
    
     public static String procesarTexto(String texto, int clave, boolean cifrar) {
        if (cifrar) {
            return XOR.cifrar(texto, clave);  // Cifrar el texto
        } else {
            return XOR.descifrar(texto, clave);  // Descifrar el texto
        }
     }}
