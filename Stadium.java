package com.xworkz.markerInterface;

public class Stadium  implements Cloneable{
	private String name;
	private String place;
	private int width;
	private String shape;
	private double noOfPeople;
	
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
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public double getNoOfPeople() {
		return noOfPeople;
	}
	public void setNoOfPeople(double noOfPeople) {
		this.noOfPeople = noOfPeople;
	}
	

}
