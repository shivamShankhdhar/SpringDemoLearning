package com.shivam.SpringDemoCdac.xmlAutowire;

public class Course {
	private String name;
	private int duration;
	private Faculty faculty;
	
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
