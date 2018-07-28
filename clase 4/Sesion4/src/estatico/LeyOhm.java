package estatico;

public class LeyOhm {

    private String nombre;
    private static int cuenta = 0;

    public LeyOhm(String nombre) {
        this.nombre = nombre;
        cuenta++;
    }

    public String getNombre() {
        return nombre;
    }

    public static void construcciones() {
        System.out.println(cuenta);
    }

    public static double calcularCorriente(double voltaje, double resistencia) {
        return voltaje / resistencia;
    }

    public static double calcularVoltaje(double corriente, double resistencia) {
        return corriente * resistencia;
    }

    public static double calcularResistencia(double voltaje, double corriente) {
        return voltaje / corriente;
    }

}
