package com.xworkz.markerInterface;

public class HospitalInvoke {
public static void main (String[] args) throws CloneNotSupportedException {
		
		Hospital hos = new Hospital();
		hos.setName("CT center");
	    hos.setId(45);
		hos.setNoOfPatients(100);
		hos.setCity("Tiptur");
		hos.setServices("Best services");
		
		Hospital hosCopy = (Hospital) hos.clone();
		
		System.out.println(hos.getName());
		System.out.println(hos.getId());
		System.out.println(hos.getNoOfPatients());
		System.out.println(hos.getCity());
		System.out.println(hos.getServices());
	}
}







