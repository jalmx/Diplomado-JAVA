package genericos;

import java.util.ArrayList;

public class Crudo {

    public static void main(String[] args) {
        
        ArrayList<String> lista = new ArrayList<>();
        
        lista.add("nombre");
        lista.add("mensaje");
        
        ArrayList lista2 = new ArrayList();//tipo RAW
        
        lista2.add("mensaje");
        lista2.add(3);
        lista2.add(new Object());
        
    }
    
}
