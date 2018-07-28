package herencia;

public class PruebaPersona {

    public static void main(String[] args) {
        Persona persona = new Persona();
        
        System.out.println(persona);
        
        Empleado empleado = new Empleado("Juan", "Bimbo");
        System.out.println(empleado);
        //empleado.setNombre("Juan");
        //System.out.println(empleado.getNombre());
        //empleado.setEmpresa("Bimbo");
        //System.out.println(empleado.getEmpresa());
        
        System.out.println(empleado);
        
        Maestro maestro = new Maestro("Jose", "cbtis");
        Chofer chofer = new Chofer("autobus");
        
        maestro.setNombre("Francisco");
        maestro.setEmpresa("Tec Monterrey");
        maestro.setAlumnos(20);
        
        System.out.println(maestro.getNombre() + " trabaja en " +
                maestro.getEmpresa() + " con " + maestro.getAlumnos() + " alumnos");
        
        Empleado maria = new Empleado("Maria", "Coca");
        System.out.println(maria);
                
    }
    
}
