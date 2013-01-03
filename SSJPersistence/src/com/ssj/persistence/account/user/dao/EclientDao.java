package com.ssj.persistence.account.user.dao;

import org.springframework.stereotype.Component;

import com.ssj.persistence.account.user.entity.Eclient;
import com.ssj.persistence.generic.dao.SSJGenericDao;

/**
 * 
 * Interface DAO to handle Eclient
 * @version 1.0
 * @author Carlos Renato Silva
 * @since 2013
 * 
 * Shopping São João
 * 
 * */
@Component("EclientDao")
public interface EclientDao extends SSJGenericDao<Eclient>  {
}
