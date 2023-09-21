package it.beije.ws.tester;

import java.util.List;

import it.beije.ws.jaxws.contacts.client.Contact;
import it.beije.ws.jaxws.contacts.client.Contacts;
import it.beije.ws.jaxws.contacts.client.ContactsImplService;


public class ContactsClient {

	public static void main(String[] args) {
		ContactsImplService service = new ContactsImplService();
		Contacts contactService = service.getContactsImplPort();
		
		System.out.println("Names : " + contactService.getNames());
		
		System.out.println("\n##### CONTATTI #####");
		List<Contact> contactList = contactService.getContacts();
		for (Contact c : contactList) {
			System.out.println(c);
		}
		
		String name = "mario";
		System.out.println("\n##### CONTATTI CON NOME " + name + " #####");
		List<Contact> contactListByName = contactService.getContactsByName(name);
		for (Contact c : contactListByName) {
			System.out.println(c);
			
		}
		
		Contact newContact = new Contact();
		newContact.setName("Nicolò");
		newContact.setSurname("Faina");
		newContact.setEmail("n.faina@beije.it");
		newContact.setPhoneNumber("3487777777");
		System.out.println("add contact... " + contactService.addContact(newContact));
	}
	
}
