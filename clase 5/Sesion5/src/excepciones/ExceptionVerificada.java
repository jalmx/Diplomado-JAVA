/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.io.File;
import java.io.FileInputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author josef
 */
public class ExceptionVerificada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        File file = new File("");
        try{
            
            FileInputStream fis= new FileInputStream(file);
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(
                    null,
                    "Error al abir el archivo", 
                    "Error en el archivo", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
}
