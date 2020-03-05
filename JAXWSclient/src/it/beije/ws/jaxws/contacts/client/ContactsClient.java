package it.beije.ws.jaxws.contacts.client;

import java.util.List;

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
			
			contactService.addContact(c);
		}
	}
	
}
