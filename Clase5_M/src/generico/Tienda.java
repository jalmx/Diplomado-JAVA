/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generico;

import java.util.Arrays;

/**
 *
 * @author josef
 */
public class Tienda <E> {
    
    private final Object[] elements;
    private int position;
    
    public Tienda(int size){
        elements = new Object[size];
        position =0;
    }
    
    public void addElement(E e){
        
        if(position == elements.length)return;
        
        elements[position] = e;
        position++;
    }
    
    public E getElement(int index){
        return (E) elements[index];
    }
    
    public E[] getAll(){
        return (E[]) elements;
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
    
}
