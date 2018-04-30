package edu.yccc.cis174.mmuratake.finalproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ReadFromFile {
	
	/**
	 * GOAL: Match what's written in file to what the user has just said.
	 * 		Done.
	 * 
	 * GOAL 2: Calculate which name has the best matches.
	 * 		Done.
	 * @throws FileNotFoundException
	 * 
	 */
	
	private static Random random = new Random();
	
	AskUserQuestions auq = new AskUserQuestions();
	
	List<String> guesses = new ArrayList<String>();
	
	static Scanner console = new Scanner(System.in);
	
	User u2 = new User();

	
	public void likesGuess() throws FileNotFoundException
	{	
		Scanner fileScanner = null;
		
		fileScanner = new Scanner(new File("J:\\git\\Java-YCCC\\GuessingGame.txt"));
		
		
		// So something like this exists for every stat. Now they can be compared. 
		while(fileScanner.hasNextLine())
		{
			if(fileScanner.nextLine().equals("Likes: " + u2.getLikes()))
			{
				fileScanner.findWithinHorizon("Name: ", 6);
				String guessByLikes = fileScanner.nextLine();
				guesses.add(guessByLikes);
			}
			
		}
		fileScanner.close();
	}
	
	public void dislikesGuess() throws FileNotFoundException
	{	
		Scanner fileScanner = null;
		
		fileScanner = new Scanner(new File("J:\\git\\Java-YCCC\\GuessingGame.txt"));
		
		while(fileScanner.hasNextLine())
		{
			if(fileScanner.nextLine().equals("Dislikes: " + u2.getDislikes()))
			{
				fileScanner.findWithinHorizon("Name: ", 5);
				String guessByDislikes = fileScanner.nextLine();
				guesses.add(guessByDislikes);
			}
		}
		
		fileScanner.close();
	}
	
	public void hobbiesGuess() throws FileNotFoundException
	{	
		Scanner fileScanner = null;
		
		fileScanner = new Scanner(new File("J:\\git\\Java-YCCC\\GuessingGame.txt"));
		
		while(fileScanner.hasNextLine())
		{
			if(fileScanner.nextLine().equals("Hobby: " + u2.getHobbies()))
			{
				fileScanner.findWithinHorizon("Name: ", 4);
				String guessByHobby = fileScanner.nextLine();
				guesses.add(guessByHobby);
			}
		}
		
		fileScanner.close();
	}
	
	public void friendsGuess() throws FileNotFoundException
	{	
		Scanner fileScanner = null;
		
		fileScanner = new Scanner(new File("J:\\git\\Java-YCCC\\GuessingGame.txt"));
		
		while(fileScanner.hasNextLine())
		{
			if(fileScanner.nextLine().equals("Friend: " + u2.getFriends()))
			{
				fileScanner.findWithinHorizon("Name: ", 3);
				String guessByFriend = fileScanner.nextLine();
				guesses.add(guessByFriend);
			}
		}
		
		fileScanner.close();
	}
	
	public void familyGuess() throws FileNotFoundException
	{	
		Scanner fileScanner = null;
		
		fileScanner = new Scanner(new File("J:\\git\\Java-YCCC\\GuessingGame.txt"));
		
		while(fileScanner.hasNextLine())
		{
			if(fileScanner.nextLine().equals("Family: " + u2.getFamily()))
			{
				fileScanner.findWithinHorizon("Name: ", 2);
				String guessByFamily = fileScanner.nextLine();
				guesses.add(guessByFamily);
			}
		}
		
		fileScanner.close();
	}
	
	public void guessUser()
	{
		System.out.println("\r\nNow let me see if I can guess you.");
		console.next();
		
		try 
		{
			likesGuess();
			dislikesGuess();
			hobbiesGuess();
			friendsGuess();
			familyGuess();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		if(guesses.isEmpty()) 
		{
			System.out.println("I don't have any guesses... Can you tell me who you are?");
			auq.u.setName(console.next().toUpperCase());
		}
		else
		{
			// Because there are only five stats, and if all of them are equal, then that must be the person.
			int guess = random.nextInt(guesses.size());

			for (int x = 0; x < 6; x++) 
			{

				if (guesses.size() == 1) 
				{
					System.out.println("I guess you're " + guesses.get(guess) + ". Am I right?");
					break;
				}

				List<String> bestGuesses = new ArrayList<String>();

				if (guesses.size() > 1) 
				{
					for (int i = 0; i < guesses.size() - 1; i++) 
					{
						for (int k = i + 1; k < guesses.size(); k++) // Does this have to be less than or equal to guesses.size?
						{
							if (guesses.get(i) == guesses.get(k)) 
							{
								bestGuesses.add(guesses.get(i));
							}
							// break;
							// May be needed to break out of this for loop. I don't know if having two for loops is okay.
						}
					}
				}

				if (!bestGuesses.isEmpty()) 
				{
					guesses.clear();
					guesses.addAll(bestGuesses);
				}

				if (bestGuesses.isEmpty()) 
				{
					System.out.println("I guess you're " + guesses.get(guess) + ". Am I right?");
					break;
				}
			}
			
			
			boolean guessVerified = false;
			// Ask if the guess is correct. 
		//	while (guessVerified = false) 
		//	{
				if (console.next().equalsIgnoreCase("Yes")) 
				{
					System.out.println("Sweet! I got you.");
					auq.u.setName(guesses.get(guess).toUpperCase());
					guessVerified = true;
				}
				else if (console.next().equalsIgnoreCase("No")) 
				{
					System.out.println("Too bad... I'll get you next time.");
					System.out.println("Can you tell me who you are?");
					auq.u.setName(console.next().toUpperCase());
					guessVerified = true;
				} 
				else
				{
					System.out.println("What was that? Did I guess you correctly?");
				}
			//}
		}
		
	}

}
