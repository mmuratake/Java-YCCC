package edu.yccc.cis174.mmuratake.Notes;

public class ObjectInstances {
	
	
	
	public static void main(String[] args)
	{
		// First part (Constructors) = type of object you are working with.
		// Second part is the instance name.
		// def creates the object instance.
		// After the equals sign is what creates def.
		
		
		Constructors def = new Constructors("String value is what?");
		def.printValues();
		
		Constructors ghi = new Constructors(12, "A different string value!");
		ghi.printValues();
		
	}
	
	
	/**
	 * By the way, the reason why you didn't have to create the constructors again and stuff is because you're in the same package.
	 * Otherwise, you would have had to import it.
	 */

}
