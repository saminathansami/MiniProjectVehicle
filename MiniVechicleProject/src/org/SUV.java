package org;

//SUV is a child class of Car class

public class SUV extends Car{

	public SUV(String name,  boolean isManual) 
	{
		super(name, 4, 5, 6, isManual, "SUV");
		//passed parameters for arguments wheels , doors, and type
	}
	
	//we used rate to define how much the car accelerates
	/*
	 * when accelerating the speed the rate	it is increasing = positive
	 * when applying break the acceleration of the rate= negative
	 */
	public void accelerate(int rate)
	{
		
		int newSpeed=getCurrentSpeed()+rate;   //currentspeed is taken from vehicle class
		/*
		 * we need to know how the gear changes according to speed
		 * speed =0 : gear 1
		 * speed 0 -10 : gear 1
		 * speed 10 -20 : gear 2
		 * speed 20 -30 : gear 3
		 * speed 30 -50 : gear 4
		 * speed 50 -70: gear 5
		 * speed>70 :gear 6
		 */
		
		if(newSpeed==0)
		{
			stop();
			changeGear(1);			
		}
		else if(newSpeed>0 && newSpeed<=10)
		{
			changeGear(1);
		}
		else if(newSpeed>10 && newSpeed<=20)
		{
			changeGear(2);
		}
		else if(newSpeed>20 && newSpeed<=30)
		{
			changeGear(3);
		}
		else if(newSpeed>30 && newSpeed<=50)
		{
			changeGear(4);
		}
		else if(newSpeed>50 && newSpeed<=70)
		{
			changeGear(5);
		}
		else
		{
			changeGear(6);
		}
		
		//if user doesn't stop the speed means 
		if(newSpeed>0)
		{
			changeSpeed(newSpeed, getCurrentDirection());
		}
		
	}
	

}
