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
	
	// Stores the value of score from either EnglishExam or JavaExam, depending on which test the user took.
	// (Because the score is calculated over there.)
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
		//a.receiveScore();
		System.out.println("\r\nYou are now done with the test!");
		System.out.println(name + ", your score is " + score2 + "%.");
	}
	
	
	// 1. Load my exams.
	

	
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
	
	// 3. Give Exam
	//		a. Ask questions.
	//		b. Collect responses.
	
	
	
	// Get the score to be able to present it to .
	public void receiveScore()
	{
		if(chooseTest.equalsIgnoreCase("A"))
		{
			score2 = j.calculateScore();
		}
		else if(chooseTest.equalsIgnoreCase("B"))
		{
			score2 = e.calculateScore();
		}
	}

}
