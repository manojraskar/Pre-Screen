package com.restful.contactlist.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Contact {

	private long id;
	private String contactName;
	private String phoneNumber;
	private String email;
	
	public Contact(){
		
	}
	
	public Contact(long id,String contactName,String phoneNumber,String email){
		this.id = id;
		this.contactName = contactName;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
