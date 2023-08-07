package org;

public class Main
{
	public static void main (String[] args)
	{
		
	
	//create an object of a SUV
	SUV thar=new SUV("Thar", false);
	
	System.out.println("current gear is : " +thar.getCurrentGear());
	System.out.println("Current speed is: "+thar.getCurrentSpeed());
	System.out.println("Current Direction is "+thar.getCurrentDirection());
	System.out.println(" ");
	
	thar.move(40, 0);
	thar.accelerate(20);
	//thar.accelerate(-60);
	
	System.out.println(" ");
	System.out.println("current gear is : " +thar.getCurrentGear());
	System.out.println("Current speed is: "+thar.getCurrentSpeed());
	System.out.println("Current Direction is :"+thar.getCurrentDirection());
	
	
	}

}
