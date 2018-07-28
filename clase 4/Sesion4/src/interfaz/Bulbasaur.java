/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author josef
 */
public class Bulbasaur implements Planta, Veneno {

    @Override
    public void lanzarSemillas() {
        System.out.println("Lanza semillas");
    }

    @Override
    public void envenenar() {
        System.out.println("Lanza mordida venenosa");
    }

}
