package br.com.store.cms.product.action;


import com.opensymphony.xwork2.ActionSupport;
import com.ssj.persistence.product.entity.Product;
import com.ssj.service.product.bean.ProductBean;

/**
 * 
 * Product Action CMS to registry product 
 * @author Carlos Silva
 * @version 1.0
 * @since 1.0
 * @see ActionSupport
 * */
public class ProductCreateCMSAction extends ProductCMSAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Method to create product
	 * @return 
	 * */
	public String create() {
		
		Product product = new Product();
		product.setName(this.getName());
		product.setDescription(this.getDescription());
		product.setOfferPrice(this.getOfferPrice());
		product.setPrice(this.getPrice());
		product.setShortName(this.getShortName());
		product.setPercentDiscount(this.getDiscount());
		
		ProductBean productBean = new ProductBean();
		productBean.setProduct(product);
		try {
			productService.create(productBean);
			addActionMessage(getText("product.create.success"));
			return SUCCESS;
			
		} catch (Exception e) {
			e.printStackTrace();
			addActionError(getText("error.product.create"));
			return ERROR;
		}
	}
	
	
}
