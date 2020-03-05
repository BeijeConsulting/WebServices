package it.beije.ws.jaxws.contacts.server;

import java.util.List;

import javax.jws.WebService;

import it.beije.ws.jaxws.contacts.Contact;
import it.beije.ws.jaxws.contacts.repo.FakeContacts;

@WebService(endpointInterface = "it.beije.ws.jaxws.contacts.server.Contacts")
public class ContactsImpl implements Contacts {

	@Override
	public String[] getNames() {
		return FakeContacts.nameArray;
	}

	@Override
	public List<Contact> getContacts() {
		return FakeContacts.contacts;
	}

	@Override
	public List<Contact> getContactsByName(String name) {
		return FakeContacts.findContactsByName(name);
	}

	@Override
	public boolean addContact(Contact contact) {
		System.out.println(contact);
		
		if (contact.getName() != null
				&& contact.getSurname() != null
				&& contact.getEmail() != null
				&& contact.getPhoneNumber() != null) {
			return true;
		} else {
			return false;
		}
	}

}
