package edu.yccc.cis174.mmuratake.finalproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Mami Muratake
 * May 2 2018
 * Final Project: Guessing Game
 * Guess the player based on past players' responses.
 * 
 * @throws FileNotFoundException
 * 
 */

public class ReadFromFile {
	
	private static Random random = new Random();
		
	List<String> guesses = new ArrayList<String>();
	
	static Scanner console = new Scanner(System.in);
	
	User u2 = new User();

	// Try to find someone recorded in the file who has the same likes as the current player.
	public void likesGuess() throws FileNotFoundException
	{	
		Scanner fileScanner = null;
		
		fileScanner = new Scanner(new File("J:\\git\\Java-YCCC\\GuessingGame.txt"));
				
		while(fileScanner.hasNextLine())
		{
			// If you find someone who does, add that person to a list of potential guesses.
			if(fileScanner.nextLine().equals("Likes: " + u2.getLikes()))
			{
				fileScanner.findWithinHorizon("Name: ", 0);
				String guessByLikes = fileScanner.nextLine();
				guesses.add(guessByLikes);
			}
		}
		fileScanner.close();
	}
	
	// Try to find someone recorded in the file who has the same dislikes as the current player.
	public void dislikesGuess() throws FileNotFoundException
	{	
		Scanner fileScanner = null;
		
		fileScanner = new Scanner(new File("J:\\git\\Java-YCCC\\GuessingGame.txt"));
		
		while(fileScanner.hasNextLine())
		{
			if(fileScanner.nextLine().equals("Dislikes: " + u2.getDislikes()))
			{
				fileScanner.findWithinHorizon("Name: ", 0);
				String guessByDislikes = fileScanner.nextLine();
				guesses.add(guessByDislikes);
			}
		}
		
		fileScanner.close();
	}
	
	// Try to find someone recorded in the file who has the same hobbies as the current player.
	public void hobbiesGuess() throws FileNotFoundException
	{	
		Scanner fileScanner = null;
		
		fileScanner = new Scanner(new File("J:\\git\\Java-YCCC\\GuessingGame.txt"));
		
		while(fileScanner.hasNextLine())
		{
			if(fileScanner.nextLine().equals("Hobby: " + u2.getHobbies()))
			{
				fileScanner.findWithinHorizon("Name: ", 0);
				String guessByHobby = fileScanner.nextLine();
				guesses.add(guessByHobby);
			}
		}
		
		fileScanner.close();
	}
	
	// Try to find someone recorded in the file who has the same friend as the current player.
	public void friendsGuess() throws FileNotFoundException
	{	
		Scanner fileScanner = null;
		
		fileScanner = new Scanner(new File("J:\\git\\Java-YCCC\\GuessingGame.txt"));
		
		while(fileScanner.hasNextLine())
		{
			if(fileScanner.nextLine().equals("Friend: " + u2.getFriends()))
			{
				fileScanner.findWithinHorizon("Name: ", 0);
				String guessByFriend = fileScanner.nextLine();
				guesses.add(guessByFriend);
			}
		}
		
		fileScanner.close();
	}
	
	// Try to find someone recorded in the file who has the same family as the current player.
	public void familyGuess() throws FileNotFoundException
	{	
		Scanner fileScanner = null;
		
		fileScanner = new Scanner(new File("J:\\git\\Java-YCCC\\GuessingGame.txt"));
		
		while(fileScanner.hasNextLine())
		{
			if(fileScanner.nextLine().equals("Family: " + u2.getFamily()))
			{
				fileScanner.findWithinHorizon("Name: ", 0);
				String guessByFamily = fileScanner.nextLine();
				guesses.add(guessByFamily);
			}
		}
		
		fileScanner.close();
	}
	
	// Try to guess who the player is.
	public void guessUser()
	{
		System.out.println("Now let me see if I can guess you.");
		console.next();
		
		// Read from the file and see if any player before had any matching answers to the current player.
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
		
		// If there are no matching answers from current player and previous players.
		if(guesses.isEmpty()) 
		{
			System.out.println("I don't have any guesses... Can you tell me who you are?");
			u2.setName(console.next().toUpperCase());
		}
		else
		{
			int guess = random.nextInt(guesses.size());

			// There are only five characteristics, so this only needs to loop five times.
			for (int x = 0; x < 6; x++) 
			{
				// If there was only one match, that person is the best guess.
				if (guesses.size() == 1) 
				{
					System.out.println("I guess you're " + guesses.get(guess) + ". Am I right?");
					break;
				}

				List<String> bestGuesses = new ArrayList<String>();

				// If there were more than one matches.
				if (guesses.size() > 1) 
				{
					// Take one of the guesses the character has...
					for (int i = 0; i < guesses.size() - 1; i++) 
					{
						// ...take another one...
						for (int k = i + 1; k < guesses.size(); k++) 
						{
							// ...and see if they're the same person. If they are, they're an even better guess.
							if (guesses.get(i) == guesses.get(k)) 
							{
								// Add that guess to a better guess list.
								bestGuesses.add(guesses.get(i));
							}
						}
					}
				}

				// If people were added to the better guess list, 
				// then put those people in the original list to repeat the process.
				if (!bestGuesses.isEmpty()) 
				{
					guesses.clear();
					guesses.addAll(bestGuesses);
				}

				// If the better guess list is empty, then you have more than one guess
				// but none of them are any better than the others. Just choose one of them.
				if (bestGuesses.isEmpty()) 
				{
					System.out.println("I guess you're " + guesses.get(guess) + ". Am I right?");
					break;
				}
			}
			
			// Ask if the guess is correct. 
			for (int x = 0; x < 100; x++) 
			{
				String correct = console.next();
				if (correct.equalsIgnoreCase("Yes")) 
				{
					System.out.println("Sweet! I got you.\r\n");
					u2.setName(guesses.get(guess).toUpperCase());
					break;
				}
				else if (correct.equalsIgnoreCase("no")) 
				{
					System.out.println("Too bad... I'll get you next time.");
					System.out.println("Can you tell me who you are?");
					u2.setName(console.next().toUpperCase());
					break;
				} 
				else
				{
					System.out.println("What was that? Did I guess you correctly or not?");
				}
			}
		}
	}

}
