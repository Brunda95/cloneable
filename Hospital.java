package com.xworkz.markerInterface;

public class Hospital implements Cloneable  { 
	private String name;
	private int id;
	private int noOfPatients;
	private String city;
	private String services;
	
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNoOfPatients() {
		return noOfPatients;
	}
	public void setNoOfPatients(int noOfPatients) {
		this.noOfPatients = noOfPatients;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getServices() {
		return services;
	}
	public void setServices(String services) {
		this.services = services;
	}
   
}
