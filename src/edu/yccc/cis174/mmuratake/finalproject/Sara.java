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
 * Sara's guessing game.
 *
 */

public class Sara implements Character{
	
	// Each character has a list of possible answers. 
	// One out of the list is chosen to determine which answer they give this time.
	
	private static Random random = new Random();
	static Scanner console = new Scanner(System.in);
	
	AskUserQuestions auq = new AskUserQuestions();
	
	String guess;

	public String name() 
	{
		return "Sara";
	}
	
	public void greeting() 
	{
		List<String> greetings = new ArrayList<String>();
		greetings.add("Hey. Let's start.");
		greetings.add("Hi there. Wanna start?");
		greetings.add("Hey. Nice day over there?");
		int greetingPhrase = random.nextInt(greetings.size());
		System.out.println(greetings.get(greetingPhrase));
		
		console.nextLine();
		
		System.out.println("");
		likes();
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
		
		auq.askLikes();
		
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
		
		auq.askDislikes();
		
		hobbies();
	}

	public void hobbies() 
	{
		List<String> hobbies = new ArrayList<String>();
		hobbies.add("I like watching my friend get rekt. Heh. I do nothing else with my life.");
		hobbies.add("I hang with my friends a lot.");
		hobbies.add("Hobbies? Being a jackass. Heh heh.");
		hobbies.add("My hobby is probably being the worst friend ever.");
		int hobby = random.nextInt(hobbies.size());
		System.out.println(hobbies.get(hobby));		
		
		auq.askHobbies();
		
		friends();
	}

	public void friends() 
	{
		List<String> friends = new ArrayList<String>();
		friends.add("I have a friend whose life I make miserable. But we stick together anyway.");
		friends.add("I know this guy named Joseph, who shares the same sense of humor as me.");
		friends.add("There's this friend I haven't seen in a while. I used to make his life terrible.");
		int friend = random.nextInt(friends.size());
		System.out.println(friends.get(friend));		
		
		auq.askFriends();
		
		family();
	}

	public void family()
	{
		List<String> family = new ArrayList<String>();
		family.add("I have a brother.");
		family.add("I have a half-brother who seems to like me.");
		family.add("I have a younger brother, we're not that close.");
		int familyMember = random.nextInt(family.size());
		System.out.println(family.get(familyMember));		
		
		auq.askFamily();
		
		guess();
	}
	
	// Prompt the player to guess who they are and try to guess the player as well.
	public void guess()
	{
		System.out.println("Now, who am I?");
		
		guess = console.next();
		
		// If the player guesses correctly.
		if(guess.equalsIgnoreCase(name()))
		{
			System.out.println("That's right! You got me. Good job.");
			console.next();
		}
		// If the player answers "I don't know."
		else if(guess.equalsIgnoreCase("idk") || guess.equalsIgnoreCase("I don't know"))
		{
			System.out.println("Heheh! I'm Sara! Nice to meet you.");
			console.next();
		}
		// If the player guesses incorrectly.
		else
		{
			System.out.println("Sorry, I'm Sara. Better luck next time.");
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
		
		System.out.println("Play again sometime. See you later!");
	}

}
