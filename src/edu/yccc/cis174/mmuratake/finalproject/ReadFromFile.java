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

	
	public void readFromFile() throws FileNotFoundException
	{	
		Scanner fileScanner = null;
		
		fileScanner = new Scanner(new File("J:\\git\\Java-YCCC\\GuessingGame.txt"));
		
		
		// So something like this exists for every stat. Now they can be compared. 
		while(fileScanner.hasNextLine())
		{
			if(fileScanner.nextLine().equals("Likes: " + auq.u.getLikes()))
			{
				fileScanner.findWithinHorizon("Name: ", 7);
				String guessByLikes = fileScanner.nextLine();
				System.out.println(guessByLikes);
				guesses.add(guessByLikes);
			}
			if(fileScanner.nextLine().equals("Dislikes: " + auq.u.getDislikes()))
			{
				fileScanner.findWithinHorizon("Name: ", 6);
				String guessByDislikes = fileScanner.nextLine();
				System.out.println(guessByDislikes);
				guesses.add(guessByDislikes);
			}
			if(fileScanner.nextLine().equals("Hobby: " + auq.u.getHobbies()))
			{
				fileScanner.findWithinHorizon("Name: ", 5);
				String guessByHobby = fileScanner.nextLine();
				System.out.println(guessByHobby);
				guesses.add(guessByHobby);
			}
			if(fileScanner.nextLine().equals("Friend: " + auq.u.getFriends()))
			{
				fileScanner.findWithinHorizon("Name: ", 3);
				String guessByFriend = fileScanner.nextLine();
				System.out.println(guessByFriend);
				guesses.add(guessByFriend);
			}
			if(fileScanner.nextLine().equals("Family: " + auq.u.getFamily()))
			{
				fileScanner.findWithinHorizon("Name: ", 2);
				String guessByFamily = fileScanner.nextLine();
				System.out.println(guessByFamily);
				guesses.add(guessByFamily);
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
			
		}
		
		fileScanner.close();
	}
	
	public void HobbiesGuess() throws FileNotFoundException
	{	
		Scanner fileScanner = null;
		
		fileScanner = new Scanner(new File("J:\\git\\Java-YCCC\\GuessingGame.txt"));
		
		while(fileScanner.hasNextLine())
		{
			
		}
		
		fileScanner.close();
	}
	
	public void friendsGuess() throws FileNotFoundException
	{	
		Scanner fileScanner = null;
		
		fileScanner = new Scanner(new File("J:\\git\\Java-YCCC\\GuessingGame.txt"));
		
		while(fileScanner.hasNextLine())
		{
			
		}
		
		fileScanner.close();
	}
	
	public void familyGuess() throws FileNotFoundException
	{	
		Scanner fileScanner = null;
		
		fileScanner = new Scanner(new File("J:\\git\\Java-YCCC\\GuessingGame.txt"));
		
		while(fileScanner.hasNextLine())
		{
			
		}
		
		fileScanner.close();
	}
	
	public void guessUser()
	{
		System.out.println("Now let me see if I can guess you.");
		
		try 
		{
			readFromFile();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}

		boolean guessedAlready = false;
		
		if(guesses.isEmpty()) 
		{
			System.out.println("I don't have any guesses... Can you tell me who you are?");
		}
		// Because there are only five stats, and if all of them are equal, then that must be the person.
		for (int x = 0; x < 6; x++) 
		{
			List<String> bestGuesses = new ArrayList<String>();

			if (guesses.size() == 1) 
			{
				System.out.println("I guess you're " + guesses.get(0) + ".");
				guessedAlready = true;
				break;
			}
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
			
			if(!bestGuesses.isEmpty())
			{
				guesses.clear();
				guesses.addAll(bestGuesses);
			}
			
			if(bestGuesses.isEmpty())
			{
				break;
			}
		}
		
		if(guessedAlready == false)
		{
			int guess = random.nextInt(guesses.size());
			System.out.println("I guess you're " + guesses.get(guess) + ".");
		}
	}

}
