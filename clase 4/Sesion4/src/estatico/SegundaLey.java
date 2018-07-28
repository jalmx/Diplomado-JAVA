/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estatico;

/**
 *
 * @author josef
 */
public class SegundaLey {
 
    public static final double GRAVEDAD = 9.81;
    
    private SegundaLey(){}
    
    public static double getFuerza(double masa, double aceleracion){
        return masa * aceleracion;
    }
    
    //************************************************
    
    public static void main(String[] args) {
        
        double peso = SegundaLey.getFuerza(80, SegundaLey.GRAVEDAD);
       
        System.out.println("Mi peso en la tierra es: " + peso);
        
        
    }
}
