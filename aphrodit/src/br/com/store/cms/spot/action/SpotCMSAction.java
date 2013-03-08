package br.com.store.cms.spot.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.ssj.persistence.spot.entity.Spot;
import com.ssj.service.spot.bean.SpotBean;
import com.ssj.service.spot.interfaces.SpotService;

/**
 * 
 * Category Action CMS to register the spot 
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
	private String spotName;
	private String spotDescription;
	private boolean active;
	private List<String> activeOptions;
	private List<Spot> spots;
	
	@Autowired
	private SpotService spotService;
	
	
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
	 * @return the spotName
	 */
	public String getSpotName() {
		return spotName;
	}

	/**
	 * @param spotName the spotName to set
	 */
	public void setSpotName(String spotName) {
		this.spotName = spotName;
	}

	

	/**
	 * @return the spotDescription
	 */
	public String getSpotDescription() {
		return spotDescription;
	}


	/**
	 * @param spotDescription the spotDescription to set
	 */
	public void setSpotDescription(String spotDescription) {
		this.spotDescription = spotDescription;
	}


	/**
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * @param active the active to set
	 */
	public void setActive(boolean active) {
		this.active = active;
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
	 * Method to create category
	 * @return 
	 * @throws Exception 
	 * */
	public String create() throws Exception {
		
		Spot spot = new Spot();
		spot.setSpotName(spotName);
		spot.setActive(this.isActive());
		spot.setSpotDescription(this.getSpotDescription());
		
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
		return INPUT;
	}
}
