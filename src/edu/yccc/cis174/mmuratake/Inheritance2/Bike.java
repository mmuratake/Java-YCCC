package edu.yccc.cis174.mmuratake.Inheritance2;

// Highlight Bike, right-click, "Open Type Hierarchy."

public class Bike {
	
	int topSpeed;
	boolean hasTrainingWheels;
	int gearCount;
	
	public Bike()
	{
		this.topSpeed = 12;
		this.hasTrainingWheels = false;
		this.gearCount = 3;
	}
	
	public int getTopSpeed() 
	{
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) 
	{
		this.topSpeed = topSpeed;
	}

	public boolean isHasTrainingWheels() 
	{
		return hasTrainingWheels;
	}

	public void setHasTrainingWheels(boolean hasTrainingWheels) 
	{
		this.hasTrainingWheels = hasTrainingWheels;
	}

	public int getGearCount() 
	{
		return gearCount;
	}

	public void setGearCount(int gearCount) 
	{
		this.gearCount = gearCount;
	}

	public String toString()
	{
		return "Bike : topSpeed = " + topSpeed + " hasTrainingWheels = " 
	+ hasTrainingWheels + " gearCount = " + gearCount;
	}

}
