/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Usuario iTC
 */
public class DecifradoInvertidoN {
    
    public static String decodificar(String mensaje) {
        String decodificado = "";
        mensaje = mensaje.toUpperCase(); 
        for (int i = 0; i < mensaje.length(); i++) {
            char caracter = mensaje.charAt(i);
            if (i + 2 < mensaje.length() && Character.isDigit(mensaje.charAt(i + 1))) {
                String codigo = "" + caracter + mensaje.charAt(i + 1);
                if (i + 3 < mensaje.length() && Character.isDigit(mensaje.charAt(i + 2))) {
                    codigo += mensaje.charAt(i + 2);
                    i += 2;
                } else {
                    i += 1;
                }
                switch (codigo) {
                    case "Z1" -> decodificado += "A";
                    case "Y2" -> decodificado += "B";
                    case "X3" -> decodificado += "C";
                    case "W4" -> decodificado += "D";
                    case "V5" -> decodificado += "E";
                    case "U6" -> decodificado += "F";
                    case "T7" -> decodificado += "G";
                    case "S8" -> decodificado += "H";
                    case "R9" -> decodificado += "I";
                    case "Q10" -> decodificado += "J";
                    case "P11" -> decodificado += "K";
                    case "O12" -> decodificado += "L";
                    case "N13" -> decodificado += "M";
                    case "M14" -> decodificado += "N";
                    case "L15" -> decodificado += "O";
                    case "K16" -> decodificado += "P";
                    case "J17" -> decodificado += "Q";
                    case "I18" -> decodificado += "R";
                    case "H19" -> decodificado += "S";
                    case "G20" -> decodificado += "T";
                    case "F21" -> decodificado += "U";
                    case "E22" -> decodificado += "V";
                    case "D23" -> decodificado += "W";
                    case "C24" -> decodificado += "X";
                    case "B25" -> decodificado += "Y";
                    case "A26" -> decodificado += "Z";
                    case "9A" -> decodificado += "0";
                    case "8B" -> decodificado += "1";
                    case "7C" -> decodificado += "2";
                    case "6D" -> decodificado += "3";
                    case "5E" -> decodificado += "4";
                    case "4F" -> decodificado += "5";
                    case "3G" -> decodificado += "6";
                    case "2H" -> decodificado += "7";
                    case "1I" -> decodificado += "8";
                    case "0J" -> decodificado += "9";
                    default -> decodificado += "?"; 
                }
            } else {
                decodificado += caracter; 
            }
        }
        return decodificado;
    }
    
   
    }
