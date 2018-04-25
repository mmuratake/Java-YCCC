package edu.yccc.cis174.mmuratake.finalProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
	
	/**
	 * GOAL: Match what's written in file to what the user has just said.
	 * @throws FileNotFoundException 
	 * 
	 * 
	 * 
	 */
	
	public static void test() throws FileNotFoundException
	{
		Scanner fileScanner = null;
		
		fileScanner = new Scanner(new File("J:\\git\\Java-YCCC\\EnglishTestQuestions.txt"));
		
		while(fileScanner.hasNextLine())
		{
			if(fileScanner.nextLine().equals("likes: " + "userLikes"))
			{
				fileScanner.findWithinHorizon("Name: ", 7);
				System.out.println(fileScanner.nextLine());
			}
		}
		
		
		fileScanner.close();
	}

}
