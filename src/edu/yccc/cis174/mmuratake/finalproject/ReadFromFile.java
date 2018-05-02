package edu.yccc.cis174.mmuratake.finalproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ReadFromFile {
	
	/**
	 * 
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
				
		while(fileScanner.hasNextLine())
		{
			if(fileScanner.nextLine().equals("Likes: " + u2.getLikes()))
			{
				fileScanner.findWithinHorizon("Name: ", 0);
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
				fileScanner.findWithinHorizon("Name: ", 0);
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
				fileScanner.findWithinHorizon("Name: ", 0);
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
				fileScanner.findWithinHorizon("Name: ", 0);
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
				fileScanner.findWithinHorizon("Name: ", 0);
				String guessByFamily = fileScanner.nextLine();
				guesses.add(guessByFamily);
			}
		}
		
		fileScanner.close();
	}
	
	public void guessUser()
	{
		System.out.println("Now let me see if I can guess you.");
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
		
		// If there are no matches of what the user has said to what has been recorded.
		if(guesses.isEmpty()) 
		{
			System.out.println("I don't have any guesses... Can you tell me who you are?");
			auq.u.setName(console.next().toUpperCase());
		}
		else
		{
			int guess = random.nextInt(guesses.size());

			// There are only five characteristics, so this only needs to loop five times.
			for (int x = 0; x < 6; x++) 
			{
				// If there was only one match.
				if (guesses.size() == 1) 
				{
					System.out.println("I guess you're " + guesses.get(guess) + ". Am I right?");
					break;
				}

				List<String> bestGuesses = new ArrayList<String>();

				// If there were more than one matches.
				if (guesses.size() > 1) 
				{
					for (int i = 0; i < guesses.size() - 1; i++) 
					{
						for (int k = i + 1; k < guesses.size(); k++) 
						{
							if (guesses.get(i) == guesses.get(k)) 
							{
								bestGuesses.add(guesses.get(i));
							}
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
			
			
			// Ask if the guess is correct. 
			for (int x = 0; x < 100; x++) 
			{
				String correct = console.next();
				if (correct.equalsIgnoreCase("Yes")) 
				{
					System.out.println("Sweet! I got you.\r\n");
					auq.u.setName(guesses.get(guess).toUpperCase());
					break;
				}
				else if (correct.equalsIgnoreCase("no")) 
				{
					System.out.println("Too bad... I'll get you next time.");
					System.out.println("Can you tell me who you are?");
					auq.u.setName(console.next().toUpperCase());
					break;
				} 
				else
				{
					System.out.println("What was that? Did I guess you correctly or not?");
				}
			}
		}
	}
	
	public void writeName()
	{
		WriteToFile wtf = new WriteToFile();
		try 
		{
			wtf.writeUserName(auq.u.getName());
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}
