package com.shivam.SpringDemoCdac.setterdi;

public class Project {
	private String name;
	private String technology;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	
	@Override
	public String toString() {
		return "Project [name=" + name + ", technology=" + technology + "]";
	}
	
	
}
