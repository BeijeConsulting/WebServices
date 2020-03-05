package it.beije.ws.jaxws.calculator.server;
 
import javax.xml.ws.Endpoint;
 
public class CalcPublisher {
	
	//wsimport -keep -p it.beije.ws.jaxws.calculator.client http://localhost:9000/calcServer?wsdl
 
    public static void main(String[] args) {
    	System.out.println("CalcPublisher...");
        Endpoint ep = Endpoint.create(new CalculatorImpl());
        ep.publish("http://localhost:9000/calcServer");
    }
 
}