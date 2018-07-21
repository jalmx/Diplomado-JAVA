
public class Auto{//inicia la clase

    public int noPuertas;//declarando atributo tipo entero
    public long kilometraje;//declarando atributo tipo entero largo

    public void arrancar(){//inicia método arrancar
        System.out.println("Arrancando....");
    }//termina método arrancar

    public void acelerar(){//inicia método acelerar
        aceleracion();
    }//termina método acelerar

    private void aceleracion(){
        System.out.println("Acelerando a 100km/h");
    }

}//termina la clase