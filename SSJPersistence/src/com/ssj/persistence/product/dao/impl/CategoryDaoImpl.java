/**
 * 
 */
package com.ssj.persistence.product.dao.impl;

import org.springframework.stereotype.Component;

import com.ssj.persistence.generic.dao.impl.SSJGenericDaoImpl;
import com.ssj.persistence.product.dao.CategoryDao;
import com.ssj.persistence.product.entity.Category;

/**
 * 
 * Implementation Data access object from CategoryDao interface
 * @author Carlos Silva
 * @version 1.0
 * @since 2013
 *
 */
@Component("CategoryDaoImpl")
public class CategoryDaoImpl extends SSJGenericDaoImpl<Category> 
		implements CategoryDao {
}
