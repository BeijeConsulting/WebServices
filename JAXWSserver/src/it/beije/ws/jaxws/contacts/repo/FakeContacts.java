package it.beije.ws.jaxws.contacts.repo;

import java.util.ArrayList;
import java.util.List;

import it.beije.ws.jaxws.contacts.Contact;

public class FakeContacts {
	
	public static String[] nameArray = {"Mario", "Carlo", "Piero"};
	
	public static List<Contact> contacts = new ArrayList<Contact>();
	
	static {
		Contact c1 = new Contact("Mario", "Rossi", "m.rossi@beije.it", "3451234567");
		Contact c2 = new Contact("Carlo", "Bianchi", "c.bianchi@beije.it", "3459089897");
		Contact c3 = new Contact("Piero", "Verdi", "p.verdi@beije.it", "3455435634");
		
		contacts.add(c1);
		contacts.add(c2);
		contacts.add(c3);
	}

}
