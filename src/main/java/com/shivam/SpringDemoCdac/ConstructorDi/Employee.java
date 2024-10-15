package com.shivam.SpringDemoCdac.ConstructorDi;

public class Employee {
	private int empid;
	private String name;
	private String designation;
	
	public Employee(int empid,String name,String des) {
		this.empid = empid;
		this.name=name;
		this.designation=des;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", designation=" + designation + "]";
	}
	
//	@Override
//	public String toString() {
//		return "Employe [empid=" +this.empid+ ",name=" + this.name ", designation= "+this.designation"];
//	}
	
	

}
