package edu.yccc.cis174.mmuratake.ExamInterface;

/**
 *  Mami Muratake
 *  February 28 2018
 *  
 *  Project #2: Expanding on Project #1 and Using Interface
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class JavaExam implements Exam {
	
	static Scanner console = new Scanner(System.in);
	
	// The total number of questions.
	static double total = 0.0;
	// The number of questions the user got right.
	static double correct = 0.0;
	// The score the user got for the test.
	static double score = 0.0;
	
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
	
	public void giveExam()
	{
		JavaExam j = new JavaExam();
		List<Question> testQuestions = j.loadQuestion();
		for(Question questions : testQuestions)
		{
			// If the question is multiple choice.
			if (questions.getChoices() != null) 
			{
				System.out.println(questions);
				questions.setUserAnswer(console.next());

				// If the letter they answered is the same as the letter specified to be the answer, they got it right.
				if (questions.getUserAnswer().equalsIgnoreCase(questions.getAnswer())) 
				{
					correct += 1.0;
					System.out.println("That's correct!");
				} 
				else 
				{
					System.out.println("That is incorrect.");
				}
			}
			// If the question is not multiple choice.
			else 
			{
				System.out.println("\r\n" + questions.getQuestion());
				questions.setUserAnswer(console.next());
				if (questions.getUserAnswer().equals(questions.getAnswer())) 
				{
					correct += 1.0;
					System.out.println("That's correct!");
				}
				else 
				{
					System.out.println("That is incorrect.");
				}
			}
			
			total += 1.0;
		}
		
		calculateScore();
		
		try 
		{
			writeExamResults(App.name, score);
		} 
		catch (IOException e1)
		{
			e1.printStackTrace();
		}
	}

	// Calculate the score.
	public double calculateScore() 
	{
		score = (correct / total) * 100;
		App.score2 = score;
		return score;
	}
	
	// Write the user's name and the score to a file.
	public void writeExamResults(String studentName, double score) throws IOException
	{
		FileWriter fStream = new FileWriter("JavaExamResults.txt", true);
		BufferedWriter writer = new BufferedWriter(fStream);
		writer.write(studentName + " got a score of " + score + "%");
		writer.write("\r\n---------------------------------------------------------\r\n");
		writer.close();
	}

}
