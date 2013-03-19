package com.ssj.service.spot.interfaces.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssj.persistence.product.entity.Category;
import com.ssj.persistence.spot.dao.BannerSliderDao;
import com.ssj.persistence.spot.entity.BannerSlider;
import com.ssj.service.spot.bean.BannerSliderBean;
import com.ssj.service.spot.interfaces.BannerSliderService;

/**
 * 
 * Implementation of the BannerSlider service to operate its
 * @author Carlos Silva
 * @since 2013
 * @see BannerSliderService
 * */
@Service("BannerSliderServiceImpl")
public class BannerSliderServiceImpl implements BannerSliderService {

	@Autowired
	private BannerSliderDao dao;
	
	@Override
	public void create(BannerSliderBean t) throws Exception {
		this.dao.create(t.getBannerSlider());
	}

	@Override
	public BannerSliderBean read(BannerSliderBean t) throws Exception {
		t.setBannerSlider(
				this.dao.read(BannerSlider.class, t.getId()));
		return t;
	}	

	@Override
	public void delete(BannerSliderBean t) throws Exception {
		this.dao.delete(t.getBannerSlider());
	}

	@Override
	public void update(BannerSliderBean t) throws Exception {
		this.dao.update(t.getBannerSlider());

	}

	@Override
	public BannerSliderBean load(BannerSliderBean t) throws Exception {
		t.setBannerSlider(
				this.dao.load(BannerSlider.class, t.getId()));
		return t;
	}

	@Override
	public List<BannerSlider> listAll() throws Exception {
		return this.dao.listAll();
	}

	@Override
	public List<BannerSlider> listAllByCategory(Category category) throws Exception {
		return this.dao.listAllByCategory(category);
	}
}
