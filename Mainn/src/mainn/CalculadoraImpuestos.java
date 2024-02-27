package mainn;

public class CalculadoraImpuestos {
    
    double calcularImpuestos(int ingresos)
    {
         return ingresos + 0.15;
    }
    
    double calcularImpuestos(int ingresos, double porcentajeImpuestos)
    {
        return ingresos * (porcentajeImpuestos / 100);
    }
    
    double calcularImpuestos(double porcentajeImpuestos, double dividendos, double extención)
    {
       double impuestos =dividendos * (porcentajeImpuestos / 100);
       if(impuestos > extención)
       {
           return  impuestos - extención; 
       }
       else {
           return 0;
       }
       
    }
    
    
}
