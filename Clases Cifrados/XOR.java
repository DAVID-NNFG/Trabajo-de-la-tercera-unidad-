/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Usuario iTC
 */
public class XOR {
    
   public static String cifrar(String texto, int clave) {
        StringBuilder resultado = new StringBuilder();
        for (char c : texto.toCharArray()) {
            resultado.append((char) (c ^ clave));  // Operación XOR
        }
        return resultado.toString();
    }

    public static String descifrar(String texto, int clave) {
        return cifrar(texto, clave);  // Usamos el mismo método para cifrar y descifrar
    }
    
}
