package com.restful.contactlist.resource;

import java.net.URI;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

import com.restful.contactlist.model.Contact;
import com.restful.contactlist.service.ContactService;

@Path("/contacts")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ContactResource {

	ContactService contactService = new ContactService();
	
	@GET
	public List<Contact> getAllContacts(){
		return contactService.getAllContacts();
	}
	
	@GET
	@Path("/{contactName}")
	public Contact getContact(@PathParam("contactName") String contactName){
		return contactService.getContact(contactName);
	}
	
	@POST
	public Contact addContact(Contact contact, @Context UriInfo uriInfo){
		/* creating custom response */
		/*Contact newContact = contactService.addContact(contact);
		 return Response.status(Status.CREATED)
		.entity(newContact)
		.build();
		*/
		
		// Path builder to add location in header
		/*URI uri = uriInfo.getAbsolutePathBuilder()
				.path(newContact.getContactName())
				.build();
		return Response.created(uri)
				.entity(newContact)
				.build(); */
		
		return contactService.addContact(contact);
	}
	
	@PUT
	@Path("/{contactName}")
	public Contact updateContact(@PathParam("contactName") String contactName, Contact contact){
		contact.setContactName(contactName);
		return contactService.updateContact(contact);
	}
	
	@DELETE
	@Path("/{contactName}")
	public void deleteContact(@PathParam("contactName") String contactName){
		contactService.removeContact(contactName);
	}
	
}
