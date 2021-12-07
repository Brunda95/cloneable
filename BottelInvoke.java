package com.xworkz.markerInterface;

public class BottelInvoke {

public static void main (String[] args) throws CloneNotSupportedException {
		
		Bottel bottel = new Bottel();
		bottel.setPrice(90);
		bottel.setName("Silica");
		bottel.setCapacity("1000");
		bottel.setColor("Silver");
		bottel.setDesign("rectangular");
		
		Bottel BottelCopy= (Bottel) bottel.clone();
		
		System.out.println(bottel.getPrice());
		System.out.println(bottel.getName());
		System.out.println(bottel.getCapacity());
		System.out.println(bottel.getColor());
		System.out.println(bottel.getDesign());
	}
}


