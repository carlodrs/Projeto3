/**
 * 
 */
package com.ssj.service.contact.interfaces.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssj.persistence.contact.dao.ContactDao;
import com.ssj.persistence.contact.entity.Contact;
import com.ssj.service.contact.interfaces.ContactService;

/**
 * 
 * Implements of {@link ContactService}
 * @author Carlos Silva
 * 
 *
 */
@Service("ContactServiceImpl")
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactDao contactDao;
	
	/* Register the contact
	 * @see com.ssj.service.Service#create(java.io.Serializable)
	 */
	@Override
	public void create(Contact contact) throws Exception {
		this.contactDao.create(contact);	
	}

	@Override
	public Contact read(Contact t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Contact t) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Contact t) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Contact load(Contact t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
