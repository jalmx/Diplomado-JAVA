public class TablaWhile{
    public static void main(String[] args) {
        
        int tabla = 9; //el valor de la tabla
        int contador  = 1; //variable que me ayuda a saber en que valor voy

        while(contador <= 10){
            
            int resultado = tabla * contador;
            
            System.out.println(resultado);
            
            contador++; //debo manejar la variable que será mi bandera que indica que debo salir
        }

        int variable = 50;

        do{
            System.out.println("entro al do - while");
            variable++;

        }while(variable < 10);

    }
}