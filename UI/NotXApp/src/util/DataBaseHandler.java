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
 */
public class DataBaseHandler implements HandlerDB<Note> {

    private static ArrayList<Note> noteList;
    private static DataBaseHandler dataBaseHandler= null;
    
    private DataBaseHandler(){}
    
    public static DataBaseHandler getInstance(){
        if(dataBaseHandler == null){
            dataBaseHandler = new DataBaseHandler();
            noteList = new ArrayList<>();
        }
        return dataBaseHandler;
    }
    
    @Override
    public void insetElement(Note e) {
        noteList.add(e);
    }

    @Override
    public Note getElement(long index) {
        return noteList.get((int)index);
    }

    @Override
    public ArrayList<Note> getAllElements() {
        return noteList;
    }

    @Override
    public void updateElement(Note e) {
        noteList.remove((int)e.getId());
        noteList.add((int)e.getId(),e);
    }

    @Override
    public void deleteElement(long index) {
        noteList.remove((int)index);
    }

}
