package edu.yccc.cis174.mmuratake.Project1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class File {
	
	public static void readFile() 
	{
        String fileName = "JavaTestQuestions.txt";
        try 
        {
        	JavaTest jv = new JavaTest();
        	List<Questions> testQuestions = jv.loadQuestions();
        	
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

}
