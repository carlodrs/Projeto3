package com.ssj.persistence.account.user.dao.iml;

import org.springframework.stereotype.Component;

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
@Component("EclientDaoImpl")
public class EclientDaoImpl extends SSJGenericDaoImpl<Eclient>implements EclientDao {
}
