package edu.yccc.cis174.finalProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GuessingGame {
	
	private static Random random = new Random();
	
	public static void play()
	{
		// 1. Choose a character (at random). Needs a list of characters, then chooses one randomly.
		List<String> characterList = new ArrayList<String>();
		characterList.add("Tobias");
		characterList.add("Radical");
		characterList.add("Fane");
		characterList.add("Prince");
		int index = random.nextInt(characterList.size());
		System.out.println(characterList.get(index));
		
		// 2. Determines the rest of the game by choosing the character for good.
		if(characterList.get(index).equals("Tobias"))
		{
			// Call whatever.
		}
		if(characterList.get(index).equals("Radical"))
		{
			
		}
		if(characterList.get(index).equals("Fane"))
		{
			
		}
		if(characterList.get(index).equals("Prince"))
		{
			
		}
	}
	
	public static void loadCharacters()
	{
		
	}

}
