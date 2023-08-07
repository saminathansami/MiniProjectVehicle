package org;

//this car class is a child class of a vehicle
//so we use car extends vehicle, also we use super class
public class Car extends Vehicle 
{
	
	
	private int wheels;
	private String type;
	private int doors;
	private int gears;
	private boolean isManual;  //in this project gear is set to automatic
	private int currentGear;

//we pass the above variable with the parameterized constructor with string name of super class	
	
	public Car(String name,int wheels, int doors, int gears, boolean isManual, String type) 
	{
		super(name);
		this.type=type;
		this.gears=gears;
		this.doors=doors;
		this.isManual=isManual;
		this.wheels=wheels;
		currentGear=1;
		
//if Car is called automatically this constructor is called
		//we set car gear to 1 because we assumed majority cases the car is initially in first gear
	}
	
	//getters and setters
	
	public int getWheels() {
		return wheels;
	}



	public void setWheels(int wheels) {
		this.wheels = wheels;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public int getDoors() {
		return doors;
	}



	public void setDoors(int doors) {
		this.doors = doors;
	}



	public int getGears() {
		return gears;
	}



	public void setGears(int gears) {
		this.gears = gears;
	}



	public boolean isManual() {
		return isManual;
	}



	public void setManual(boolean isManual) {
		this.isManual = isManual;
	}



	public int getCurrentGear() {
		return currentGear;
	}



	public void setCurrentGear(int currentGear) {
		this.currentGear = currentGear;
	}



	public void changeGear(int newGear)
	{
		this.currentGear=newGear;
		System.out.println("changeGear mehtod called : Changed to "+this.currentGear+" gear");
	}

//next we use changespeed method where it has new speed and new direction
	//in vehicle class we had move mehtod which has speed and the direction- just invoke that
	
	public void changeSpeed(int newSpeed, int newDirection)
	{
		move(newSpeed,newDirection);
		System.out.println("changespeed is called : Speed => "+newSpeed+" Direction => "+newDirection);
		
	}

}
