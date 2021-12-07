package com.xworkz.markerInterface;

public class Laptop implements Cloneable{

	private String name;
	private int Id;
	private int price;
	private String model;
	private String color;
	
	
	
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
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor (){
		return color;
	}
	public void setColor(String color) {
		this.color= color;
	}

	
	
}
