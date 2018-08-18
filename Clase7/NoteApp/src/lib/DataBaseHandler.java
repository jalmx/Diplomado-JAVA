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
public class DataBaseHandler implements HandlerDB<Nota>{

    private static DataBaseHandler dataBaseHandler = null;
    private static ArrayList<Nota> db = null;
    
    private DataBaseHandler(){
        
    }
    
    public static DataBaseHandler getInstance(){
        if(dataBaseHandler == null){
            dataBaseHandler = new DataBaseHandler();
            db = new ArrayList();
        }
        return dataBaseHandler;
    }
    
    @Override
    public void insertElement(Nota e) {
        db.add(e);
    }

    @Override
    public Nota getElement(int id) {
       return db.get(id);
    }

    @Override
    public ArrayList<Nota> getAllElements() {
        return db;
    }

    @Override
    public void updateElement(Nota e) {
        db.remove(e.getId());
        db.add(e.getId(), e);
    }

    @Override
    public void deleteElement(int id) {
        db.remove(id);
    }
    
}
