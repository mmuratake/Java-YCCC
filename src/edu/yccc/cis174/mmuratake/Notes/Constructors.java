package edu.yccc.cis174.mmuratake.Notes;

public class Constructors {
	
	String value;
	// A String value, when not set, is null.
	int x;
	// An integer value, when not set, is 0.
	
	
	
	// Constructors is the entry point to object creation.
	// Constructors get called at object creation time.
	
	public Constructors()
	{
		//This is a no-argument constructor.
	}
	
	public Constructors(String value)
	{
		// This takes one argument!
		this.value = value;
	}
	
	public Constructors(int x, String value)
	{
		// This takes two. By the way, the name of these methods had to be the same as the Class, I wonder why.
		
		this.x = x;
		this.value = value;
	}
	
	public String getValue()
	{
		return value;
	}
	
	public int getX()
	{
		return x;
	}
	
	public void printValues()
	{
		System.out.println(x);
		System.out.println(value);
	}
	
	public static void main(String[] args)
	{
		// This uses the constructor from line 15 (the first one)! Because there are no arguments in this one!
		Constructors abc = new Constructors();
		abc.printValues();
		
		Constructors def = new Constructors("String value is what?");
		def.printValues();
		
		Constructors ghi = new Constructors(12, "A different string value!");
		ghi.printValues();
	}
	
	/**
	 *  Every Class needs a constructor. However, you don't need to state it because it's implied that it's there.
	 *  If, though, you create an argument constructor, then, if you ever want to call by a no-arg again, you need to explicitly state
	 *  	the no-arg constructor. Otherwise, you can't ever call without args again.
	 */

}
