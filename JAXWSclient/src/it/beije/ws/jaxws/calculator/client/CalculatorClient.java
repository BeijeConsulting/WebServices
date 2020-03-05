package it.beije.ws.jaxws.calculator.client;
 
public class CalculatorClient {
 
    public static void main(String[] args) {
        CalculatorImplService service = new CalculatorImplService();
        Calculator calc = service.getCalculatorImplPort();
        
        int a = 5;
        int b = 2;
        int c = 7;
        int d = 4;
        
        System.out.println(a + " + " + b + " = " + calc.add(a, b));
        System.out.println(b + " - " + c + " = " + calc.subtract(b, c));
        System.out.println(d + " * " + d + " = " + calc.multiply(d, d));
        System.out.println(c + " / " + b + " = " + calc.divide(c, b));
    }
 
}
