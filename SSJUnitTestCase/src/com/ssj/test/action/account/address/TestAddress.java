package com.ssj.test.action.account.address;

import com.ssj.persistence.account.user.entity.User;
import com.ssj.service.account.address.interfaces.AddressService;
import com.ssj.service.account.address.interfaces.impl.AddressServiceImpl;
import com.ssj.service.account.user.interfaces.UserService;
import com.ssj.service.account.user.interfaces.impl.UserServiceImpl;
import com.ssj.service.bean.account.address.AddressBean;
import com.ssj.service.bean.account.user.UserBean;
import com.ssj.test.SSJGenericSpringTest;

public class TestAddress extends SSJGenericSpringTest{
	
	private AddressService addressService;
	private UserService userService;
	
	public TestAddress(){
		addressService = (AddressService) 
			this.getSpringApplicationContext()
				.getBean(AddressServiceImpl.class.getSimpleName());
	
	
		userService = (UserService) 
		this.getSpringApplicationContext()
			.getBean(UserServiceImpl.class.getSimpleName());
		
	}
	
	
	
	private void execute() throws Exception {
		
		AddressBean addressBean = new AddressBean();
		addressBean.setStreet("Rua matheus delalibera");
		addressBean.setNumber(150);
		addressBean.setComplements("casa 12");
		addressBean.setPostalCode("13873-170");
		addressBean.setCity("São João da Boa Vista");
		addressBean.setState("São Paulo");
		addressBean.setCellphone1("19 81219579");
		addressBean.setCellphone2("11 94763597");
		addressBean.setBusinessNumber("19 3056443");
		addressBean.setHouseNumber("19 36317686");
		
		UserBean userBean = new UserBean();
		userBean.setId(2L);
		
		User user = userService.read(userBean);
		
		addressBean.setUser(user);
		addressService.create(addressBean);
	}
	
	public static void main(String[] args) {
		TestAddress t = new TestAddress();
		try {
			t.execute();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
