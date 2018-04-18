package edu.yccc.cis174.finalProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tobias implements Character{
	
	// Each character has a list of stats. One out of the list is chosen to determine which one is "set" for the round.
	
	private static Random random = new Random();

	public String name() {
		return "Tobias";
	}

	public void getLikes() {
		List<String> likes = new ArrayList<String>();
		likes.add("hot dogs");
		likes.add("chocolates");
		likes.add("cool watches");
		likes.add("Coke");
		int index = random.nextInt(likes.size());
		System.out.println(likes.get(index));
	}

	@Override
	public void getDislikes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getHobbies() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getFriends() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getFamily() {
		// TODO Auto-generated method stub
		
	}

	public void greeting() 
	{
		System.out.println("Hey. You play before?");
		
	}
	
}
