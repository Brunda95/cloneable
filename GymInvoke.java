package com.xworkz.crudofdao;

public class GymInvoke {
	
		public static void main(String[] args) {
			Gym gy=new Gym();
			
			gy.save("105, 4thfloor,Gandhi Nagar, Tiptur, Karnataka 562001");
			gy.save("77567, Rd,Rajajinagar,Bengaluru,Karnataka 560021");
			gy.save("1st floor, Shivaji nagar,Tiptur");
			
			boolean found=gy.find("105,4thfloor,Gandhi Nagar,Tiptur,Karnataka 562001");
			System.out.println(found);
			
			 found=gy.findByCaseInSensitive("77567, Rd,Rajajinagar,Bengaluru,Karnataka 560021");
		      System.out.println(found);
		      
		      found=gy.findByCaseInSensitiveAndTrimmed("1st floor, Shivaji nagar,Tiptur");
		
		     System.out.println(found);
		}
	}


