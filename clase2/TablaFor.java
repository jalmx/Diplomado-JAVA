
public class TablaFor{

    public static void main(String[] args) {

        int tabla = 7;

        System.out.println("|--------------------|");
        System.out.println("| Tabla del " + tabla);
        System.out.println("|--------------------|");

        for (int i = 1; i <= 10; i++) {
            int resultado = tabla * i;
            System.out.println( tabla + " X " + i + " = " +resultado);
        }
    }
}