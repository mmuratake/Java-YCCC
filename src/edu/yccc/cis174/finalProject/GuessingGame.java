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
	}
	
	public static void loadCharacters()
	{
		
	}

}
