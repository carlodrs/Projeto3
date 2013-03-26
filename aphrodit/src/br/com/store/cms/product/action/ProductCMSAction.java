package br.com.store.cms.product.action;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.store.site.upload.action.BaseUploadActionSupport;

import com.opensymphony.xwork2.ActionSupport;
import com.ssj.persistence.product.entity.Attribute;
import com.ssj.persistence.product.entity.Category;
import com.ssj.persistence.product.entity.Product;
import com.ssj.service.product.bean.CategoryBean;
import com.ssj.service.product.bean.ProductBean;
import com.ssj.service.product.interfaces.AttributeService;
import com.ssj.service.product.interfaces.CategoryService;
import com.ssj.service.product.interfaces.ProductService;

/**
 * 
 * Product Action CMS to registry product 
 * @author Carlos Silva
 * @version 1.0
 * @since 1.0
 * @see ActionSupport
 * */
           
public class ProductCMSAction 
	extends BaseUploadActionSupport {

	//logger
	private static Logger logger = Logger.getLogger(
			ProductCMSAction.class.getName());
	
	private Product product;
	private List<Product> products;
	private List<Category> categories = new ArrayList<Category>();
	private String[] listAttributes = new String[]{};
	

	//image file
	private File image;
	private File thumb1;
	private File thumb2;
	private File thumb3;
	private File thumb4;
	
	//image file name
	private String imageFileName;
	private String thumb1FileName;
	private String thumb2FileName;
	private String thumb3FileName;
	private String thumb4FileName;
	
	//image content type
	private String imageContentType;
	private String thumb1ContentType;
	private String thumb2ContentType;
	private String thumb3ContentType;
	private String thumb4ContentType;

	@Autowired
	protected ProductService productService;
	
	@Autowired
	protected CategoryService categoryService;
	
	@Autowired
	protected AttributeService attributeService;
	
	 
	/**
	 * @return the listAttributes
	 */
	public String[] getListAttributes() {
		return listAttributes;
	}



	/**
	 * @param listAttributes the listAttributes to set
	 */
	public void setListAttributes(String[] listAttributes) {
		this.listAttributes = listAttributes;
	}



	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}



	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}



	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the products
	 */
	public List<Product> getProducts() {
		return products;
	}

	/**
	 * @param products the products to set
	 */
	public void setProducts(List<Product> products) {
		this.products = products;
	}



	/**
	 * @return the image
	 */
	public File getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(File image) {
		this.image = image;
	}

	/**
	 * @return the thumb1
	 */
	public File getThumb1() {
		return thumb1;
	}

	/**
	 * @param thumb1 the thumb1 to set
	 */
	public void setThumb1(File thumb1) {
		this.thumb1 = thumb1;
	}

	/**
	 * @return the thumb2
	 */
	public File getThumb2() {
		return thumb2;
	}

	/**
	 * @param thumb2 the thumb2 to set
	 */
	public void setThumb2(File thumb2) {
		this.thumb2 = thumb2;
	}

	/**
	 * @return the thumb3
	 */
	public File getThumb3() {
		return thumb3;
	}

	/**
	 * @param thumb3 the thumb3 to set
	 */
	public void setThumb3(File thumb3) {
		this.thumb3 = thumb3;
	}

	/**
	 * @return the thumb4
	 */
	public File getThumb4() {
		return thumb4;
	}

	/**
	 * @param thumb4 the thumb4 to set
	 */
	public void setThumb4(File thumb4) {
		this.thumb4 = thumb4;
	}



	/**
	 * @return the imageFileName
	 */
	public String getImageFileName() {
		return imageFileName;
	}

	/**
	 * @param imageFileName the imageFileName to set
	 */
	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}

	/**
	 * @return the thumb1FileName
	 */
	public String getThumb1FileName() {
		return thumb1FileName;
	}

	/**
	 * @param thumb1FileName the thumb1FileName to set
	 */
	public void setThumb1FileName(String thumb1FileName) {
		this.thumb1FileName = thumb1FileName;
	}

	/**
	 * @return the thumb2FileName
	 */
	public String getThumb2FileName() {
		return thumb2FileName;
	}

	/**
	 * @param thumb2FileName the thumb2FileName to set
	 */
	public void setThumb2FileName(String thumb2FileName) {
		this.thumb2FileName = thumb2FileName;
	}

	/**
	 * @return the thumb3FileName
	 */
	public String getThumb3FileName() {
		return thumb3FileName;
	}

	/**
	 * @param thumb3FileName the thumb3FileName to set
	 */
	public void setThumb3FileName(String thumb3FileName) {
		this.thumb3FileName = thumb3FileName;
	}

	/**
	 * @return the thumb4FileName
	 */
	public String getThumb4FileName() {
		return thumb4FileName;
	}

	/**
	 * @param thumb4FileName the thumb4FileName to set
	 */
	public void setThumb4FileName(String thumb4FileName) {
		this.thumb4FileName = thumb4FileName;
	}

	/**
	 * @return the imageContentType
	 */
	public String getImageContentType() {
		return imageContentType;
	}

	/**
	 * @param imageContentType the imageContentType to set
	 */
	public void setImageContentType(String imageContentType) {
		this.imageContentType = imageContentType;
	}

	/**
	 * @return the thumb1ContentType
	 */
	public String getThumb1ContentType() {
		return thumb1ContentType;
	}

	/**
	 * @param thumb1ContentType the thumb1ContentType to set
	 */
	public void setThumb1ContentType(String thumb1ContentType) {
		this.thumb1ContentType = thumb1ContentType;
	}

	/**
	 * @return the thumb2ContentType
	 */
	public String getThumb2ContentType() {
		return thumb2ContentType;
	}

	/**
	 * @param thumb2ContentType the thumb2ContentType to set
	 */
	public void setThumb2ContentType(String thumb2ContentType) {
		this.thumb2ContentType = thumb2ContentType;
	}

	/**
	 * @return the thumb3ContentType
	 */
	public String getThumb3ContentType() {
		return thumb3ContentType;
	}

	/**
	 * @param thumb3ContentType the thumb3ContentType to set
	 */
	public void setThumb3ContentType(String thumb3ContentType) {
		this.thumb3ContentType = thumb3ContentType;
	}

	/**
	 * @return the thumb4ContentType
	 */
	public String getThumb4ContentType() {
		return thumb4ContentType;
	}

	/**
	 * @param thumb4ContentType the thumb4ContentType to set
	 */
	public void setThumb4ContentType(String thumb4ContentType) {
		this.thumb4ContentType = thumb4ContentType;
	}



	/**
	 * Serial version UId
	 */
	private static final long serialVersionUID = 1;
	
	@Override
	public String execute() throws Exception {
		addActionMessage(getText("product.select.option"));
		return INPUT;
	}
	
	/**
	 * List all products regitered on the system
	 * @return String success or error
	 * @exception Exception
	 */
	public String listAll() throws Exception {
		try {
			this.setProducts(this.productService.listAll());
			return SUCCESS;	
		} catch (Exception e) {
			return ERROR;
		}
	}
	
	/**
	 * Prepare to create product
	 * @return String
	 * @throws Exception
	 */
	public String prepare() throws Exception {
		this.setCategories(this.categoryService.listAllChilds());
		return INPUT;
	}
	
	
	/**
	 * Method to create product
	 * @return 
	 * @throws Exception 
	 * */
	public String create() throws Exception {
		
		//Load the category
		CategoryBean categoryBean = new CategoryBean();
		categoryBean.setId(this.product.getCategory().getId());
		categoryBean = this.categoryService.load(categoryBean);
		
		//configure category to product
		this.product.setCategory(categoryBean.getCategory());
		
		//images configurations
		this.product.setImage(this.getImageFileName());
		this.product.setThumb1(this.getThumb1FileName());
		this.product.setThumb2(this.getThumb2FileName());
		this.product.setThumb3(this.getThumb3FileName());
		this.product.setThumb4(this.getThumb4FileName());
	
		//bean
		ProductBean productBean = new ProductBean();
		productBean.setProduct(product);
		try {
			//upload files
			uploadImageFiles(this.getServletRequest());
			
			//create
			productService.create(productBean);
			
			addActionMessage(getText("product.create.success"));
			return SUCCESS;
			
		} catch (Exception e) {
			e.printStackTrace();
			addActionError(getText("error.product.create"));
			return ERROR;
		}
	}

	
	
	/**
	 * @return the categories
	 */
	public List<Category> getCategories() {
		return categories;
	}



	/**
	 * @param categories the categories to set
	 */
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}



	/**
	 * Prepare to show product detail
	 * @return String
	 * @throws Exception
	 */
	public String detail() throws Exception {
		
		try{
			ProductBean productBean = new ProductBean();
			productBean.setId(this.product.getId());
			productBean = this.productService.load(productBean);
			this.setCategories(this.categoryService.listAllChilds());
			
			this.setProduct(productBean.getProduct());
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			this.addActionError(getText("error.detail.product"));
			return ERROR;
		}		
	}
	
	
	/**
	 * Update product
	 * @return String
	 * @throws Exception
	 */
	public String updateImages() throws Exception {
		
		try{
			
			ProductBean productBean = new ProductBean();
			productBean.setId(this.product.getId());
			productBean = this.productService.load(productBean);
			Product loadedProduct = productBean.getProduct();
			
			//images configurations
			if (this.getImageFileName() != null && (!this.getImageFileName().equals(""))){
				loadedProduct.setImage(this.getImageFileName());
			}
			if (this.getThumb1FileName() != null && (!this.getThumb1FileName().equals(""))){
				loadedProduct.setThumb1(this.getThumb1FileName());
			}
			if (this.getThumb2FileName() != null && (!this.getThumb2FileName().equals(""))){
				loadedProduct.setThumb2(this.getThumb2FileName());
			}
			if (this.getThumb3FileName() != null && (!this.getThumb3FileName().equals(""))){
				loadedProduct.setThumb3(this.getThumb3FileName());
			}
			if (this.getThumb4FileName() != null && (!this.getThumb4FileName().equals(""))){
				loadedProduct.setThumb4(this.getThumb4FileName());
			}
			
			//configure and upadate
			productBean.setProduct(loadedProduct);
			
			//upload files
			uploadImageFiles(this.getServletRequest());
			
			//update product
			this.productService.update(productBean);
			
			this.addActionMessage(getText("success.detail.image"));
			
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			this.addActionError(getText("error.detail.image"));
			return ERROR;
		}		
	}
	
	
	/**
	 * Show Images products
	 * @return String
	 * @throws Exception
	 */
	public String showImages() throws Exception {
		
		try{
			
			ProductBean productBean = new ProductBean();
			productBean.setId(this.getProduct().getId());
			productBean = this.productService.load(productBean);

			this.setProduct(productBean.getProduct());
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			this.addActionError(getText("error.detail.image"));
			return ERROR;
		}		
	}
	
	
	
	/**
	 * Update product
	 * @return String
	 * @throws Exception
	 */
	public String update() throws Exception {
		
		try{
			
			ProductBean productBean = new ProductBean();
			productBean.setId(this.product.getId());
			productBean = this.productService.load(productBean);			
			
			Product loadedProduct = productBean.getProduct();

			//images configurations
			if (this.getImageFileName() != null && (!this.getImageFileName().equals(""))){
				this.product.setImage(this.getImageFileName());
			}else{
				this.product.setImage(loadedProduct.getImage());
			}
			if (this.getThumb1FileName() != null && (!this.getThumb1FileName().equals(""))){
				this.product.setThumb1(this.getThumb1FileName());
			}else{
				this.product.setThumb1(loadedProduct.getThumb1());
			}
			if (this.getThumb2FileName() != null && (!this.getThumb2FileName().equals(""))){
				this.product.setThumb2(this.getThumb2FileName());
			}else{
				this.product.setThumb2(loadedProduct.getThumb2());
			}
			if (this.getThumb3FileName() != null && (!this.getThumb3FileName().equals(""))){
				this.product.setThumb3(this.getThumb3FileName());
			}else{
				this.product.setThumb3(loadedProduct.getThumb3());
			}
			if (this.getThumb4FileName() != null && (!this.getThumb4FileName().equals(""))){
				this.product.setThumb4(this.getThumb4FileName());
			}else{
				this.product.setThumb4(loadedProduct.getThumb4());
			}
			
			this.product.setAttributeList(retrieveAttributes());
			productBean.setProduct(this.product);

			this.productService.update(productBean);
			
			this.addActionMessage(this.getText("product.update.success"));
			
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			this.addActionError(getText("error.detail.product"));
			return ERROR;
		}		
	}
	
	
	/**
	 * Method to add attributes of the products
	 * @param 
	 * @return String
	 * @throws Exception 
	 * @see AttributeService
	 */
	public String addAttributes() throws Exception{
		
		try{
			ProductBean bean = new ProductBean();
			bean.setId(this.getProduct().getId());
			bean = this.productService.load(bean);
			
			Product productLoaded = bean.getProduct();
			productLoaded.setAttributeList(retrieveAttributes());
			
			bean.setProduct(productLoaded);
			this.productService.update(bean);
			
			this.addActionMessage(getText("product.attribute.success"));
			
		}catch (Exception e) {
			this.addActionMessage(getText("error.related.attributes"));
			logger.log(Level.SEVERE, "Error add attribute for the product", e);
			this.addActionMessage(getText("error.related.attributes"));
			return ERROR;
		}
		return SUCCESS;
		
	}
	
	/**
	 * Extract attibutes from the dropdown list
	 * @return Set
	 */
	private Set<Attribute> retrieveAttributes() {
		//load products from hidden fields
		Set<Attribute> set = new HashSet<Attribute>();
		
		if (this.getListAttributes() != null){
			for(String p : this.getListAttributes()){
				Attribute attr = new  Attribute();
				attr.setId(Long.valueOf(p));
				set.add(attr);
			}
		}
		return set;
	}
	
	
	/**
	 * 
	 * List all attributes
	 * @return String
	 * @throws Exception 
	 */
	public String listAllAtributes() throws Exception{
		
		
		try {
		
			ProductBean bean = new ProductBean();
			bean.setId(this.product.getId());
			bean = this.productService.load(bean);
			this.product = bean.getProduct();
			
			Set<Attribute> set = 
				new TreeSet<Attribute>(this.attributeService.listAll());
			
			this.product.setAttributeList(set);
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Error on list all attributes", e);
			this.addActionError(getText("error.list.attributes"));
			return ERROR;
		}
	
		return SUCCESS;
	}
	
	/**
	 * 
	 * Method to delete product
	 * @return String
	 * @see ProductService
	 * */
	public String delete(){
		
		try{
			ProductBean bean = new ProductBean();
			bean.setId(this.product.getId());
			bean = this.productService.load(bean);
			this.productService.delete(bean);
		}catch (Exception e) {
			logger.log(Level.SEVERE, "Error to remove the product", e);
			this.addActionError(getText("error.product.delete"));
			return ERROR;
		}
		this.addActionMessage(getText("product.delete.success"));
		
		return SUCCESS;
		
	}
	

	/**
	 * Deactive the product
	 * @return String
	 * @see Product, ProductDaoImpl
	 */
	public String deactive(){
		try{
			ProductBean bean = new ProductBean();
			bean.setId(this.product.getId());
			bean = this.productService.load(bean);
			this.product = bean.getProduct();
			this.product.setDeactive(1);
			bean.setProduct(this.product);
			
			this.productService.update(bean);
		}catch (Exception e) {
			logger.log(Level.SEVERE, "Error to deactove the product", e);
			this.addActionError(getText("error.product.deactive"));
			return ERROR;
		}
		
		
		this.addActionMessage(getText("product.deactive.success"));
		
		return SUCCESS;
	}
	
}

