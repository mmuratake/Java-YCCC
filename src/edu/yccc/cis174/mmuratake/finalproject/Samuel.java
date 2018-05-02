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

public class Samuel implements Character{
	
	// Each character has a list of possible answers. 
	// One out of the list is chosen to determine which answer they give this time.
	
	private static Random random = new Random();
	static Scanner console = new Scanner(System.in);
	
	AskUserQuestions auq = new AskUserQuestions();
	
	String guess;

	public String name() 
	{
		return "Samuel";
	}
	
	public void greeting() 
	{
		List<String> greetings = new ArrayList<String>();
		greetings.add("Hey!! Haha!");
		greetings.add("Hey! What's your name? Oh, I'm not allowed to ask that. Heheh!");
		greetings.add("Hey! Wanna play?");
		int greetingPhrase = random.nextInt(greetings.size());
		System.out.println(greetings.get(greetingPhrase));
		
		console.nextLine();
		
		System.out.println("");
		likes();
	}

	public void likes() 
	{
		List<String> likes = new ArrayList<String>();
		likes.add("I like food! I like eating with other people.");
		likes.add("I like running. Like, ... For no reason, I guess.");
		likes.add("I like my friends. I like doing sh*t with them.  ...Was I not supposed to say that? Sorry.");
		likes.add("I like watching the sunset. Like, from somewhere high. Tall.");
		int like = random.nextInt(likes.size());
		System.out.println(likes.get(like));
		
		auq.askLikes();
		
		dislikes();
	}

	public void dislikes() 
	{
		List<String> dislikes = new ArrayList<String>();
		dislikes.add("I hate how I can't, like, seem to find anyone who'll climb a tree with me because they say it's childish.");
		dislikes.add("I hate m*therf-- I can't say that? Fine. I don't like jerks. Wow, that's an understatement.");
		dislikes.add("I don't like heights. Though I like the view from high places...");
		int dislike = random.nextInt(dislikes.size());
		System.out.println(dislikes.get(dislike));
		
		auq.askDislikes();
		
		hobbies();
	}

	public void hobbies() 
	{
		List<String> hobbies = new ArrayList<String>();
		hobbies.add("I like to go places for fun. Places I've never been to before.");
		hobbies.add("I like to climb trees, but most people my age don't seem to do that anymore.");
		hobbies.add("Is just hanging out with my friends a good hobby?");
		hobbies.add("I like to spend time with my friends.");
		int hobby = random.nextInt(hobbies.size());
		System.out.println(hobbies.get(hobby));		
		
		auq.askHobbies();
		
		friends();
	}

	public void friends() 
	{
		List<String> friends = new ArrayList<String>();
		friends.add("I have a lot of good friends!! I guess I shouldn't name them all, huh?");
		friends.add("A lot of my friends are from foreign countries, actually, it's pretty cool.");
		friends.add("I have some really good friends, I wish I could spend more time with them.");
		friends.add("I have a friend named Yata, I swear he can give someone a vasectomy by kicking them in the-- Sorry, nevermind.");
		int friend = random.nextInt(friends.size());
		System.out.println(friends.get(friend));		
		
		auq.askFriends();
		
		family();
	}

	public void family()
	{
		List<String> family = new ArrayList<String>();
		family.add("Mmm, I don't have any blood-related siblings...");
		family.add("I don't have any real siblings, or pets. I don't know why I never had pets.");
		family.add("I don't...have any blood relations, but I grew really close to some people.");
		int familyMember = random.nextInt(family.size());
		System.out.println(family.get(familyMember));		
		
		auq.askFamily();
		
		guess();
	}
	
	// Prompt the player to guess who they are and try to guess the player as well.
	public void guess()
	{
		System.out.println("Hey, can you guess who I am?");
		
		guess = console.next();
		
		// If the player guesses correctly.
		if(guess.equalsIgnoreCase(name()))
		{
			System.out.println("Hahaha! That's right! You got it!");
			console.next();
		}
		// If the player answers "no, I don't know."
		else if(guess.equalsIgnoreCase("no") || guess.equalsIgnoreCase("I don't know"))
		{
			System.out.println("Oh. That's too bad. I'm Samuel! I hope you remember me!");
			console.next();
		}
		// If the player guesses incorrectly.
		else
		{
			System.out.println("Hahaha! No, I'm Samuel!");
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
		
		System.out.println("Hey, thanks for playing! Come back again, okay?");
	}

}
