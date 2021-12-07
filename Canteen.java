package com.xworkz.markerInterface;

public class Canteen implements Cloneable{
	private String name;
	private int noOfItems;
	private String ownerName;
	private String area;
	private int canteenId;
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
	public int getNoOfItems() {
		return noOfItems;
	}
	public void setNoOfItems(int noOfItems) {
		this.noOfItems = noOfItems;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getCanteenId() {
		return canteenId;
	}
	public void setCanteenId(int canteenId) {
		this.canteenId = canteenId;
	}
	

}
