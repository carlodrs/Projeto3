package code;

import org.springframework.security.crypto.password.StandardPasswordEncoder;

public class Generate {
	
	public static String encode(String password) {
		StandardPasswordEncoder encoder = new StandardPasswordEncoder();
		return encoder.encode(password);
	}
	
	public static boolean matches(String rawPassword, String encodedPassword) {
		StandardPasswordEncoder encoder = new StandardPasswordEncoder();
		return encoder.matches(rawPassword, encodedPassword);
	}
	
	
	public static void main(String[] args) {
		
		/** 
		 * Text to encode  : carlosrenato.s@gmail.com	
		 * Must be results : 4efe081594ce25ee4efd9f7067f7f678a347bccf2de201f3adf2a3eb544850b465b4e51cdc3fcdde
		 **/
		System.out.println(encode("rambito01"));
	//	System.out.println(matches("koala", "7ef82307690461197b254d418c2a88c47cb1f50eabcf60e17e29ab9ab34ed11aace95c8719d03b7a"));
	}
}
