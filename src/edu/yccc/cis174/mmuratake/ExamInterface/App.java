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
	
	public static void main(String[] args)
	{
		System.out.println("Hello! What is your name?");
		name = console.next();
		a.examChoices();
		a.score();
		System.out.println("You are now done with the test!");
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
			a.askJava();
		}
		else if(choice.equalsIgnoreCase("B"))
		{
			a.loadEnglishExam();
			a.askEnglish();
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
		List<Question> testQuestions = j.loadQuestion();
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
	}
	
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
	}
	
	// 4. Calculate score.
	
	public double score()
	{
		score = (correct / total) * 100;
		return score;
	}
	
	public void writeExamResults(String studentName, double score) throws IOException
	{
		FileWriter fStream = new FileWriter("ExamResults(Java).txt", true);
		BufferedWriter writer = new BufferedWriter(fStream);
		writer.write(studentName + " got a score of " + score + "%");
		writer.write("\r\n---------------------------------------------------------\r\n");
		writer.close();
	}

}
