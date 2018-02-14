package edu.yccc.cis174.mmuratake.Project1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class File {
	
	public static void readFile() 
	{
        String fileName = "JavaTestQuestions.txt";
        try 
        {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((bufferedReader.readLine()) != null) 
            {
            	JavaTest jv = new JavaTest();
            	List<Questions> testQuestions = jv.loadQuestions();
            		
            	for(Questions questions2 : testQuestions)
            	{
            		if(!fileName.contains(questions2.getQuestion()))
            		{
            			//?????????
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
