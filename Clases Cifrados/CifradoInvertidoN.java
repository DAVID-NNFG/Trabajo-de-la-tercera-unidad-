/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Usuario iTC
 */
public class CifradoInvertidoN {
    
    public static String codificar(String mensaje) {
        String codificado = "";
        mensaje = mensaje.toUpperCase(); 
        for (int i = 0; i < mensaje.length(); i++) {
            char caracter = mensaje.charAt(i);
            switch (caracter) {
                case 'A' -> codificado += "Z1";
                case 'B' -> codificado += "Y2";
                case 'C' -> codificado += "X3";
                case 'D' -> codificado += "W4";
                case 'E' -> codificado += "V5";
                case 'F' -> codificado += "U6";
                case 'G' -> codificado += "T7";
                case 'H' -> codificado += "S8";
                case 'I' -> codificado += "R9";
                case 'J' -> codificado += "Q10";
                case 'K' -> codificado += "P11";
                case 'L' -> codificado += "O12";
                case 'M' -> codificado += "N13";
                case 'N' -> codificado += "M14";
                case 'O' -> codificado += "L15";
                case 'P' -> codificado += "K16";
                case 'Q' -> codificado += "J17";
                case 'R' -> codificado += "I18";
                case 'S' -> codificado += "H19";
                case 'T' -> codificado += "G20";
                case 'U' -> codificado += "F21";
                case 'V' -> codificado += "E22";
                case 'W' -> codificado += "D23";
                case 'X' -> codificado += "C24";
                case 'Y' -> codificado += "B25";
                case 'Z' -> codificado += "A26";
                case '0' -> codificado += "9A";
                case '1' -> codificado += "8B";
                case '2' -> codificado += "7C";
                case '3' -> codificado += "6D";
                case '4' -> codificado += "5E";
                case '5' -> codificado += "4F";
                case '6' -> codificado += "3G";
                case '7' -> codificado += "2H";
                case '8' -> codificado += "1I";
                case '9' -> codificado += "0J";
                default -> codificado += caracter; 
            }
        }
        return codificado;
    }
    
    
    
}
