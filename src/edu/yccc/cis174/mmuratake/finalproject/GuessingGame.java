package edu.yccc.cis174.mmuratake.finalproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * @author sMamiMuratake
 * May 2 2018
 * Final Project: Guessing Game
 * 
 * Acceptance Criteria:
 * 1. Write to file
 * 2. Read from file
 * 3. Randomly generate each character's answers from a list
 * 4. Use interface
 * 5. Allow for a different experience every time the user plays
 *
 */
public class GuessingGame {
	
	private static Random random = new Random();
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		// Chooses a character at random.
		List<String> characterList = new ArrayList<String>();
		characterList.add("Tobias");
		characterList.add("Samuel");
		characterList.add("Sara");
		characterList.add("Violet");
		characterList.add("Prince");
		int index = random.nextInt(characterList.size());
		
		rules();
		
		if(characterList.get(index).equals("Tobias"))
		{
			Tobias t = new Tobias();
			t.greeting();
		}
		if(characterList.get(index).equals("Prince"))
		{
			Prince p = new Prince();
			p.greeting();
		}
		if(characterList.get(index).equals("Sara"))
		{
			Sara s = new Sara();
			s.greeting();
		}
		if(characterList.get(index).equals("Violet"))
		{
			Violet v = new Violet();
			v.greeting();
		}
		if(characterList.get(index).equals("Samuel"))
		{
			Violet v = new Violet();
			v.greeting();
		}
	}
	
	// Attempt to explain the game to the user (if the user has not played before).
	public static void rules()
	{
		System.out.println("Have you played this game before?");
		System.out.println("1.Yes    2.No");
		
		String played = console.next();
		
		if(played.equals("1") || played.equalsIgnoreCase("yes"))
		{
			System.out.println("Good luck. Type anything to continue.");
			console.next();
			System.out.println("");
			
		}
		else if(played.equals("2") || played.equalsIgnoreCase("no"))
		{
			System.out.println("This is a guessing game. "
					+ "\r\nOne randomly chosen character will tell you a little about him/herself. "
					+ "\r\nYou must guess the character based on your past play experiences. "
					+ "\r\n	(Since you've never played before, this first round is impossible to win.) "
					+ "\r\nIn addition, each character will try to guess you based on information you give them. "
					+ "\r\nThey will likewise use their past experience to try to figure out who you are. "
					+ "\r\nSee if you can guess them before they can start to guess you. "
					+ "\r\nGood luck!");
			console.next();
			System.out.println("");
		}
		else
		{
			System.out.println("You have not entered a valid response. Please try again.");
			rules();
		}
	}

}
