package edu.yccc.cis174.finalProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sara implements Character{
	
	private static Random random = new Random();

	public String name() 
	{
		return "Sara";
	}

	public void likes() 
	{
		List<String> likes = new ArrayList<String>();
		likes.add("I love watching my friend get rekt.");
		likes.add("Heh. I like it when my friend gets rekt.");
		likes.add("You know that awesome feeling when your friend gets rekt? That.");
		likes.add("Get rekt, buddy.");
		int index = random.nextInt(likes.size());
		System.out.println(likes.get(index));
	}

	public void dislikes() 
	{
		List<String> dislikes = new ArrayList<String>();
		dislikes.add("I hate it when I thought my friend would get rekt then he doesn't. It kills me.");
		dislikes.add("My brother bothers me.");
		dislikes.add("The dark bothers me more than it should. Heh.");
		int index = random.nextInt(dislikes.size());
		System.out.println(dislikes.get(index));
	}

	@Override
	public void hobbies() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void friends() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void family()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void greeting() 
	{
		// TODO Auto-generated method stub
		
	}

}
