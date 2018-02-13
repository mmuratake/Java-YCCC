package edu.yccc.cis174.mmuratake.Project1;

/**
 * Mami Muratake
 * February 14 2018
 * Project #1: Java Test
 * 
 */

import java.util.ArrayList;
import java.util.List;

public class JavaTest {
	
	public List<Questions> loadQuestions()
	{
		List<Questions> questions = new ArrayList<Questions>();
		
		Questions q1 = new Questions("What is Java?", "B", "A. A type of coffee", "B. A programming language", "C. A musical instrument");
		Questions q2 = new Questions("How do you write a single-line comment in Java?", "//");
		Questions q3 = new Questions("How do you write a multi-line comment in Java?", "/**");
		Questions q4 = new Questions("What does \r\n do in a print statement?", "C", "A. Writes the letters r and n", 
				"B. Adds two spaces", "C. Prints to the next line");
		Questions q5 = new Questions("Should you capitalize package names?", "B", "A. Yes", "B. No", "C. Occasionally");
		Questions q6 = new Questions("Should you capitalize class names?", "A", "A. Yes", "B. No", "C. Occasionally");
		Questions q7 = new Questions("What is the symbol for the logical operator \"and\" in Java?", "&&");
		Questions q8 = new Questions("What is the symbol for the logical operator \"or\" in Java?", "||");
		Questions q9 = new Questions("Which one has more restrictions, Lists or Arrays?", "A", "A. Lists", "B. Arrays", "C. They're the same");
		Questions q10 = new Questions("How often is it recommended you save your work?", "B", "A. Every five seconds", 
				"B. Early and often", "C. Only when you're done");
		
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
		
		System.out.println("Hello! You are now taking a Java Test. Please answer as best you can. There are 10 questions.");
		System.out.println("On multiple choice questions, please enter the letter of the option you think is correct.");
		System.out.println("For questions with no choices, please write out the code directly.");
		System.out.println("Good luck! \r\n ");
		
		for(Questions questions2 : testQuestions)
		{
			if(questions2.getChoiceA() != null)
			{
				System.out.println(questions2);
			}
			else
			{
				System.out.println(questions2.getQuestion());
			}
			
		}
		
		
	}
	
}
