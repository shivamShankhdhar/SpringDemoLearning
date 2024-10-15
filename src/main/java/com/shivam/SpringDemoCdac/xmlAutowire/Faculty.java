package com.shivam.SpringDemoCdac.xmlAutowire;

public class Faculty {
	
	private String name;
	private String expertise;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExpertise() {
		return expertise;
	}
	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}
	
	@Override
	public String toString() {
		return "Faculty [name=" + name + ", expertise=" + expertise + "]";
	}
	
	
	

}
