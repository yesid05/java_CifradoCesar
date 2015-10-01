/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmocesar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlgoritmoCesar {

    static String charMin = "abcdefghijklmnopqrstuvwxyz";
    static String charMay = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        try {
            String texto = "";
            int n = 0;
            System.out.println("Texto a cifrar");
            texto = bf.readLine();
            System.out.println("Desplazamiento para el cifrado.(numero entero)");
            n = Integer.parseInt(bf.readLine());
            System.out.println(n);
            System.out.println("Texto: " + texto);
            System.out.println("Texto cifrado: " + cifCesar(texto, n));
        } catch (Exception e) {
            System.out.print("Valor no valido.");
        }
    }

    private static String cifCesar(String entrada, int desp) {
        String salida = "";
        for (int i = 0; i < entrada.length(); i++) {
            if ((charMin.indexOf(entrada.charAt(i)) != -1) || (charMay.indexOf(entrada.charAt(i)) != -1)) {
                salida += (charMin.indexOf(entrada.charAt(i)) != -1) ? charMin.charAt(((charMin.indexOf(entrada.charAt(i))) + desp) % charMin.length()) : charMay.charAt((charMay.indexOf(entrada.charAt(i)) + desp) % charMay.length());
            } else {
                salida += entrada.charAt(i);
            }
        }
        return salida;
    }
}
