package herencia;

import java.awt.Button;
import java.awt.Color;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ventana extends JFrame {
    
    public Ventana() {
        super("Mi ventana");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Button miBoton = new Button("Mi boton");
        Button miBoton2 = new Button("Mi boton");
        Label etiqueta = new Label("Mi etiqueta");
        
        miBoton.setSize(20, 20);
        
        add(miBoton);
        add(etiqueta);
        
        miBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }

    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);//sale la ventana en el centro de la pantalla
    }

}
