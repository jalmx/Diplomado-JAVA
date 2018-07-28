package estatico;

public class Geometria {

    private final static double PI = 3.1416;
    
    private Geometria() {//se hace private para evitar que se creen instancias
    }

    public static double perimetroCirculo(double radio) {
        return 2 * PI * radio;
    }

    public static double areaCirculo(double radio) {
        return PI * Math.pow(radio, 2);
    }

    public static double volumentEsfera(double radio) {
        return (4 * PI * Math.pow(radio, 3)) / 3;
    }
}
