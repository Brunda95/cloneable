package com.xworkz.markerInterface;

public class CanteenInvoke {
public static void main (String[] args) throws CloneNotSupportedException {
		
		Canteen can= new Canteen();
		can.setName("Sri sai chat center");
	    can.setNoOfItems(10);
		can.setOwnerName("jhon");
		can.setArea("corner");
		can.setCanteenId(10);
		
		Canteen canCopy = (Canteen) can.clone();
		
		System.out.println(can.getName());
		System.out.println(can.getNoOfItems());
		System.out.println(can.getOwnerName());
		System.out.println(can.getArea());
		System.out.println(can.getCanteenId());
	}
}



