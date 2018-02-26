package edu.yccc.cis174.mmuratake.ExamInterface;

import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author sMamiMuratake
 * 
 * This is the harness. Do stuff with it here.
 *
 */

public class App {
	
	App a = new App();
	EnglishExam e = new EnglishExam();
	JavaExam j = new JavaExam();
	
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
	}
	
	
	// 1. Load my exams.
	
	public void loadJavaExam()
	{
		j.loadQuestion();
	}
	
	public void loadEnglishExam()
	{
		e.loadQuestion();
	}
	
	// 2. Offer the available exam choices.
	
	public void examChoices()
	{
		System.out.println("Which exam do you want to take?");
		System.out.println("A. Java Exam       B. English Exam");
		String choice;
		choice = console.next();
		if(choice.equalsIgnoreCase("A"))
		{
			a.loadJavaExam();
		}
		else if(choice.equalsIgnoreCase("B"))
		{
			a.loadEnglishExam();
		}
		else
		{
			System.out.println("Please enter either A or B.");
			a.examChoices();
		}
	}
	
	// 3. Give Exam
	//		a. Ask questions.
	//		b. Collect responses.
	
	public void askJava()
	{
		List<Question> questions = j.loadQuestion();
	}
	
	public void askEnglish()
	{
		
	}
	
	// 4. Calculate score.

}
