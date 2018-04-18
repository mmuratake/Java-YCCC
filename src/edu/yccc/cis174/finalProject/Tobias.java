package edu.yccc.cis174.finalProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Tobias implements Character{
	
	// Each character has a list of stats. One out of the list is chosen to determine which one is "set" for the round.
	
	private static Random random = new Random();
	static Scanner console = new Scanner(System.in);


	public String name() 
	{
		return "Tobias";
	}

	public void likes() 
	{
		List<String> likes = new ArrayList<String>();
		likes.add("I like hot dogs. They're good. No matter when.");
		likes.add("Chocolates are good.");
		likes.add("My friend got me this cool watch and I really like it.");
		likes.add("I like Coke.");
		int index = random.nextInt(likes.size());
		System.out.println(likes.get(index));
	}

	public void dislikes() 
	{
		List<String> dislikes = new ArrayList<String>();
		dislikes.add("I'm not that good at reading. It bores me, I guess.");
		dislikes.add("I don't do well with kids. They scare me, kinda.");
		dislikes.add("Girls make me nervous. What am I supposed to say?");
		int index = random.nextInt(dislikes.size());
		System.out.println(dislikes.get(index));
	}

	public void hobbies() 
	{
		List<String> hobbies = new ArrayList<String>();
		hobbies.add("Nothing in particular, I guess.");
		hobbies.add("I feel like I do nothing else with my life than hanging out with my friends.");
		hobbies.add("You wish I were a more interesting person.");
		hobbies.add("What the heck? Do I have one?");
		int index = random.nextInt(hobbies.size());
		System.out.println(hobbies.get(index));
	}

	public void friends() 
	{
		List<String> friends = new ArrayList<String>();
		friends.add("I got this friend who's a treehugger. Cept he don't hug trees.");
		friends.add("There's this friend of mine who's really shy. Barely talks.");
		friends.add("I have a friend who really likes the dictionary. He's weird.");
		int index = random.nextInt(friends.size());
		System.out.println(friends.get(index));
	}

	public void family() 
	{
		List<String> family = new ArrayList<String>();
		family.add("I don't have any pets.");
		family.add("I don't got any siblings.");
		family.add("I'm an only child.");
		int index = random.nextInt(family.size());
		System.out.println(family.get(index));
	}

	public void greeting() 
	{
		List<String> greetings = new ArrayList<String>();
		greetings.add("Hey. Do I know you? Let's start.");
		greetings.add("Hey. You wanna start?");
		greetings.add("Hey.");
		int index = random.nextInt(greetings.size());
		System.out.println(greetings.get(index));	
	}
	
}
