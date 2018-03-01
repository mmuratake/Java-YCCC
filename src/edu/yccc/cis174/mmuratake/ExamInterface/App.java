package edu.yccc.cis174.mmuratake.ExamInterface;

import java.util.Scanner;

/**
 * 
 * @author sMamiMuratake
 * February 28 2018
 *  
 *  Project #2: Expanding on Project #1 and Using Interface
 */

public class App {
	
	static App a = new App();
	EnglishExam e = new EnglishExam();
	JavaExam j = new JavaExam();
	
	static Scanner console = new Scanner(System.in);
	
	// Stores the value of score from the test the user took. (Because the score is calculated over there.)
	static double score2;
	// To store the user's name.
	static String name;
	// To store which test the user chose to take.
	String chooseTest;
	
	public static void main(String[] args)
	{
		System.out.println("Hello! What is your name?");
		name = console.next();
		a.examChoices();
		System.out.println("\r\nYou are now done with the test!");
		System.out.println(name + ", your score is " + score2 + "%.");
	}
	
	
	// Offer the available exam choices.
	public void examChoices()
	{
		System.out.println("\r\nWhich exam do you want to take?");
		System.out.println("A. Java Exam       B. English Exam");
		chooseTest = console.next();
		// Load the exam they choose.
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

}
