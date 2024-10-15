package com.shivam.SpringDemoCdac.setterdi;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	private int rollNo;
	private String name;
	private double marks;
	private Project project;
	private Set<String> email;
	private List<String> phone;
	private Map<String, Integer> courses;
	
	public Set<String> getEmail() {
		return email;
	}
	public void setEmail(Set<String> email) {
		this.email = email;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	public Map<String, Integer> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, Integer> courses) {
		this.courses = courses;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + ", project=" + project + ", email="
				+ email + ", phone=" + phone + ", courses=" + courses + "]";
	}
	
	
}
