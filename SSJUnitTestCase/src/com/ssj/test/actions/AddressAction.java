package com.ssj.test.actions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ssj.persistence.account.address.entity.Address;
import com.ssj.persistence.account.user.entity.User;
import com.ssj.service.account.address.interfaces.AddressService;
import com.ssj.service.account.user.interfaces.ClientService;
import com.ssj.service.bean.account.address.AddressBean;
import com.ssj.service.bean.account.user.UserBean;

@Component("AddressAction")
public class AddressAction {

	@Autowired
	private ClientService<User> userService;
	
	@Autowired
	private AddressService addressService;
	

	/****************** Method test to create address *******************************/
	/********************************************************************************/
	public void testCreateAddress() throws Exception {
		
		Address address = new Address();
		address.setStreet("Rua matheus delalibera");
		address.setNumber(150);
		address.setComplements("casa 12");
		address.setPostalCode("13873-170");
		address.setCity("São João da Boa Vista");
		address.setState("São Paulo");
		address.setCellphone1("19 81219579");
		address.setCellphone2("11 94763597");
		address.setBusinessNumber("19 3056443");
		address.setHouseNumber("19 36317686");
		
		UserBean userBean = new UserBean();
		userBean.setId(2L);
		
		userBean = userService.read(userBean);
		
		AddressBean addressBean = new AddressBean();
		addressBean.setUser(userBean.getUser());
		addressBean.setAddress(address);
		
		addressService.create(addressBean);
	}
}
