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
import com.ssj.persistence.product.entity.Product;
import com.ssj.service.product.bean.ProductBean;
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

	private String name;
	private String shortName;
	private String description;
	private Double price;
	private Double offerPrice;
	private String picture;
	private Double discount;
	private List<Product> products;

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
	
	 private HttpServletRequest servletRequest;
	 
	 //Logger
	 private static Logger logger = 
		 Logger.getLogger(ProductCMSAction.class.getName());
	 
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	 * @return the offerPrice
	 */
	public Double getOfferPrice() {
		return offerPrice;
	}

	/**
	 * @param offerPrice the offerPrice to set
	 */
	public void setOfferPrice(Double offerPrice) {
		this.offerPrice = offerPrice;
	}

	/**
	 * @return the picture
	 */
	public String getPicture() {
		return picture;
	}

	/**
	 * @param picture the picture to set
	 */
	public void setPicture(String picture) {
		this.picture = picture;
	}

	/**
	 * @return the discount
	 */
	public Double getDiscount() {
		return discount;
	}

	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	/**
	 * @return the shortName
	 */
	public String getShortName() {
		return shortName;
	}

	/**
	 * @param shortName the shortName to set
	 */
	public void setShortName(String shortName) {
		this.shortName = shortName;
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
		return INPUT;
	}
	
	
	/**
	 * Method to create product
	 * @return 
	 * @throws Exception 
	 * */
	public String create() throws Exception {
		
		Product product = new Product();
		product.setName(this.getName());
		product.setDescription(this.getDescription());
		product.setOfferPrice(this.getOfferPrice());
		product.setPrice(this.getPrice());
		product.setShortName(this.getShortName());
		product.setPercentDiscount(this.getDiscount());
		
		//images configurations
		product.setImage(this.getImageFileName());
		product.setThumb1(this.getThumb1FileName());
		product.setThumb2(this.getThumb2FileName());
		product.setThumb3(this.getThumb3FileName());
		product.setThumb4(this.getThumb4FileName());
	
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
