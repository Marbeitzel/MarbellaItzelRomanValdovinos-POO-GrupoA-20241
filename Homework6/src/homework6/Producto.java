
package homework6;

public class Producto {
    
    private String name = "Leche";
    private double precio = 20.5;
    private int stock = 1;
    
     public Producto(String name, double precio, int stock)
    {
        this.name = name;
        this.precio = precio;
        this.stock = stock;      
    }
     
     public Producto(String name, double precio)
    {
        this.name = name;
        this.precio = precio;
        stock=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        if(name==null)
        {
            System.out.println("No es valido");
        }
        else
        {
            this.name = name;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if(precio<0)
        {
            System.out.println("No es valido");
        }
        else
        {
            this.precio = precio;
        }
            
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
         if(stock<0)
        {
            System.out.println("No es valido");
        }
        else
        {
            this.stock = stock;
        }
    }
     
    double aumentarStock(int cantidad)
    {
        if (cantidad>0)
        {
            stock = stock + cantidad;
            return stock;
        }    
        else
        {
            return stock;
        }
    }
    
    double disminuirStock(int cantidad)
    {
        if (cantidad>0 && cantidad>= stock)
        {
            stock = stock - cantidad;
            return stock;
        }
        else 
        {
            return stock;
        }
    
    
    }
    
}
