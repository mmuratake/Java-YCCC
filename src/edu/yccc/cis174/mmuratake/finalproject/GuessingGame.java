package edu.yccc.cis174.mmuratake.finalproject;

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
		//characterList.add("Sara");
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
	
	public static List<String> loadQuestions()
	{
		List<String> questions = new ArrayList<String>();
		questions.add("What do you like?");
		questions.add("What do you dislike?");
		questions.add("What are your hobbies?");
		questions.add("Who are you friends with?");
		questions.add("Who are your family members?");
		
		
		
		return questions;
	}
	
	// Forget all this for now: focus on being able to read from file.
	public static void askQuestion()
	{
		List<String> questions = GuessingGame.loadQuestions();
		while(!questions.isEmpty())
		{
			int index = random.nextInt(questions.size());
			System.out.println(questions.get(index));
			if(questions.get(index).equals("What do you like?"))
			{
				System.out.println("Likes question.");
			}
			if(questions.get(index).equals("What do you dislike?"))
			{
				System.out.println("Dislikes question.");
			}
			if(questions.get(index).equals("What are your hobbies?"))
			{
				System.out.println("Hobbies question.");
			}
			if(questions.get(index).equals("Who are you friends with?"))
			{
				System.out.println("Friends question.");
			}
			if(questions.get(index).equals("Who are your family members?"))
			{
				System.out.println("Family question.");
			}
			questions.remove(questions.get(index));
		}
		
	}
	
	public static void rules()
	{
		System.out.println("Have you played this game before?");
		System.out.println("1.Yes    2.No");
		
		String played = console.next();
		
		if(played.equals("1"))
		{
			System.out.println("Good luck. Press any key to continue.");
			console.next();
			System.out.println("");
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
