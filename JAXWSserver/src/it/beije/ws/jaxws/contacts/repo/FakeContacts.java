package it.beije.ws.jaxws.contacts.repo;

import java.util.ArrayList;
import java.util.List;

import it.beije.ws.jaxws.contacts.Contact;

public class FakeContacts {
	
	public static String[] nameArray = {"Mario", "Carlo", "Piero"};
	
	public static List<Contact> contacts = new ArrayList<Contact>();
	
	static {
		Contact c1 = new Contact("Mario", "Rossi", "m.rossi@beije.it", "3451111111");
		Contact c2 = new Contact("Carlo", "Bianchi", "c.bianchi@beije.it", "3452222222");
		Contact c3 = new Contact("Piero", "Verdi", "p.verdi@beije.it", "3453333333");
		Contact c4 = new Contact("Piero", "Brambilla", "p.brambilla@beije.it", "3494444444");
		
		contacts.add(c1);
		contacts.add(c2);
		contacts.add(c3);
		contacts.add(c4);
	}
	
	public static List<Contact> findContactsByName(String name) {
		List<Contact> contactsByName = new ArrayList<Contact>();
		
		for (Contact c : contacts) {
			if (c.getName().equalsIgnoreCase(name)) {
				contactsByName.add(c);
			}
		}
		
		return contactsByName;
	}

}
