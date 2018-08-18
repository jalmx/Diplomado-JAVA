/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

import java.util.ArrayList;

/**
 *
 * @author josef
 */
public interface HandlerDB<E> {
    
     public void insertElement(E e);
    
    public E getElement(int id);
    
    public ArrayList<E> getAllElements();
    
    public void updateElement(E e);
    
    public void deleteElement(int id);
}
