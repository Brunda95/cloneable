package com.xworkz.crudofdao;

public class IplTeams {
	
		public static void main(String[] args) {
			Ipl ip=new Ipl();
			
			ip.save("Royal Challengers Banglore");
			ip.save("Mumbai Indians");
			ip.save("Rajasthan Royals");
			
			boolean found=ip.find("Royal Challengers Banglore");
			System.out.println(found);
			
			found=ip.findByCaseSensitive("Mumbai Indians");
			System.out.println(found);
			
			found=ip.findByCaseInSensitiveAndTrimmed("Royal Challengers Banglore");
			System.out.println(found);
		}
	}




