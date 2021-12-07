package com.xworkz.markerInterface;

public class LaptopInvoke {


	public static void main (String[] args) throws CloneNotSupportedException {
		
		Laptop laptop = new Laptop();
		laptop.setName("Dell");
		laptop.setId(1234);
		laptop.setPrice(25000);
		laptop.setModel("2000");
		laptop.setColor("black");
		
		Laptop laptopCopy = (Laptop) laptop.clone();
		
		System.out.println(laptop.getName());
		System.out.println(laptop.getId());
		System.out.println(laptop.getPrice());
		System.out.println(laptop.getModel());
		System.out.println(laptop.getColor());
	}
}
