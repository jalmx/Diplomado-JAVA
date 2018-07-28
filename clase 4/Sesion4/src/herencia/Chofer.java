/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author josef
 */
public class Chofer extends Empleado{
    
    private String transporte;

    public Chofer(String transporte) {
        super("Sin nombre del chofer", "sin trabajo");
        this.transporte = transporte;
    }

    public String getTransporte() {
        return transporte;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }

    @Override
    public String toString() {
        return "Chofer{" + "transporte=" + transporte + '}';
    }
    
}
