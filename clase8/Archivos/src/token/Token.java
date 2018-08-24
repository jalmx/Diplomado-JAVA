/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package token;

import java.util.StringTokenizer;

/**
 *
 * @author josef
 */
public class Token {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mensaje = "hola,mundo,cruel,programacion";

        StringTokenizer tokenizer = new StringTokenizer(mensaje);

        String s = "";
        while (tokenizer.hasMoreElements()) {
            s += tokenizer.nextToken(",");
        }
        System.out.println(s);
    }

}
