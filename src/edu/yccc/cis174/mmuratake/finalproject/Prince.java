package edu.yccc.cis174.mmuratake.finalproject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * @author sMamiMuratake
 * May 2 2018
 * Final Project: Guessing Game
 * Prince's guessing game.
 *
 */

public class Prince implements Character{
	
	// Each character has a list of possible answers. 
	// One out of the list is chosen to determine which answer they give this time.
	
	private static Random random = new Random();
	static Scanner console = new Scanner(System.in);
	
	AskUserQuestions auq = new AskUserQuestions();
	
	String guess;

	public String name() 
	{
		return "Prince";
	}
	
	public void greeting() 
	{
		List<String> greetings = new ArrayList<String>();
		greetings.add("Hi there. Oh geez, I'm nervous.");
		greetings.add("Hi there! Uh... Haha!");
		greetings.add("Hi, I come from a random fantasy world! Where do you come from? What? The real world? Oh. Haha!");
		int greetingPhrase = random.nextInt(greetings.size());
		System.out.println(greetings.get(greetingPhrase));
		
		console.nextLine();
		
		System.out.println("");
		likes();
	}

	public void likes() 
	{
		List<String> likes = new ArrayList<String>();
		likes.add("I really like this friend of mine-- What, there's a friend question later? Does this still count?");
		likes.add("....What do I like? Uh... Hm... Nothing in particular...");
		likes.add("There's this girl named Raven and I think she's really attractive. Does that count as something I like?");
		likes.add("If I had something, I wouldn't struggle this much to be an semi-interesting character.");
		int like = random.nextInt(likes.size());
		System.out.println(likes.get(like));
		
		auq.askLikes();
		
		dislikes();
	}

	public void dislikes() 
	{
		List<String> dislikes = new ArrayList<String>();
		dislikes.add("I don't like how I suck at swinging around a sword, but I guess I wouldn't have to where you are.");
		dislikes.add("I don't like feeling over-exposed. Does anyone understand?");
		dislikes.add("I don't like how I'm not too good at being social...");
		dislikes.add("Okay, so I have a terrible memory and I wish it were better.");
		int dislike = random.nextInt(dislikes.size());
		System.out.println(dislikes.get(dislike));
		
		auq.askDislikes();
		
		hobbies();
	}

	public void hobbies() 
	{
		List<String> hobbies = new ArrayList<String>();
		hobbies.add("Is being a couch potato a hobby? No? I should get a life.");
		hobbies.add("I like to play tennis.");
		hobbies.add("There's this game similar to tag but a bit more extreme that my friends and I used to play often.");
		hobbies.add("I'm pretty good at playing tennis. If I had to list a hobby, it's probably that.");
		int hobby = random.nextInt(hobbies.size());
		System.out.println(hobbies.get(hobby));		
		
		auq.askHobbies();
		
		friends();
	}

	public void friends() 
	{
		List<String> friends = new ArrayList<String>();
		friends.add("I have a best friend named Lest!");
		friends.add("There's this kid I know named Ridhi and we're friends.");
		friends.add("I actually have more friends than I think. But when you say friend, it's Lest.");
		friends.add("Do you think people I hang out with are friends? I guess they are...");
		int friend = random.nextInt(friends.size());
		System.out.println(friends.get(friend));		
		
		auq.askFriends();
		
		family();
	}

	public void family()
	{
		List<String> family = new ArrayList<String>();
		family.add("I had a pet once named Land.");
		family.add("I sure don't have any siblings. Or pets.");
		family.add("I'm not sure what I'd do with siblings. It's a good thing I don't have any.");
		int familyMember = random.nextInt(family.size());
		System.out.println(family.get(familyMember));		
		
		auq.askFamily();
		
		guess();
	}
	
	// Prompt the player to guess who they are and try to guess the player as well.
	public void guess()
	{
		System.out.println("Alright, can you guess who I am?");
		
		guess = console.next();
		
		// If the player guesses correctly.
		if(guess.equalsIgnoreCase(name()))
		{
			System.out.println("Wow, you got it! Good job!");
			console.next();
		}
		// If the player answers "no, I don't know."
		else if(guess.equalsIgnoreCase("no") || guess.equalsIgnoreCase("I don't know"))
		{
			System.out.println("My name's Prince! Hope you remember me.");
			console.next();
		}
		// If the player guesses incorrectly.
		else
		{
			System.out.println("No, sorry, I'm Prince. Maybe next time?");
			console.next();
		}
		
		ReadFromFile rff = new ReadFromFile();
		
		rff.u2.setLikes(auq.u.getLikes());
		rff.u2.setDislikes(auq.u.getDislikes());
		rff.u2.setHobbies(auq.u.getHobbies());
		rff.u2.setFriends(auq.u.getFriends());
		rff.u2.setFamily(auq.u.getFamily());
		
		// Try to guess the player.
		rff.guessUser();
		
		auq.u.setName(rff.u2.getName());
				
		WriteToFile wtf = new WriteToFile();
		// Record the player's answers to try to guess them if they play again.
		try 
		{
			wtf.writeUserStats(auq.u.getLikes(), auq.u.getDislikes(), auq.u.getHobbies(), auq.u.getFriends(), auq.u.getFamily(), auq.u.getName());
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		System.out.println("Thanks for playing! Come back again if you feel like it.");
	}

}
