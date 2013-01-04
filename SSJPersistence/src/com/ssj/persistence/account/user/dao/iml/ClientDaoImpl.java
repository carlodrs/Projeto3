package com.ssj.persistence.account.user.dao.iml;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.ssj.persistence.account.user.dao.ClientDao;
import com.ssj.persistence.account.user.entity.Client;

/**
 * 
 * DAO Implementation to handle Client
 * @version 1.0
 * @author Carlos Renato Silva
 * @since 2013
 * 
 * Shopping São João
 * 
 * */
@Repository
@Qualifier("ClientDaoImpl")
public class ClientDaoImpl extends UserDaoImpl implements ClientDao<Client> {
}
