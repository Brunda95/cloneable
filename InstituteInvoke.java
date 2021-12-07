package com.xworkz.markerInterface;

public class InstituteInvoke {
public static void main (String[] args) throws CloneNotSupportedException {
		
		Institute ins = new Institute();
		ins.setName("Kalpataru Institute of technology");
	     ins.setNoOfBranches(5);
		ins.setNoOfStaff(50);
		ins.setPrinciple("Nandheesh");
		ins.setCity("Tiptur");
		
		Institute insCopy = (Institute) ins.clone();
		
		System.out.println(ins.getName());
		System.out.println(ins.getCity());
		System.out.println(ins.getPrinciple());
		System.out.println(ins.getNoOfStaff());
		System.out.println(ins.getNoOfBranches());
	}
}






