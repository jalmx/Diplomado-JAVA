/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estatico;

import javax.swing.JOptionPane;

/**
 *
 * @author josef
 */
public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog("Dar un valor");
        String valor2 = JOptionPane.showInputDialog("Dar otro valor");
        
        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);
        double resulta = numero1 + numero2;
        
        JOptionPane.showMessageDialog(null, "El resultado es: "+resulta);
        
    }
    
}
