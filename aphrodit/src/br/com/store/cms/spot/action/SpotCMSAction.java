package br.com.store.cms.spot.action;

import java.util.ArrayList;
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
 * Spot Action CMS to register the spot 
 * @author Carlos Silva
 * @version 1.0
 * @since 1.0
 * @see ActionSupport
 * */
public class SpotCMSAction extends ActionSupport {

	/**
	 * Serial version
	 */
	private static final long serialVersionUID = 1L;
	private Spot spot;
	private ContentSpot contentSpot;
	private List<ContentSpot> contentSpots;
	private List<String> activeOptions;
	private List<Spot> spots;
	
	@Autowired
	private SpotService spotService;
	
	@Autowired
	private ContentSpotService contentSpotService;
	
	public SpotCMSAction(){
		this.activeOptions = new ArrayList<String>();
		this.activeOptions.add(getText("spot.activate"));
		this.activeOptions.add(getText("spot.deactivate"));
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
	 * @return the contentSpot
	 */
	public ContentSpot getContentSpot() {
		return contentSpot;
	}


	/**
	 * @param contentSpot the contentSpot to set
	 */
	public void setContentSpot(ContentSpot contentSpot) {
		this.contentSpot = contentSpot;
	}

	/**
	 * @return the activeOptions
	 */
	public List<String> getActiveOptions() {
		return activeOptions;
	}


	/**
	 * @param activeOptions the activeOptions to set
	 */
	public void setActiveOptions(List<String> activeOptions) {
		this.activeOptions = activeOptions;
	}


	@Override
	public String execute() throws Exception {
		addActionMessage(getText("spot.select.option"));
		return INPUT;
	}
	
	/**
	 * List all spots registered on the system
	 * @return String success or error
	 * @exception Exception
	 */
	public String listAll() throws Exception {
		try {
			this.setSpots(this.spotService.listAll());
			return SUCCESS;	
		} catch (Exception e) {
			return ERROR;
		}
	}

	

	/**
	 * @return the spot
	 */
	public Spot getSpot() {
		return spot;
	}


	/**
	 * @param spot the spot to set
	 */
	public void setSpot(Spot spot) {
		this.spot = spot;
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
	 * Method to create category
	 * @return 
	 * @throws Exception 
	 * */
	public String create() throws Exception {
		
		List<ContentSpot> contents = new ArrayList<ContentSpot>();
		contents.add(this.contentSpot);
		
		Spot spot = new Spot();
		spot.setSpotName(this.spot.getSpotName());
		spot.setActive(this.spot.isActive());
		spot.setSpotDescription(this.spot.getSpotDescription());
		spot.setContentSpots(contents);
		
		SpotBean spotBean = new SpotBean();
		spotBean.setSpot(spot);
		
		try {
			this.spotService.create(spotBean);
			addActionMessage(getText("spot.create.success"));
			return SUCCESS;
			
		} catch (Exception e) {
			e.printStackTrace();
			addActionError(getText("error.spot.create"));
			return ERROR;
		}
	}
	
	
	/**
	 * Prepare to create spot
	 * @return String
	 * @throws Exception
	 */
	public String input() throws Exception {
		//list all content to spot page
		this.setContentSpots(this.contentSpotService.listAll());
		return INPUT;
	}
}
