package com.projetocrud.enums;

public enum Country {

	 BRASIL ("Brasil"),
	 ARGENTINA ("Argentina"),
	 EUA ("Estados Unidos");
	 
	 private String name;	
	
	 Country(String name){
		 this.name=name;
	 }
	 
	 public String getName() {
		return name;
	}
	 
	public void setName(String name){
		this.name = name;
	}
}
