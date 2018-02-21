package edu.yccc.cis174.mmuratake.Project1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateQuestions {
	
	public static List<Questions> loadQuestions()
	{
		List<Questions> questions = new ArrayList<Questions>();
		
		Scanner fileScanner = null;
		Scanner fileScanner2 = null;
		
		try
		{
			fileScanner = new Scanner(new File("J:\\git\\Java-YCCC\\JavaTestQuestions.txt"));
			fileScanner2 = new Scanner(new File("J:\\git\\Java-YCCC\\JavaTestAnswers.txt"));
		
			while (fileScanner.hasNextLine() && fileScanner2.hasNextLine())   
			{
				String question = fileScanner.nextLine();
				String answer = fileScanner2.nextLine();
				Questions q = new Questions(question, answer);
				questions.add(q);
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
		}
		
		return questions;
	}
}
