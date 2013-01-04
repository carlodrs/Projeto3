package com.ssj.persistence.account.user.dao.iml;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.ssj.persistence.account.user.dao.PartnerDao;
import com.ssj.persistence.account.user.entity.Partner;

/**
 * 
 * DAO Implementation to handle Client Sys ( E-client como prestador de servi�os )
 * @version 1.0
 * @author Carlos Renato Silva
 * @since 2013
 * 
 * Shopping S�o Jo�o
 * 
 * */
@Repository
@Qualifier("PartnerDaoImpl")
public class PartnerDaoImpl 
	extends UserDaoImpl implements PartnerDao<Partner> {}
