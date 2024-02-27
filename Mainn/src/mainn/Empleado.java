package mainn;

public class Empleado {
    
    
    
    double calcularSalario( double sueldoBase)
    {
        return sueldoBase;
    }
    
    double calcularSalario( double sueldoBase, double bonificación)
    {
        return sueldoBase + bonificación;
    }
    
    double calcularSalario( double sueldoBase, double bonificación, double horasExtras)
    {
        return sueldoBase + bonificación + (horasExtras * 20);
    }
    
}
