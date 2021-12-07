package com.xworkz.markerInterface;

public class PenInvoke {
public static void main (String[] args) throws CloneNotSupportedException {
		
		Pen pen = new Pen();
		pen.setName("Dooms");
	     pen.setPrice(5);
		pen.setColor("Black");
		pen.setType("ballpen");
		pen.setFavPen("fav pen ryenolds");
		
		Pen penCopy = (Pen) pen.clone();
		
		System.out.println(pen.getName());
		System.out.println(pen.getPrice());
		System.out.println(pen.getColor());
		System.out.println(pen.getType());
		System.out.println(pen.getFavPen());
	}
}







