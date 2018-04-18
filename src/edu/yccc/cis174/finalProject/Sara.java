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

	public void hobbies() 
	{
		List<String> hobbies = new ArrayList<String>();
		hobbies.add("I like wreaking my friend. Heh. I do nothing else with my life.");
		hobbies.add("I hang with my friends a lot.");
		hobbies.add("Being a jackass. Heh heh.");
		hobbies.add("Probably being the worst friend ever.");
		int index = random.nextInt(hobbies.size());
		System.out.println(hobbies.get(index));		
	}

	public void friends() 
	{
		List<String> friends = new ArrayList<String>();
		friends.add("I have a friend whose life I make miserable. But we stick together anyway.");
		friends.add("This guy named Joseph, who shares the same sense of humor as me.");
		friends.add("A friend I haven't seen in a while. I used to make his life terrible.");
		int index = random.nextInt(friends.size());
		System.out.println(friends.get(index));		
	}

	@Override
	public void family()
	{
		// TODO Auto-generated method stub
		
	}

	public void greeting() 
	{
		List<String> greetings = new ArrayList<String>();
		greetings.add("Hey. Heh. Let's start.");
		greetings.add("Hi there. Wanna start?");
		greetings.add("Hey. Nice day over there?");
		int index = random.nextInt(greetings.size());
		System.out.println(greetings.get(index));
	}

}
