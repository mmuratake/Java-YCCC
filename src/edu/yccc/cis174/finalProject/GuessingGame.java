package edu.yccc.cis174.finalProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	
	private static Random random = new Random();
	static Scanner console = new Scanner(System.in);
	
	public static void play()
	{
		// 1. Choose a character (at random). Needs a list of characters, then chooses one randomly.
		List<String> characterList = new ArrayList<String>();
		characterList.add("Tobias");
		characterList.add("Samuel");
		characterList.add("Sara");
		characterList.add("Violet");
		int index = random.nextInt(characterList.size());
		System.out.println(characterList.get(index));
		
		
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
		
		return null;
	}
	
	
	public static void askQuestion()
	{
		GuessingGame gg = new GuessingGame();
		//gg.
	}

}
