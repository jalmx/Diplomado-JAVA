package herencia;

public class Empleado extends Persona{
    
    private String rfc;
    private String empresa;

    public Empleado(String nombre, String empresa){
        super(nombre);
        this.empresa = empresa;
    }
    
//    public Empleado() {
//        super("Pablo");
//    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return super.getNombre() + " Empleado{" + "rfc=" + rfc + ", empresa=" + empresa + '}';
    }
    
}
