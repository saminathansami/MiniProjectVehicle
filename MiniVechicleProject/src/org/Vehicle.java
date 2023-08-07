package org;


//vehicle is the parent class  of all 

public class Vehicle 
{
	private String name;
	private int currentSpeed;
	private int currentDirection;
	
	
//when we are giving name to the vehicle each time - speed - direction should be zero
	//so pass the name and set speed and direction to zero
	
	public Vehicle(String name)
		{
			super();
			this.name = name;
			this.currentSpeed=0;
			this.currentDirection=0;
		}
	
//then each vehicle has the ability to steer  that tends to the -  direction
	public void steer(int direction)
	{
		this.currentDirection=direction;
		System.out.println("Steer method is called:  Steering at :"+currentDirection+" degrees.");
	}
	
//then each vehicle has the ability to move which has the access of speed and direction
	public void move(int speed,int direction)
	{
		currentSpeed=speed;
		currentDirection=direction;
		System.out.println("move method is called  :Moving At the speed of :"+currentSpeed+"kmph"+"in direction "+currentDirection);
		
	}
	
//now we have to use the getter setter for the variables
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	public int getCurrentDirection() {
		return currentDirection;
	}

	public void setCurrentDirection(int currentDirection) {
		this.currentDirection = currentDirection;
	}
	
//then vehicle should stop at a point - for that we use stop method
	public void stop() {
		this.currentSpeed=0;
		System.out.println("The vehicles is stopped");
	}
	
	
	

}
