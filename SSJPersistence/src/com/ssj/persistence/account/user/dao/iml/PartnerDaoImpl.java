package com.ssj.persistence.account.user.dao.iml;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.ssj.persistence.account.user.dao.PartnerDao;
import com.ssj.persistence.account.user.entity.Partner;

/**
 * 
 * DAO Implementation to handle Client Sys ( E-client como prestador de serviços )
 * @version 1.0
 * @author Carlos Renato Silva
 * @since 2013
 * 
 * Shopping São João
 * 
 * */
@Repository
@Qualifier("PartnerDaoImpl")
public class PartnerDaoImpl 
	extends UserDaoImpl implements PartnerDao<Partner> {}
