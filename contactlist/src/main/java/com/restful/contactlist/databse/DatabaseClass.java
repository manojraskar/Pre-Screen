package com.restful.contactlist.databse;

import java.util.HashMap;
import java.util.Map;

import com.restful.contactlist.model.Contact;

public class DatabaseClass {

	private static Map<String,Contact> contacts = new HashMap<String,Contact>();

	public static Map<String, Contact> getContacts() {
		return contacts;
	}

	public static void setContacts(Map<String, Contact> contacts) {
		DatabaseClass.contacts = contacts;
	}

}
