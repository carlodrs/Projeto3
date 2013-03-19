package com.ssj.persistence.spot.dao.impl;

import java.util.List;

import javassist.NotFoundException;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.ssj.persistence.generic.dao.impl.SSJGenericDaoImpl;
import com.ssj.persistence.product.entity.Category;
import com.ssj.persistence.spot.dao.BannerSliderDao;
import com.ssj.persistence.spot.entity.BannerSlider;

/**
 * 
 * Inteface Banner to handle Banner slider on database
 * @author Carlos Silva
 * @since 2013
 * @version 1.0
 * @see BannerSlider
 * */
@Repository("BannerSliderDaoImpl")
public class BannerSliderDaoImpl extends 
	SSJGenericDaoImpl<BannerSlider> implements BannerSliderDao {

	@Override
	public List<BannerSlider> listAll() throws Exception {
		
		CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
		CriteriaQuery<BannerSlider> criteriaQuery = criteriaBuilder.createQuery(BannerSlider.class);
		criteriaQuery.from(BannerSlider.class);
		
		TypedQuery<BannerSlider> typedQuery = getEntityManager().createQuery(criteriaQuery);
		
		try {
			List<BannerSlider> bannerSliders = typedQuery.getResultList();
			return bannerSliders;
		} catch (Exception e) {
			throw new NotFoundException("Content Spots not found ", e);
		}
	}

	@Override
	public List<BannerSlider> listAllByCategory(Category category) throws Exception {
		CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
		CriteriaQuery<BannerSlider> criteriaQuery = criteriaBuilder.createQuery(BannerSlider.class);
		Root<BannerSlider> root = criteriaQuery.from(BannerSlider.class);
		criteriaQuery.where(
				criteriaBuilder.equal(root.get("category"), category));
				criteriaQuery.orderBy(criteriaBuilder.asc(root.get("sequence")));
		
		TypedQuery<BannerSlider> typedQuery = getEntityManager().createQuery(criteriaQuery);
		
		try {
			List<BannerSlider> bannerSliders = typedQuery.getResultList();
			return bannerSliders;
		} catch (Exception e) {
			throw new NotFoundException("Banners not found ", e);
		}
	}
	

}
