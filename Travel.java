package com.xworkz.markerInterface;

public class Travel  implements Cloneable {
	private String location;
	private int listOfPlaces;
	private String listOfPlace;
	private String famousPlace;
	
	@Override
	public Object clone() throws CloneNotSupportedException {
	
		return super.clone();
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getListOfPlaces() {
		return listOfPlaces;
	}
	public void setListOfPlaces(int listOfPlaces) {
		this.listOfPlaces = listOfPlaces;
	}
	public String getListOfPlace() {
		return listOfPlace;
	}
	public void setListOfPlace(String listOfPlace) {
		this.listOfPlace = listOfPlace;
	}
	
	public String getFamousPlace() {
		return famousPlace;
	}
	public void setFamousPlace(String famousPlace) {
		this.famousPlace = famousPlace;
	}
	

}
