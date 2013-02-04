package com.ssj.test.action.account.address;

import com.ssj.persistence.account.address.entity.Address;
import com.ssj.persistence.account.user.entity.User;
import com.ssj.service.account.address.interfaces.AddressService;
import com.ssj.service.account.address.interfaces.impl.AddressServiceImpl;
import com.ssj.service.account.user.interfaces.UserService;
import com.ssj.service.account.user.interfaces.impl.UserServiceImpl;
import com.ssj.service.bean.account.address.AddressBean;
import com.ssj.service.bean.account.user.UserBean;
import com.ssj.test.SSJGenericSpringTest;

public class AddressTest extends SSJGenericSpringTest{
	
	private AddressService  addressService;
	private UserService userService;
	
	public AddressTest(){
		addressService = (AddressService) 
			this.getSpringApplicationContext()
				.getBean(AddressServiceImpl.class.getSimpleName());
	
	
		userService = (UserService) 
		this.getSpringApplicationContext()
			.getBean(UserServiceImpl.class.getSimpleName());
		
	}
	
	
	
	private void execute() throws Exception {
		
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
		
		User user = userService.read(userBean);
		
		AddressBean addressBean = new AddressBean();
		addressBean.setUser(user);
		addressBean.setAddress(address);
		
		addressService.create(addressBean);
	}
	
	public static void main(String[] args) {
		AddressTest t = new AddressTest();
		try {
			t.execute();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
