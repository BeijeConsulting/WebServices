package it.beije.ws.jaxws.contacts.server;
 
import javax.xml.ws.Endpoint;
 
public class ContactsPublisher {
	
	//wsimport -keep -p it.beije.ws.jaxws.contacts.client http://localhost:9000/contacts?wsdl
 
    public static void main(String[] args) {
    	System.out.println("ContactsPublisher...");
        Endpoint.publish("http://localhost:9000/contacts", new ContactsImpl());
    }
 
}