package com.ssj.persistence.contact.dao.impl;

import org.springframework.stereotype.Repository;

import com.ssj.persistence.contact.dao.ContactDao;
import com.ssj.persistence.contact.entity.Contact;
import com.ssj.persistence.generic.dao.impl.SSJGenericDaoImpl;

/**
 * Implementation Class dao to create the contact register information user
 * @since 2013
 * @author Carlos Silva
 * @version 1.0
 * @see ContactDao
 * */
@Repository("ContactDaoImpl")
public class ContactDaoImpl 
	extends SSJGenericDaoImpl<Contact>implements ContactDao {

}
