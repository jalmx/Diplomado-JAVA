/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author josef
 */
public final class User {
    
    private final String user;
    private final String password;

    public User(String name, String password) {
        this.user = name;
        this.password = password;
    }

    public String getName() {
        return user;
    }

    public String getPassword() {
        return password;
    }
    
}
