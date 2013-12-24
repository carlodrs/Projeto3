/**
 * 
 */
package br.com.store.site.upload.action;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.dispatcher.multipart.MultiPartRequestWrapper;
import org.apache.struts2.interceptor.ServletRequestAware;

import br.com.store.cms.product.action.ProductCMSAction;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * 
 * Abstract action that supports the upload files
 * @author Carlos Silva
 * @since 2013
 * @version 1.0
 * 
 */
public abstract class BaseUploadActionSupport 
	extends ActionSupport  implements ServletRequestAware{

	/**
	 * version id
	 */
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * Servlet request
	 * */
	private HttpServletRequest servletRequest;
	

	 //Logger
	 private static Logger logger = 
		 Logger.getLogger(ProductCMSAction.class.getName());
	 

	@Override
	public void setServletRequest(HttpServletRequest httpServletRequest) {
		this.servletRequest = httpServletRequest;
		
	}

	public HttpServletRequest getServletRequest() {
		return this.servletRequest;
	}
	
	/**
	 * Method to upload products files send by multipart request form
	 * @param httpServletRequest
	 * @throws IOException
	 * @see MultiPartRequestWrapper, HttpServletRequest
	 **/
	protected void uploadImageFiles(HttpServletRequest httpServletRequest) throws IOException {
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
}
