package com.ssj.persistence.account.user.dao.iml;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.ssj.persistence.account.user.dao.EclientDao;
import com.ssj.persistence.account.user.entity.Eclient;
import com.ssj.persistence.generic.dao.impl.SSJGenericDaoImpl;

/**
 * 
 * DAO Implementation to handle Eclient
 * @version 1.0
 * @author Carlos Renato Silva
 * @since 2013
 * 
 * Shopping São João
 * 
 * */
@Repository
public class EclientDaoImpl extends SSJGenericDaoImpl<Eclient>implements EclientDao {
}
