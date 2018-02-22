package edu.yccc.cis174.mmuratake.Project1;

import java.io.IOException;

/**
 * Mami Muratake
 * February 14 2018
 * Project #1: Java Test
 * 
 */

import java.util.List;
import java.util.Scanner;

public class JavaTest {
	
	static Scanner console = new Scanner(System.in);
	
	static double total = 0;
	static double correct = 0;
	
	public static void main(String[] args)
	{
		Student s = new Student();
		// Load the list of questions.
		List<Questions> testQuestions = CreateQuestions.loadQuestions();
		
		// Ask the student for their name to write to file.
		System.out.println("What is your name?");
		s.setName(console.next());
		
		//Tell the user what the test is like, just to make it easier for them.
		System.out.println("\r\nHello, " + s.getName() + "! You are now taking a Java Test. Please answer as best you can. There are 10 questions.");
		System.out.println("\r\nRules: \r\n   On multiple choice questions, please enter the letter of the option you think is correct.");
		System.out.println("   For questions with no choices, please write out the code directly.");
		System.out.println("\r\nGood luck! \r\n ");
		
				
		for(Questions questions2 : testQuestions)
		{
			// If the question is multiple choice.
			if(questions2.getChoices() != null)
			{
				System.out.println(questions2);
				questions2.setUserAnswer(console.next());
				
				// If the letter they answered is the same as the letter specified to be the answer, they got it right.
				if(questions2.getUserAnswer().equalsIgnoreCase(questions2.getAnswer()))
				{
					questions2.setCorrect(true);
					System.out.println("You got it right! Congratulations.");
				}
				else
				{
					questions2.setCorrect(false);
					System.out.println("That is incorrect!");
				}
			}
			// If the question is not multiple choice.
			else
			{
				System.out.println("\r\n" + questions2.getQuestion());
				questions2.setUserAnswer(console.next());
				if(questions2.getUserAnswer().equals(questions2.getAnswer()))
				{
					questions2.setCorrect(true);
					System.out.println("You got it right! Congratulations.");
				}
				else
				{
					questions2.setCorrect(false);
					System.out.println("That is incorrect!");
				}
			}
			total += 1;
		}
			
		// Calculates the grade.
		for(Questions questions2 : testQuestions)
		{
			if(questions2.getCorrect().equals(true))
			{
				correct +=1;
				// This only calculates a grade out of 100 at the current moment.
				s.setGrade(s.getGrade() + 10); 
			}
		}
		
		double score = correct / total * 100;
		System.out.println(correct);
		System.out.println(total);
		
		// Write the grade and the student's name to a file.
		try 
		{
			WriteToFile wf = new WriteToFile();
			wf.writeExamResults(s.getName(), s.getGrade());
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		// Let the user know the test is done, and print their grade to the console.
		System.out.println("\r\nYou are now done with the test!");
		System.out.println("Your grade is " + s.getGrade() + "%.");
		System.out.println("Your grade is " + score + "%.");
		
	}
	
	
}
