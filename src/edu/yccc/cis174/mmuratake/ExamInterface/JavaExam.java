package edu.yccc.cis174.mmuratake.ExamInterface;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class JavaExam implements Exam {
	
	public List<Question> loadQuestion() 
	{
		// Create a list of questions.
		List<Question> question = new ArrayList<Question>();
				
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
				String testQuestion = fileScanner.nextLine();
				// Convert what is read in the answer file to a string answer.
				String answer = fileScanner2.nextLine();
				// Convert what is read in the choices file to a string choices.
				String choices = fileScanner3.nextLine();
						
				// If the question is not multiple choice, then it only has a question and an answer.
				if(choices.equals(null))
				{
					Question q = new Question(testQuestion, answer);
					question.add(q);
				}
				// Otherwise, the question is multiple choice and has a question, an answer, and choices.
				else
				{
					Question q = new Question(testQuestion, answer, choices);
					question.add(q);
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
				
		return question;
	}

	public double calculateScore() 
	{
		App.score = (App.correct / App.total) * 100;
		return App.score;
	}

}
