package edu.yccc.cis174.mmuratake.ExamInterface;

import java.util.List;
import java.util.Scanner;

public class EnglishExam implements Exam{
	
	EnglishExam e = new EnglishExam();
	
	static Scanner console = new Scanner(System.in);
	
	static double total = 0.0;
	static double correct = 0.0;
	static double score = 0.0;


	public List<Question> loadQuestion() 
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public void giveExam()
	{
		List<Question> testQuestions = e.loadQuestion();
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
		
		e.calculateScore();
	}


	public double calculateScore() 
	{
		score = (correct / total) * 100;
		return score;
	}
	
	

}
