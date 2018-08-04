/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import javax.swing.JOptionPane;

/**
 *
 * @author josef
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean termino = true;
        
        while (termino) {
            try {
                String valor1 = JOptionPane.showInputDialog(null, "Dar primer valor");
                double v1 = Double.parseDouble(valor1);

                String valor2 = JOptionPane.showInputDialog(null, "Dar segundo valor");
                double v2 = Double.parseDouble(valor2);

                JOptionPane.showMessageDialog(null, v1 + v2);
                termino = false;

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Diste un valor no posible",
                        "Error en la operacion", JOptionPane.ERROR_MESSAGE);
            }
        }

    }

}
