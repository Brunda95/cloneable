package com.xworkz.markerInterface;

public class ShowroomInvoke {
public static void main (String[] args) throws CloneNotSupportedException {
		
		Showroom shw = new Showroom();
		shw.setName("Trends");
	    shw.setLocation("Banglore");
		shw.setShowroomId(121);
		shw.setNoOfDepartments(6);
		shw.setNoOfWorkers(10);
		
		Showroom shwCopy = (Showroom) shw.clone();
		
		System.out.println(shw.getName());
		System.out.println(shw.getLocation());
		System.out.println(shw.getShowroomId());
		System.out.println(shw.getNoOfDepartments());
		System.out.println(shw.getNoOfWorkers());
	}
}




