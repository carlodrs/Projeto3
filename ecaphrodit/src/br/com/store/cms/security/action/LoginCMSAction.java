package br.com.store.cms.security.action;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ssj.persistence.account.user.entity.UserEmail;
import com.ssj.service.security.login.bean.LoginBean;
import com.ssj.service.security.login.interfaces.LoginService;

/** 
 * Action used to make a login of the user system
 * @author Carlos Silva
 * @version 1.0
 * @since 2013
 * @see SessionAware
 * 
 * */
@Service("loginCMSAction")
public class LoginCMSAction extends LoginPreparedCMSAction implements UserDetailsService{
	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = 1L;

	

	/**
	 * Method execute from struts to handle the loin
	 * @return String name of operation identifier 
	 * @throws Exception
	 * @see LoginService
	 *
	 * */
	public String doLogin() throws Exception{
		
		UserEmail userEmail = new UserEmail();
		userEmail.setEmail(this.getEmail());
		userEmail.setPassword(this.getPassword());
		
		LoginBean loginBean = new LoginBean();
		loginBean.setUserEmail(userEmail);
		
		try {
			boolean logged = this.loginService.checkUser(loginBean);
			
			if (logged == true){
				return SUCCESS;
			}else{
				addActionError(getText("error.login"));
				return ERROR;
			}	

		} catch (Exception e) {
			e.printStackTrace();
			addActionError(getText("error.login"));
			return ERROR;
		}
	}



	/**
	 * Returns a populated {@link UserDetails} object. 
	 * The username is first retrieved from the database and then mapped to 
	 * a {@link UserDetails} object.
	 */
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		try {
			
			UserEmail userEmail = new UserEmail();
			userEmail.setEmail(email);
			
			LoginBean loginBean = new LoginBean();
			loginBean.setUserEmail(userEmail);
			
			loginBean = loginService.load(loginBean);
			
			boolean enabled = true;
			boolean accountNonExpired = true;
			boolean credentialsNonExpired = true;
			boolean accountNonLocked = true;
			
			return new User(
					loginBean.getUserEmail().getEmail(), 
					loginBean.getUserEmail().getPassword(),
					enabled,
					accountNonExpired,
					credentialsNonExpired,
					accountNonLocked,
					getAuthorities(loginBean.getUserEmail().getUser().getRole()));
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * Retrieves a collection of {@link GrantedAuthority} based on a numerical role
	 * @param role the numerical role
	 * @return a collection of {@link GrantedAuthority
	 */
	public Collection<? extends GrantedAuthority> getAuthorities(Integer role) {
		List<GrantedAuthority> authList = getGrantedAuthorities(getRoles(role));
		return authList;
	}
	
	/**
	 * Converts a numerical role to an equivalent list of roles
	 * @param role the numerical role
	 * @return list of roles as as a list of {@link String}
	 */
	public List<String> getRoles(Integer role) {
		List<String> roles = new ArrayList<String>();
		
		if (role.intValue() == 1) {
			roles.add("ROLE_USER");
			roles.add("ROLE_ADMIN");
			
		} else if (role.intValue() == 2) {
			roles.add("ROLE_USER");
		}
		
		return roles;
	}
	
	/**
	 * Wraps {@link String} roles to {@link SimpleGrantedAuthority} objects
	 * @param roles {@link String} of roles
	 * @return list of granted authorities
	 */
	public static List<GrantedAuthority> getGrantedAuthorities(List<String> roles) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		for (String role : roles) {
			authorities.add(new SimpleGrantedAuthority(role));
		}
		return authorities;
	}
}
