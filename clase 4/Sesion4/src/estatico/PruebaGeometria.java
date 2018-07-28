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
public class PruebaGeometria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radio = 3.5;

        System.out.println("El area con un radio de 3.5 es: " + Geometria.areaCirculo(radio));
        System.out.println("El perimetro con un radio de 3.5 es: " + Geometria.perimetroCirculo(radio));
        System.out.println("El volumen con un radio de 3.5 es: " + Geometria.volumentEsfera(radio));
    }

}
