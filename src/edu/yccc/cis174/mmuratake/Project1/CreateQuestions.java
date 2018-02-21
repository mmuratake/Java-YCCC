package edu.yccc.cis174.mmuratake.Project1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateQuestions {
	
	public static List<Questions> loadQuestions()
	{
		List<Questions> questions = new ArrayList<Questions>();
		
		String fileName = "JavaTestQuestions";
		String fileName2 = "JavaTestAnswers";
		
		Scanner fileScanner = new Scanner(fileName);
		Scanner fileScanner2 = new Scanner(fileName2);
		
		while(fileScanner.hasNextLine() && fileScanner2.hasNextLine()) 
		{
			String question = fileScanner.nextLine();
			String answer = fileScanner.nextLine();
			Questions q = new Questions(question, answer);
			questions.add(q);
		}
		
		fileScanner.close();
		fileScanner2.close();
		
		return questions;
	}
}
