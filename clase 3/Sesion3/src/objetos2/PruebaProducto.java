
package objetos2;

public class PruebaProducto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto producto = new Producto();
        
        producto.setNombre("Frijoles");
        producto.setPrecio(20);
        producto.setCantidad("2 kilos");
        
        producto.descripcionProducto();
    }
    
}
