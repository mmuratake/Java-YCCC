package edu.yccc.cis174.mmuratake.Project1;

/**
 * Mami Muratake
 * February 14 2018
 * Project #1: Java Test
 * 
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaTest {
	
	public List<Questions> loadQuestions()
	{
		// Create a list of questions.
		List<Questions> questions = new ArrayList<Questions>();
		
		//Create ten questions.
		Questions q1 = new Questions("What is Java?", "B", "A. A type of coffee", "B. A programming language", "C. A musical instrument");
		Questions q2 = new Questions("How do you write a single-line comment in Java?", "//");
		Questions q3 = new Questions("How do you write a multi-line comment in Java?", "/**");
		Questions q4 = new Questions("What is it called when you combine two strings in a print statement using the plus sign?", "C",
				"A. Addition", "B. Two-String", "C. Concatentaion");
		Questions q5 = new Questions("Should you capitalize package names?", "B", "A. Yes", "B. No", "C. Occasionally");
		Questions q6 = new Questions("Should you capitalize class names?", "A", "A. Yes", "B. No", "C. Occasionally");
		Questions q7 = new Questions("What is the symbol for the logical operator \"and\" in Java?", "&&");
		Questions q8 = new Questions("What is the symbol for the logical operator \"or\" in Java?", "||");
		Questions q9 = new Questions("Which one has more restrictions, Lists or Arrays?", "A", "A. Lists", "B. Arrays", "C. They're the same");
		Questions q10 = new Questions("How often is it recommended you save your work?", "B", "A. Every five seconds", 
				"B. Early and often", "C. Only when you're done");
		
		//Add the questions to the list.
		questions.add(q1);
		questions.add(q2);
		questions.add(q3);
		questions.add(q4);
		questions.add(q5);
		questions.add(q6);
		questions.add(q7);
		questions.add(q8);
		questions.add(q9);
		questions.add(q10);
		
		return questions;
	}
	
	
	public static void main(String[] args)
	{
		JavaTest jv = new JavaTest();
		List<Questions> testQuestions = jv.loadQuestions();
		
		//Tell the user what the test is like, just to make it easier for them.
		System.out.println("\r\nHello! You are now taking a Java Test. Please answer as best you can. There are 10 questions.");
		System.out.println("\r\nRules: \r\n   On multiple choice questions, please enter the letter of the option you think is correct.");
		System.out.println("   For questions with no choices, please write out the code directly.");
		System.out.println("\r\nGood luck! \r\n ");
		
		
		//In order to calculate their grade at the end.
		int grade = 0;
		
		for(Questions questions2 : testQuestions)
		{
			Scanner console = new Scanner(System.in);
			
			// If the question is multiple choice.
			if(questions2.getChoiceA() != null)
			{
				System.out.println(questions2);
				questions2.setUserAnswer(console.next());
				
				// If the letter they answered is the same as the letter specified to be the answer, they got it right.
				if(questions2.getUserAnswer().toUpperCase().equals(questions2.getAnswer()))
				{
					// Add 10 points to their grade.
					grade +=10;
					System.out.println("You got it right! Congratulations.");
				}
				else
				{
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
					grade +=10;
					System.out.println("You got it right! Congratulations.");
				}
				else
				{
					System.out.println("That is incorrect!");
				}
			}
			
		}
		
		// Let the user know the test is done, and print their grade to the console.
		System.out.println("\r\nYou are now done with the test!");
		System.out.println("Your grade is " + grade + "%.");
		
	}
	
}
