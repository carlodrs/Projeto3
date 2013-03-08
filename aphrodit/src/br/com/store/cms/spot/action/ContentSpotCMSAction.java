package br.com.store.cms.spot.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.ssj.persistence.spot.entity.ContentSpot;
import com.ssj.persistence.spot.entity.Spot;
import com.ssj.service.spot.bean.SpotBean;
import com.ssj.service.spot.interfaces.ContentSpotService;
import com.ssj.service.spot.interfaces.SpotService;

/**
 * 
 * Content Spot Action CMS to register the spot 
 * @author Carlos Silva
 * @version 1.0
 * @since 1.0
 * @see ActionSupport
 * */
public class ContentSpotCMSAction extends ActionSupport {

	/**
	 * Serial version
	 */
	private static final long serialVersionUID = 1L;
	private String contentName;
	private String contentDescription;
	private List<Spot> spots;
	private List<ContentSpot> contentSpots;
	private Long spotId;
	
	
	@Autowired
	private SpotService spotService;
	
	@Autowired
	private ContentSpotService contentSpotService;
	
	public ContentSpotCMSAction(){
		
	}
	
	/**
	 * @return the contentSpots
	 */
	public List<ContentSpot> getContentSpots() {
		return contentSpots;
	}


	/**
	 * @param contentSpots the contentSpots to set
	 */
	public void setContentSpots(List<ContentSpot> contentSpots) {
		this.contentSpots = contentSpots;
	}


	/**
	 * @return the spotId
	 */
	public Long getSpotId() {
		return spotId;
	}


	/**
	 * @param spotId the spotId to set
	 */
	public void setSpotId(Long spotId) {
		this.spotId = spotId;
	}


	/**
	 * @return the spots
	 */
	public List<Spot> getSpots() {
		return spots;
	}

	/**
	 * @param spots the spots to set
	 */
	public void setSpots(List<Spot> spots) {
		this.spots = spots;
	}

	


	/**
	 * @return the contentDescription
	 */
	public String getContentDescription() {
		return contentDescription;
	}


	/**
	 * @param contentDescription the contentDescription to set
	 */
	public void setContentDescription(String contentDescription) {
		this.contentDescription = contentDescription;
	}


	/**
	 * @return the contentName
	 */
	public String getContentName() {
		return contentName;
	}


	/**
	 * @param contentName the contentName to set
	 */
	public void setContentName(String contentName) {
		this.contentName = contentName;
	}


	@Override
	public String execute() throws Exception {
		addActionMessage(getText("content.spot.select.option"));
		return INPUT;
	}
	
	/**
	 * List all spots registered on the system
	 * @return String success or error
	 * @exception Exception
	 */
	public String listAll() throws Exception {
		try {
			this.setContentSpots(this.contentSpotService.listAll());
			return SUCCESS;	
		} catch (Exception e) {
			return ERROR;
		}
	}

	

	/**
	 * Method to create category
	 * @return 
	 * @throws Exception 
	 * */
	public String create() throws Exception {
		
		//content spot entity
		ContentSpot contentSpot  = new ContentSpot();
		contentSpot.setContentName(this.contentName);
		contentSpot.setContentDescription(this.contentDescription);
		
		//spot entity
		Spot spot = new Spot();
		spot.setId(this.getSpotId());
		
		//creating bean spot
		SpotBean spotBean  = new SpotBean();
		spotBean.setSpot(spot);
		
		//load the spot
		spotBean = this.spotService.load(spotBean);
		contentSpot.setSpot(spotBean.getSpot());
		
		//contet spot configured 
		spotBean.setContentSpot(contentSpot);
		
		try {
			this.contentSpotService.create(spotBean);
			addActionMessage(getText("content.spot.create.success"));
			return SUCCESS;
			
		} catch (Exception e) {
			e.printStackTrace();
			addActionError(getText("error.content.spot.create"));
			return ERROR;
		}
	}
	
	/**
	 * Prepare to create spot
	 * @return String
	 * @throws Exception
	 */
	public String input() throws Exception {
		this.setSpots(this.spotService.listAll());
		return INPUT;
	}
}
