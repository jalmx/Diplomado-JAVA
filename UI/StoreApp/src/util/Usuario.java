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
public final class Usuario {
    
    private static String name = "alejandro";
    private static String pass = "12345678";
    
    public static boolean checkUser(User user){
        return Usuario.name.equals(user.getName()) && Usuario.pass.equals(user.getPassword());
    }
}
