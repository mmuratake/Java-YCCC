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
 * Violet's guessing game.
 *
 */

public class Violet implements Character{
	
	// Each character has a list of possible answers. 
	// One out of the list is chosen to determine which answer they give this time.
	
	private static Random random = new Random();
	static Scanner console = new Scanner(System.in);
	
	AskUserQuestions auq = new AskUserQuestions();
	
	String guess;

	public String name() 
	{
		return "Violet";
	}
	
	public void greeting() 
	{
		List<String> greetings = new ArrayList<String>();
		greetings.add("Hello. ...Would you like to start?");
		greetings.add("Good day. Shall we begin?");
		greetings.add("It's been a good day over here... Wanna start?");
		int greetingPhrase = random.nextInt(greetings.size());
		System.out.println(greetings.get(greetingPhrase));
		
		console.nextLine();
		
		System.out.println("");
		likes();
	}

	public void likes() 
	{
		List<String> likes = new ArrayList<String>();
		likes.add("I like to write. Maybe like is an understatement. Or simply a misinterpretation? Hmm...");
		likes.add("I like...to write. I suppose. It's more a passion than a like.");
		likes.add("...Oh. I like to think about things. Many things... Like the moon, for example.");
		likes.add("I need to stop watching memes. I need to shut up about memes. Hmm...");
		int like = random.nextInt(likes.size());
		System.out.println(likes.get(like));
		
		auq.askLikes();
		
		dislikes();
	}

	public void dislikes() 
	{
		List<String> dislikes = new ArrayList<String>();
		dislikes.add("I do not... like it when... Agh... There's something at the tip of my tongue and I don't know what it is.");
		dislikes.add("I can never seem to write something that satisfies me, and I really don't like that.");
		dislikes.add("I don't like getting up early. I'm not an early bird.");
		int dislike = random.nextInt(dislikes.size());
		System.out.println(dislikes.get(dislike));
		
		auq.askDislikes();
		
		hobbies();
	}

	public void hobbies() 
	{
		List<String> hobbies = new ArrayList<String>();
		hobbies.add("I write a lot. Every night, actually. I hope that counts as a hobby?");
		hobbies.add("Writing is more a passion than it is a hobby, but I guess it counts.");
		hobbies.add("Memes is a hobby. Memes is a big hobby. Yes.");
		hobbies.add("I have a friend who likes memes and we like to make fun of them a lot...");
		int hobby = random.nextInt(hobbies.size());
		System.out.println(hobbies.get(hobby));		
		
		auq.askHobbies();
		
		friends();
	}

	public void friends() 
	{
		List<String> friends = new ArrayList<String>();
		friends.add("I have a dear friend who we respectfully call Meme King.");
		friends.add("Ooh. I have a small group of friends I see daily. We don't do much.");
		friends.add("Heheh. I have a friend who I very much like...");
		friends.add("My friends always seem to get loud. And we talk about memes a lot.");
		int friend = random.nextInt(friends.size());
		System.out.println(friends.get(friend));		
		
		auq.askFriends();
		
		family();
	}

	public void family()
	{
		List<String> family = new ArrayList<String>();
		family.add("I do not have any siblings as far as I'm concerned.");
		family.add("Hmm, if I had a pet, I would definitely kill it by accident.");
		family.add("I grew up an only child. We never had pets. Which was a good thing, I suppose...");
		int familyMember = random.nextInt(family.size());
		System.out.println(family.get(familyMember));		
		
		auq.askFamily();
		
		guess();
	}
	
	// Prompt the player to guess who they are and try to guess the player as well.
	public void guess()
	{
		System.out.println("So... Can you tell who I am?");
		
		guess = console.next();
		
		// If the player guesses correctly.
		if(guess.equalsIgnoreCase(name()))
		{
			System.out.println("Heheh! That's right... Congratulations.");
			console.next();
		}
		// If the player answers "no, I don't know."
		else if(guess.equalsIgnoreCase("no") || guess.equalsIgnoreCase("I don't know"))
		{
			System.out.println("My name is Violet. Hello there...");
			console.next();
		}
		// If the player guesses incorrectly.
		else
		{
			System.out.println("Hmm. That would be incorrect. My name is Violet...");
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
		
		System.out.println("Thank you for playing. Please come back sometime?");
	}

}
