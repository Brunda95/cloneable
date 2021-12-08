package com.xworkz.crudofdao;

public class PgInvoke {
	
		public static void main(String[] args) {                    
			Pg dao=new Pg();                                  
			                                                        
			dao.create("Gajanana PG");                                
			dao.create("maruthi PG");                             
			dao.create("girls PG");                               
			                                                        
			                                                        
			boolean found=dao.find("Gajanana PG");                    
			                                                        
			System.out.println(found);                              
			                                                        
			found=dao.findByCaseInSensitive("maruthi Pg");           
			System.out.println(found);                              
			                                                        
			found=dao.findByCaseInSensitiveAndTrimmed("girls Pg"); 
			System.out.println(found);                              
		}                                                           
		}                                                           
		                                                            



