/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.time.LocalDate;

/**
 *
 * @author josef
 */
public class Note {

    private final String title;
    private String message;
    private final String dateCreate = LocalDate.now().toString();
    private String dateEdit;
    private long id;

    public Note(String title, long id) {
        this.title = title;
        this.id = id;
    }

    public Note(String title, String message, String dateEdit, long id) {
        this.title = title;
        this.message = message;
        this.dateEdit = dateEdit;
        this.id = id;
    }

    public Note(String title, String message, long id) {
        this.title = title;
        this.message = message;
        this.id = id;
    }

    public Note(String title) {
        this.title = title;
    }

    public Note(String title, String message) {
        this.title = title;
        this.message = message;
    }

    public Note(String title, String message, String dateEdit) {
        this.title = title;
        this.message = message;
        this.dateEdit = dateEdit;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDateEdit() {
        return dateEdit;
    }

    public void setDateEdit(String dateEdit) {
        this.dateEdit = dateEdit;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getDateCreate() {
        return dateCreate;
    }

}
