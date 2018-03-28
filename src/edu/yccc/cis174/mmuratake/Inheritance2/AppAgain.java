package edu.yccc.cis174.mmuratake.Inheritance2;

public class AppAgain {
	
	public static void main(String[] args)
	{
		Bike b = new Bike();
		
		// Bike does not have a toString. But Object does. So we created one for Bike!
		System.out.println(b.toString());
		
		MountainBike mb = new MountainBike();		
		
		// MountainBike doesn't have a toString. Buuut, Bike does. And MountainBike extends Bike.
		System.out.println(mb.toString());
	}

}
