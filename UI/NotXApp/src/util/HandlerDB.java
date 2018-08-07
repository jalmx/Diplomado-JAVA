/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;

/**
 *
 * @author josef
 * @param <E>
 */
public interface HandlerDB<E> {
    
    public void insetElement(E e);
    
    public E getElement(long index);
    
    public ArrayList<E> getAllElements();
    
    public void updateElement(E e);
    
    public void deleteElement(long index);
}
