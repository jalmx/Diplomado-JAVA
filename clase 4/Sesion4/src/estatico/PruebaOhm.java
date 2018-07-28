package estatico;

public class PruebaOhm {

    public static void main(String[] args){
        
        LeyOhm ley1 = new LeyOhm("ley 1");
        LeyOhm.construcciones();
        LeyOhm ley2 = new LeyOhm("ley 2");
        LeyOhm.construcciones();
        
        double corriente = LeyOhm.calcularCorriente(10, 2);
        
        System.out.println("corriente es " + corriente + " amps");
        System.out.println(ley1.getNombre());
        System.out.println(ley2.getNombre());
    }
    
}
