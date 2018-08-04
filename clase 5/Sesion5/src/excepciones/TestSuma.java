package excepciones;

public class TestSuma {

    public static void main(String[] args) {
        
        Matematicas.suma(4, 6);
        
        try {
            Matematicas.resta(0, 0);
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
       
    }
    
}
