package mainn;

public class Mainn {

    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo();
        
        System.out.println("Area: " +rectangulo.area(10, 5));
        System.out.println("Area: " +rectangulo.area(5.2, 6.3));
        System.out.println("Perimetro: "+ rectangulo.perimetro(6, 8));
        System.out.println("Perimetro: " +rectangulo.perimetro(5.2, 6.3));
        
        System.out.println("--------------------------------------------------------------");
        
        
        Empleado empleado = new Empleado();
        System.out.println("Salario: " + empleado.calcularSalario(50000));
        System.out.println("Sueldo y bonificación: " + empleado.calcularSalario(50000, 2000));
        System.out.println("Sueldo, bonificación y horas extras: " + empleado.calcularSalario(50000, 2000, 500));
        
        System.out.println("--------------------------------------------------------------");
        
        CalculadoraImpuestos calculadoraimpuestos =new CalculadoraImpuestos();
        System.out.println("Salario: " + calculadoraimpuestos.calcularImpuestos(6000));
        System.out.println("Ingresos y Porcentajes: " + calculadoraimpuestos.calcularImpuestos(60000, 80));
        System.out.println("Ingresos: " + calculadoraimpuestos.calcularImpuestos(500, 40, 10));
    }
    
}
