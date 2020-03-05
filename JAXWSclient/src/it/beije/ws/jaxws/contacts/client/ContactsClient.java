package it.beije.ws.jaxws.contacts.client;

import java.util.List;

public class ContactsClient {

	public static void main(String[] args) {
		ContactsImplService service = new ContactsImplService();
		Contacts contactService = service.getContactsImplPort();
		
		System.out.println(contactService.getNames());
		
		List<Contact> contactList = contactService.getContacts();
		for (Contact c : contactList) {
			System.out.println(c);
		}
	}
	
}
