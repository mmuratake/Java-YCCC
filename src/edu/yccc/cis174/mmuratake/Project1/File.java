package edu.yccc.cis174.mmuratake.Project1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class File {
	
	public static void readFile() 
	{
        String fileName = "JavaTestQuestions.txt";
        try 
        {
        	JavaTest jv = new JavaTest();
        	//List<Questions> testQuestions = jv.loadQuestions();
        	
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            String line;
            
            Scanner fileScanner = new Scanner(fileName);
            
            while((line = bufferedReader.readLine()) != null)
            {
            		
            }
            
            bufferedReader.close();
            fileScanner.close();
        }
        catch(FileNotFoundException ex) 
        {
            System.out.println("Unable to open file '" + fileName + "'");
        }
        catch(IOException ex) 
        {
            System.out.println("Error reading file '" + fileName + "'");
        }
    }
	
	public static List<Questions> loadQuestions()
	{
		// Create a list of questions.
		List<Questions> questions = new ArrayList<Questions>();
		
		//Create ten questions.
		Questions q1 = new Questions("What is Java?", "B", "A. A type of coffee", "B. A programming language", "C. A musical instrument");
		Questions q2 = new Questions("How do you write a single-line comment in Java?", "//");
		Questions q3 = new Questions("How do you write a multi-line comment in Java?", "/**");
		Questions q4 = new Questions("What is it called when you combine two strings in a print statement using the plus sign?", "C",
				"A. Addition", "B. Two-String", "C. Concatenation");
		Questions q5 = new Questions("Should you capitalize package names?", "B", "A. Yes", "B. No", "C. Occasionally");
		Questions q6 = new Questions("Should you capitalize class names?", "A", "A. Yes", "B. No", "C. Occasionally");
		Questions q7 = new Questions("What is the symbol for the logical operator \"and\" in Java?", "&&");
		Questions q8 = new Questions("What is the symbol for the logical operator \"or\" in Java?", "||");
		Questions q9 = new Questions("Which one has more restrictions, Lists or Arrays?", "B", "A. Lists", "B. Arrays", "C. They're the same");
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

}
