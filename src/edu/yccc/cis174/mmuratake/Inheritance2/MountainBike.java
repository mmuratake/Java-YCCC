package edu.yccc.cis174.mmuratake.Inheritance2;

public class MountainBike extends Bike{
	
	boolean hasSuspension;
	boolean isFatBike;
	
	public MountainBike()
	{
		super();
		// MountainBike does not have gearCount. But Bike does. And MountainBike extends Bike.
		setGearCount(12);
		this.hasSuspension = true;
		this.isFatBike = true;
	}
	
	public boolean isHasSuspension() 
	{
		return hasSuspension;
	}

	public void setHasSuspension(boolean hasSuspension) 
	{
		this.hasSuspension = hasSuspension;
	}

	public boolean isFatBike() 
	{
		return isFatBike;
	}

	public void setFatBike(boolean isFatBike) 
	{
		this.isFatBike = isFatBike;
	}

	public String toString()
	{
		// "Super" concatenates the parent's toString with what you put after it (or before).
		return "Mountain " + super.toString() + " hasSuspension = " + hasSuspension + " isFitBike = " + isFatBike;
	}

}
