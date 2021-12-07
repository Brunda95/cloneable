package com.xworkz.markerInterface;

public class Bottel implements cloneable {
	private int price;
	private String name;
	private String capacity;
	private String color;
	private String design;
	
	
	@Override
	public Object clone() throws CloneNotSupportedException {
	
		return super.clone();
	}
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design = design;
	}

	
	
}
