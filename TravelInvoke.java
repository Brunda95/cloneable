package com.xworkz.markerInterface;

public class TravelInvoke {
public static void main (String[] args) throws CloneNotSupportedException {
		
		Travel tra= new Travel();
		tra.setLocation("Dandeli");
	    tra.setListOfPlaces(6);
		tra.setListOfPlace("Jungle bell resort,adventure,lion safari,crocadail park,kali river,sathodi fals,supa dam");
	
		tra.setFamousPlace("RiverAdventure");
		
		Travel traCopy = (Travel) tra.clone();
		
		System.out.println(tra.getLocation());
		System.out.println(tra.getListOfPlaces());
		System.out.println(tra.getListOfPlace());
		
		System.out.println(tra.getFamousPlace());
	}
}




