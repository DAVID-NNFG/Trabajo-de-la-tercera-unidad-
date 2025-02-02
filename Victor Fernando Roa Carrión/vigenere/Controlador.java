/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vigenere;

public class Controlador {
    public static String procesarTexto(String texto, String clave, boolean cifrar) {
        if (cifrar) {
            return Vigenere.cifrar(texto, clave);
        } else {
            return Vigenere.descifrar(texto, clave);
        }
    }
}
