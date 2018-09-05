/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.util.ArrayList;

/**
 *
 * @author josef
 */
public interface DAO<E> {
   
    public void insert(E e);
    
    public E get(int id);
    
    public ArrayList<E> getAll();
    
    public void update(E e);
    
    public void delete(int id);
}
