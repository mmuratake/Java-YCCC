package edu.yccc.cis174.mmuratake.finalProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	
	private static Random random = new Random();
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		
		// 1. Choose a character (at random). Needs a list of characters, then chooses one randomly.
		List<String> characterList = new ArrayList<String>();
		characterList.add("Tobias");
		//characterList.add("Samuel");
		characterList.add("Sara");
		//characterList.add("Violet");
		int index = random.nextInt(characterList.size());
		
		rules();
		
		
		// 2. Determines the rest of the game by choosing the character for good.
		if(characterList.get(index).equals("Tobias"))
		{
			Tobias t = new Tobias();
			t.greeting();
		}
		if(characterList.get(index).equals("Samuel"))
		{
			
		}
		if(characterList.get(index).equals("Sara"))
		{
			Sara s = new Sara();
			s.greeting();
		}
		if(characterList.get(index).equals("Violet"))
		{
			
		}
	}
	
	public List<String> askQuestions()
	{
		List<String> questions = new ArrayList<String>();
		questions.add("What do you like?");
		questions.add("What do you dislike?");
		questions.add("What are your hobbies?");
		questions.add("Who are you friends with?");
		questions.add("Who are your family members?");
		
		int index = random.nextInt(questions.size());
		System.out.println(questions.get(index));
		
		
		
		return questions;
	}
	
	
	public static void askQuestion()
	{
		GuessingGame gg = new GuessingGame();
		//gg.
	}
	
	public static void rules()
	{
		System.out.println("Have you played this game before?");
		System.out.println("1.Yes    2.No");
		
		String played = console.next();
		
		if(played.equals("1"))
		{
			System.out.println("Good luck. Press any key to continue.\r\n");
		}
		else if(played.equals("2"))
		{
			System.out.println("Explain the rules.\r\n");
		}
		else
		{
			System.out.println("You have not entered a valid response. Please try again.");
			rules();
		}
	}

}
