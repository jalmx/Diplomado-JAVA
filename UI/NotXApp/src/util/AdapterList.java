/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;
import javax.swing.AbstractListModel;

/**
 *
 * @author josef
 */
public class AdapterList extends AbstractListModel<Note> {

    private final ArrayList<Note> notesList;

    public AdapterList(ArrayList<Note> notesList) {
        this.notesList = notesList;
    }

    @Override
    public int getSize() {
        return notesList.size();
    }

    @Override
    public Note getElementAt(int index) {
        return notesList.get(index);
    }
    
    
    
    
}
