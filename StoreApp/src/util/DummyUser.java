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
public final class DummyUser {
    
    private DummyUser(){}
    
    private static String USER = "leyva";
    private static String PASS = "8888";
    
    public static boolean checkUser(User user){
        return USER.equals(user.getName()) && PASS.equals(user.getPassword());
    }
}
