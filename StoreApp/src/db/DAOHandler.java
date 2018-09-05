/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

/**
 *
 * @author josef
 */
public abstract class DAOHandler<E> implements DAO<E>{
    
    public abstract void closeDB();
}
