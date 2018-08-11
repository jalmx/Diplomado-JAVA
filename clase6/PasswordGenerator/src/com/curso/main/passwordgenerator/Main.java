/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.main.passwordgenerator;

import com.curso.view.MainFrame;

/**
 *
 * @author josef
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainFrame ventana =new MainFrame();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);//poner en el centro de pantalla la ventana
    }
    
}
