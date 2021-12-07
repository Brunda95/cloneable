package com.xworkz.markerInterface;

public class Pen implements Cloneable{ 
 private String name;
 private int price;
 private String color;
 private String type;
 private String favPen;

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
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getFavPen() {
	return favPen;
}
public void setFavPen(String favPen) {
	this.favPen = favPen;
}
 
}
