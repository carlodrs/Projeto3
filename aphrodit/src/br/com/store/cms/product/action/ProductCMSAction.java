package br.com.store.cms.product.action;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.dispatcher.multipart.MultiPartRequestWrapper;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.ssj.persistence.product.entity.Category;
import com.ssj.persistence.product.entity.Product;
import com.ssj.service.product.bean.CategoryBean;
import com.ssj.service.product.bean.ProductBean;
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
	extends ActionSupport implements ServletRequestAware {

	private Product product;
	private List<Product> products;
	private List<Category> categories;

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
	
	private HttpServletRequest servletRequest;
	 
	 //Logger
	 private static Logger logger = 
		 Logger.getLogger(ProductCMSAction.class.getName());
	 
	 
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
			uploadProductsFiles(this.servletRequest);
			
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
			uploadProductsFiles(this.servletRequest);
			
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
			
			productBean.setProduct(this.product);

			this.productService.update(productBean);
			
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			this.addActionError(getText("error.detail.product"));
			return ERROR;
		}		
	}
	
	/**
	 * Method to upload products files send by multipart request form
	 * @param httpServletRequest
	 * @throws IOException
	 * @see MultiPartRequestWrapper, HttpServletRequest
	 **/
	private void uploadProductsFiles(HttpServletRequest httpServletRequest) throws IOException {
		//handle multipart request files to upload
		if (httpServletRequest instanceof MultiPartRequestWrapper) {
		    MultiPartRequestWrapper multiWrapper =
		        (MultiPartRequestWrapper) httpServletRequest;
		    if (multiWrapper != null) {

		    	@SuppressWarnings("rawtypes")
				Enumeration fileParameterNames = multiWrapper.getFileParameterNames();              
		        //String fileName = multiWrapper.getFileNames("upload")[0];
		        while(fileParameterNames.hasMoreElements()){
		            String inputValue = (String) fileParameterNames.nextElement();
		            String[] localFileNames = multiWrapper.getFileNames(inputValue);
		            for (String fn : localFileNames) {
		            	logger.info("Local Filename to Upload = " + fn);                   
		            }
		            File[] files = multiWrapper.getFiles(inputValue);
		           
		            for (File cf : files) {
		                File destFile = new File(cf.getParentFile().getAbsolutePath()+"\\"+localFileNames[0]);
		                try {
							FileUtils.copyFile(cf, destFile);
						} catch (IOException e) {
							logger.info("Error on upload files ##" 
									+ localFileNames[0] +  "##"+ e.getMessage());
							e.printStackTrace();
							throw e;
						}
		                FileUtils.deleteQuietly(cf);

		            }               
		        }
		    }
		}
	}

	@Override
	public void setServletRequest(HttpServletRequest httpServletRequest) {
		this.servletRequest = httpServletRequest;
		
	}
}
