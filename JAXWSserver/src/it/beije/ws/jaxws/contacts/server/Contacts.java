package it.beije.ws.jaxws.contacts.server;
 
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import it.beije.ws.jaxws.contacts.Contact;
 
@WebService
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL)
public interface Contacts {
	
    @WebMethod
    String[] getNames();
    
    @WebMethod
    List<Contact> getContacts();
    
    @WebMethod
    List<Contact> getContactsByName(String name);

    @WebMethod
    boolean addContact(Contact contact);
    
}