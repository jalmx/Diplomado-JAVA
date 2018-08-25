/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivos;

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
        String mensaje = "mensaje 1,mensaje 2*/mensaje 3,mensaje 4";
        
        StringTokenizer token = new StringTokenizer(mensaje, ",");
        
        while(token.hasMoreTokens()){
            System.out.println(token.nextToken());
        }
        
        StringTokenizer token2 = new StringTokenizer(mensaje);
        
        while(token2.hasMoreTokens()){
            System.out.println(token2.nextToken(","));
        }
    }
    
}
