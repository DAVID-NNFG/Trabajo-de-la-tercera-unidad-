/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Usuario iTC
 */
public class Binario {
    
    public static String convertirTextoABinario(String texto) {
        StringBuilder binario = new StringBuilder();

        for (char caracter : texto.toCharArray()) {
            String binChar = convertirCharABinario(caracter);
            binario.append(binChar).append(" ");
        }

        return binario.toString().trim();
    }

    // Método para convertir binario a texto usando divisiones
    public static String convertirBinarioATexto(String binario) {
        StringBuilder texto = new StringBuilder();

        String[] bytes = binario.split(" "); // Dividir el binario en bloques de 8 bits
        for (String byteBinario : bytes) {
            char caracter = convertirBinarioAChar(byteBinario);
            texto.append(caracter);
        }

        return texto.toString();
    }

    // Método auxiliar para convertir un carácter a binario usando divisiones
    private static String convertirCharABinario(char caracter) {
        int ascii = (int) caracter;
        StringBuilder binario = new StringBuilder();

        // Dividir entre 2 y almacenar los residuos
        while (ascii > 0) {
            binario.insert(0, ascii % 2);
            ascii /= 2;
        }

        // Asegurar que el resultado tenga 8 bits
        while (binario.length() < 8) {
            binario.insert(0, "0");
        }

        return binario.toString();
    }

    // Método auxiliar para convertir un binario (8 bits) a carácter usando divisiones
    private static char convertirBinarioAChar(String binario) {
        int valor = 0;

        // Convertir el binario a su valor decimal
        for (int i = 0; i < binario.length(); i++) {
            valor = valor * 2 + (binario.charAt(i) - '0');
        }

        return (char) valor;
    }
    
}
