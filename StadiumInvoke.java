package com.xworkz.markerInterface;

public class StadiumInvoke {
public static void main (String[] args) throws CloneNotSupportedException {
		
		Stadium std = new Stadium();
		std.setName("Kalpataru");
		std.setPlace("Tiptur");
		std.setWidth(500);
		std.setShape("round");
		std.setNoOfPeople(100);
		
		Stadium stdCopy = (Stadium) std.clone();
		
		System.out.println(std.getName());
		System.out.println(std.getPlace());
		System.out.println(std.getWidth());
		System.out.println(std.getShape());
		System.out.println(std.getNoOfPeople());
	}
}



