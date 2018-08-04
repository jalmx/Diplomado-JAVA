/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

/**
 *
 * @author josef
 */
public class PrintElement<E> {
    
    private PrintElement(){
        
    }
    public static <E> void print(E[] elements){
        for (int i = 0; i < elements.length; i++) {
            System.out.printf("%s ", elements[i]);
        }
        System.out.println();
    }
    
}
