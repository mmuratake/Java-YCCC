package edu.yccc.cis174.mmuratake.Project1;

/**
 * Mami Muratake
 * February 14 2018
 * Project #1: Java Test
 * 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateQuestions {
	
	public static List<Questions> loadQuestions()
	{
		// Create a list of questions.
		List<Questions> questions = new ArrayList<Questions>();
		
		Scanner fileScanner = null;
		Scanner fileScanner2 = null;
		Scanner fileScanner3 = null;
		
		try
		{
			// Read from three files: the file with the test questions, the test answers, and the choices (if any).
			fileScanner = new Scanner(new File("J:\\git\\Java-YCCC\\JavaTestQuestions.txt"));
			fileScanner2 = new Scanner(new File("J:\\git\\Java-YCCC\\JavaTestAnswers.txt"));
			fileScanner3 = new Scanner(new File("J:\\git\\Java-YCCC\\JavaTestChoices.txt"));
		
			while(fileScanner.hasNextLine() && fileScanner2.hasNextLine())   
			{
				// Convert what is read in the questions file to a string question.
				String question = fileScanner.nextLine();
				// Convert what is read in the answer file to a string answer.
				String answer = fileScanner2.nextLine();
				// Convert what is read in the choices file to a string choices.
				String choices = fileScanner3.nextLine();
				
				// If the question is not multiple choice, then it only has a question and an answer.
				if(choices.equals(null))
				{
					Questions q = new Questions(question, answer);
					questions.add(q);
				}
				// Otherwise, the question is multiple choice and has a question, an answer, and choices.
				else
				{
					Questions q = new Questions(question, answer, choices);
					questions.add(q);
				}
			}
		}
		catch(FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			fileScanner.close();
			fileScanner2.close();
			fileScanner3.close();
		}
		
		return questions;
	}
}
