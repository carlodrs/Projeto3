package br.com.store.site.databean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ssj.persistence.spot.entity.ContentSpot;
import com.ssj.persistence.spot.entity.Spot;
import com.ssj.service.spot.interfaces.SpotService;

/**
 * Databean specific to presents spots and your contents
 * @author Carlos Silva
 * @version 1.0
 * @see Spot
 * */
public class SpotDataBean {

	public SpotDataBean(){
	}
	
	private String name;
	private List<ContentSpot> contentSpots;
	
	@Autowired
	private SpotService service;

	
	
	/**
	 * @return the contentSpots
	 */
	public List<ContentSpot> getContentSpots() {
	
		try {
			Spot spot = this.service.listByName(getName());
			this.contentSpots = spot.getContentSpots();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return contentSpots;
	}

	/**
	 * @param contentSpots the contentSpots to set
	 */
	public void setContentSpots(List<ContentSpot> contentSpots) {
		this.contentSpots = contentSpots;
	}

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
	 * @param service the service to set
	 */
	public void setService(SpotService service) {
		this.service = service;
	}
	
	
	

	
}
