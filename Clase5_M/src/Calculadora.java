
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean ok = true;//saber si todo a sido correcto 
        
        while (ok) {
            
            try {
                String valor1 = JOptionPane.showInputDialog("Dar un valor para la suma");
                int v1 = Integer.parseInt(valor1);
                
                String valor2 =  JOptionPane.showInputDialog("Dar un segundo valor para la suma");
                int v2 = Integer.parseInt(valor2);
                
                int suma = v1 + v2;
                
                JOptionPane.showMessageDialog(null, String.format("La suma es %d", suma));
                ok= false;
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Hubo un error, dar valores de nuevo");
                ok= true;
            }

        }

    }

}
