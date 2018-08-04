/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;
import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

/**
 *
 * @author josef
 */
public class TestPrintArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Double[] doubles = {4.5,6.3,8.6,9.2,7.9};
        Integer[] enteros = {5,4,6,9,2,5,1};
        Character[] caracteres = {'H','O','L','A'};
        
        PrintArrays.printArray(doubles);
        PrintArrays.printArray(enteros);
        PrintArrays.printArray(caracteres);
        PrintElement.print(doubles);
        
    }
    
}
