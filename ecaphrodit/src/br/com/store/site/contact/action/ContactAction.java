package br.com.store.site.contact.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.ssj.persistence.contact.entity.Contact;
import com.ssj.service.contact.interfaces.ContactService;

/**
 * Action to register the contact user
 * @author Carlos Silva
 * @version 1.0
 * @since 2012
 * 
 * */
public class ContactAction extends ActionSupport {

	@Autowired
	private ContactService contactService;
	private Contact contact;	

	/**
	 * serial id 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Method to register the contact
	 * @throws Exception
	 * */
	public void register() throws Exception{
		this.contactService.create(contact);
	}

	/**
	 * @return the contact
	 */
	public Contact getContact() {
		return contact;
	}

	/**
	 * @param contact the contact to set
	 */
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	
}