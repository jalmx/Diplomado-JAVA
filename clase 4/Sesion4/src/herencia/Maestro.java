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
public class Maestro extends Empleado{
    
    private int alumnos;

    public Maestro(String nombre, String empresa) {
        super(nombre, empresa);
    }
    
    public Maestro(String nombre, String empresa, int alumnos) {
        super(nombre, empresa);
        this.alumnos = alumnos;
    }

    public int getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(int alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Maestro{" + "alumnos=" + alumnos + '}';
    }
    
}
