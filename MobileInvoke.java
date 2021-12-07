package com.xworkz.markerInterface;

public class MobileInvoke {
public static void main (String[] args) throws CloneNotSupportedException {
		
		Mobile mob = new Mobile();
		mob.setBrand("iPhone");
	    mob.setVersion("i5");
		mob.setStorage(64);
		mob.setNoOfCamera(3);
		mob.setSize("iphone11-138*67*7.1");
		
		Mobile mobCopy = (Mobile) mob.clone();
		
		System.out.println(mob.getBrand());
		System.out.println(mob.getVersion());
		System.out.println(mob.getStorage());
		System.out.println(mob.getNoOfCamera());
		System.out.println(mob.getSize());
	}
}








