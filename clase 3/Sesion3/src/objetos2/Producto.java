package objetos2;

public class Producto {
    
    private double precio;
    private String nombre;
    private String cantidad;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
    
    public void descripcionProducto(){
        System.out.println(nombre + " y su precio es $" + precio +
                " hay " + cantidad);
    }
}
