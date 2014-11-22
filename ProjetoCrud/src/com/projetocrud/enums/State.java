package com.projetocrud.enums;

public enum State {

	 SAO_PAULO ("São Paulo"),
	 RIO_DE_JANEIRO ("Rio de Janeiro"),
	 MINAS_GERAIS ("Minas Gerais");
	 
	 private String name;	
	
	 State(String name){
		 this.name=name;
	 }
	 
	 public String getName() {
		return name;
	}
	 
	public void setName(String name){
		this.name = name;
	}
}
