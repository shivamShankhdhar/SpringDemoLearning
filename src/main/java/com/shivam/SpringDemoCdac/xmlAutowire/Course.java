package com.shivam.SpringDemoCdac.xmlAutowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Course {
	private String name;
	private int duration;
	
	@Autowired
	private Faculty faculty;
	
	public Course() {}
	
	public Course(Faculty faculty) {
		this.faculty = faculty;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Faculty getFaculty() {
		return faculty;
	}
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	
	@Override
	public String toString() {
		return "Course [name=" + name + ", duration=" + duration + ", faculty=" + faculty + "]";
	}
	
	

}
