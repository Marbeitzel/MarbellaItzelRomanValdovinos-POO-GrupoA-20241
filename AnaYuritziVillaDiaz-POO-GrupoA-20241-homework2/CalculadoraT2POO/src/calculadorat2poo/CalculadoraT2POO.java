
package calculadorat2poo;

public class CalculadoraT2POO {

    public static void main(String[] args) {
         calculadora calculadora= new calculadora(8,9);
        System.out.println(calculadora.suma());
        System.out.println(String.format("\nSuma: %.2f", calculadora.suma()));
        System.out.println(String.format("\nResta: %f", calculadora.resta()));
        System.out.println(String.format("\nMultiplicacion: %f", calculadora.multiplicacion()));
        
        System.out.println("Haciendo cambios");
    }
    
}
