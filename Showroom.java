package com.xworkz.markerInterface;

public class Showroom implements Cloneable{
	private String name;
	private String location;
	private int showroomId;
	private int noOfDepartments;
	private int noOfWorkers;
	
	@Override
	public Object clone() throws CloneNotSupportedException {
	
		return super.clone();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getNoOfDepartments() {
		return noOfDepartments;
	}
	public void setNoOfDepartments(int noOfDepartments) {
		this.noOfDepartments = noOfDepartments;
	}
	public int getNoOfWorkers() {
		return noOfWorkers;
	}
	public void setNoOfWorkers(int noOfWorkers) {
		this.noOfWorkers = noOfWorkers;
	}
	public int getShowroomId() {
		return showroomId;
	}
	public void setShowroomId(int showroomId) {
		this.showroomId = showroomId;
	}
	
	

}
