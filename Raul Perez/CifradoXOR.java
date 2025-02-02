/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifradoxor;

/**
 *
 * @author steve
 */
public class CifradoXOR {
    /**
     * @param args the command line arguments
     */
    public static String cifra(String cadena,int clave ){
        String ret = "";
        char [] chars = cadena.toCharArray();
        for (int i = 0 ; i < chars.length; i++){
        char c = (char)(chars[i] ^ clave);
        ret = ret + c;
        } return ret;
    }
    public static void main(String[] args) {
        String cadena = "hola";
        String cifrado = cifra(cadena,5);
        String original = cifra(cifrado,5);
        System.out.println(cifrado+"   "+original);
        
    }
    
}
