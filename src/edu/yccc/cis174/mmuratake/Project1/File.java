package edu.yccc.cis174.mmuratake.Project1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class File {
	
	public static void writeFile()
		throws IOException 
	{
		BufferedWriter writer = new BufferedWriter(new FileWriter("JavaTextQuestions.txt"));
		writer.write("Something");
		writer.write("Wait just a minute");
		writer.close();
	}
	
	public static void readFile() 
	{
        String fileName = "JavaTestQuestions.txt";
        try 
        {
        	JavaTest jv = new JavaTest();
        	List<Questions> testQuestions = jv.loadQuestions();
        	
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            Scanner fileScanner = new Scanner(fileName);
            
            while(fileScanner.hasNextLine())
            {
            	for(Questions questions2 : testQuestions)
            	{
            		if(!fileName.contains(questions2.getQuestion()))
            		{
            			testQuestions.remove(questions2);
            		}
            		
            	}
            }
            
            bufferedReader.close();
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

}
