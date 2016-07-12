package com.restful.contactlist.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.restful.contactlist.databse.DatabaseClass;
import com.restful.contactlist.model.Contact;

public class ContactService {

	Map<String,Contact> contacts = DatabaseClass.getContacts();
	
	public ContactService(){
		contacts.put("manoj", new Contact(1L,"manoj","123-456-7890","abc@xyz.com"));
		contacts.put("contact2", new Contact(2L,"contact2","987-654-3210","abc2@xyz.com"));
	}
	public List<Contact> getAllContacts(){
		return new ArrayList<Contact>(contacts.values());
	}
	
	public Contact getContact(String contactName){
		return contacts.get(contactName);
	}
	
	public Contact addContact(Contact contact){
		contact.setId(contacts.size() + 1);
		contacts.put(contact.getContactName(), contact);
		return contact;
	}
	
	public Contact updateContact(Contact contact){
		if(contact.getContactName().isEmpty()){
			return null;
		}
		contacts.put(contact.getContactName(), contact);
		return contact;
	}
	
	public Contact removeContact(String contactName){
		return contacts.remove(contactName);
	}
}
