package edu.yccc.cis174.mmuratake.finalproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Sara implements Character{
	
	private static Random random = new Random();
	static Scanner console = new Scanner(System.in);
	
	User u = new User();
	
	String guess;


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
		int like = random.nextInt(likes.size());
		System.out.println(likes.get(like));
		
		System.out.println("What do you like?");
		u.setLikes(console.next());
		System.out.println("");
		
		dislikes();
	}

	public void dislikes() 
	{
		List<String> dislikes = new ArrayList<String>();
		dislikes.add("I hate it when I try to bother my friend and it just doesn't work. It kills me.");
		dislikes.add("My brother bothers me.");
		dislikes.add("The dark bothers me more than it should. Heh.");
		int dislike = random.nextInt(dislikes.size());
		System.out.println(dislikes.get(dislike));
		
		System.out.println("What do you dislike?");
		u.setDislikes(console.next());
		System.out.println("");
		
		hobbies();
	}

	public void hobbies() 
	{
		List<String> hobbies = new ArrayList<String>();
		hobbies.add("I like watching my friend get rekt. Heh. I do nothing else with my life.");
		hobbies.add("I hang with my friends a lot.");
		hobbies.add("Being a jackass. Heh heh.");
		hobbies.add("Probably being the worst friend ever.");
		int hobby = random.nextInt(hobbies.size());
		System.out.println(hobbies.get(hobby));		
		
		System.out.println("What's one of your hobbies?");
		u.setHobbies(console.next());	
		System.out.println("");
		
		friends();
	}

	public void friends() 
	{
		List<String> friends = new ArrayList<String>();
		friends.add("I have a friend whose life I make miserable. But we stick together anyway.");
		friends.add("This guy named Joseph, who shares the same sense of humor as me.");
		friends.add("A friend I haven't seen in a while. I used to make his life terrible.");
		int friend = random.nextInt(friends.size());
		System.out.println(friends.get(friend));		
		
		System.out.println("What's the name of one of your friends?");
		
		u.setFriends(console.next());
		System.out.println("");
		
		family();
	}

	public void family()
	{
		List<String> family = new ArrayList<String>();
		family.add("I have a brother.");
		family.add("I have a half-brother who seems to like me.");
		family.add("A younger brother, we're not that close.");
		int familyMember = random.nextInt(family.size());
		System.out.println(family.get(familyMember));		
		
		System.out.println("Do you have any siblings or pets?");
		
		u.setFamily(console.next());
		System.out.println("");
		
		guess();
	}

	public void greeting() 
	{
		List<String> greetings = new ArrayList<String>();
		greetings.add("Hey. Let's start.");
		greetings.add("Hi there. Wanna start?");
		greetings.add("Hey. Nice day over there?");
		int greetingPhrase = random.nextInt(greetings.size());
		System.out.println(greetings.get(greetingPhrase));
		
		likes();
		
	}
	
	public void guess()
	{
		System.out.println("Can you guess who I am?");
		
		guess = console.next();
		
		if(guess.equals(name()))
		{
			System.out.println("That's right! You got me. Good job.");
		}
		else
		{
			System.out.println("Sorry, I'm Sara. Better luck next time.");
		}
		
		System.out.println("What's your name?");
		u.setName(console.next());
	}

}
