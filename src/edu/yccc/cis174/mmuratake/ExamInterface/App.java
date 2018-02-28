package edu.yccc.cis174.mmuratake.ExamInterface;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
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
	
	static App a = new App();
	EnglishExam e = new EnglishExam();
	JavaExam j = new JavaExam();
	
	static Scanner console = new Scanner(System.in);
	
	static double total = 0.0;
	static double correct = 0.0;
	static double score = 0.0;
	static String name;
	String chooseTest;
	
	public static void main(String[] args)
	{
		System.out.println("Hello! What is your name?");
		name = console.next();
		a.examChoices();
		System.out.println("\r\nYou are now done with the test!");
		System.out.println(name + ", your score is " + score + "%.");
		try 
		{
			a.writeExamResults(name, score);
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	
	// 1. Load my exams.
	

	
	// 2. Offer the available exam choices.
	
	public void examChoices()
	{
		System.out.println("Which exam do you want to take?");
		System.out.println("A. Java Exam       B. English Exam");
		chooseTest = console.next();
		if(chooseTest.equalsIgnoreCase("A"))
		{
			j.loadQuestion();
			j.giveExam();
		}
		else if(chooseTest.equalsIgnoreCase("B"))
		{
			e.loadQuestion();
			e.giveExam();
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
	
	
	
	public void askEnglish()
	{
		List<Question> testQuestions = e.loadQuestion();
		for(Question questions : testQuestions)
		{
			System.out.println(questions.getQuestion());
			questions.setUserAnswer(console.next());
			if(questions.getUserAnswer().equals(questions.getAnswer()))
			{
				System.out.println("That's correct!");
				correct += 1.0;
			}
			else
			{
				System.out.println("That is incorrect.");
			}
			
			total += 1.0;
		}
		e.calculateScore();
	}
	
	// 4. Calculate score.
	
	
	public void writeExamResults(String studentName, double score) throws IOException
	{
		FileWriter fStream = new FileWriter("InterfaceExamResults.txt", true);
		BufferedWriter writer = new BufferedWriter(fStream);
		if(chooseTest.equalsIgnoreCase("A"))
		{
			writer.write("Java Exam \r\n");
		}
		else if(chooseTest.equalsIgnoreCase("B"))
		{
			writer.write("English Exam \r\n");
		}
		writer.write(studentName + " got a score of " + score + "%");
		writer.write("\r\n---------------------------------------------------------\r\n");
		writer.close();
	}

}
