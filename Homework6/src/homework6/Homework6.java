
package homework6;

public class Homework6 {

   
    public static void main(String[] args) {
        Producto producto = new Producto("Leche", 20.5, 1);
        
        System.out.println("Nombre del producto: " + producto.getName());
        System.out.println("Precio del producto: " +producto.getPrecio());
        System.out.println("Stock del producto: " +producto.getStock());
        System.out.println("Stock Aumentado:" + producto.aumentarStock(5));
        System.out.println("Stock Disminuido: " + producto.disminuirStock(7));
    }
    
}
