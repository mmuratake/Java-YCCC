package edu.yccc.cis174.mmuratake.Project1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File {
	
	public static void writeFile() 
	{
        String fileName = "JavaTestQuestions.txt";

        try 
        {
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Hello there,");
            bufferedWriter.write(" here is some text.");
            bufferedWriter.newLine();
            bufferedWriter.write("We are writing");
            bufferedWriter.write(" the text to the file.");

            bufferedWriter.close();
        }
        catch(IOException ex) 
        {
            System.out.println("Error writing to file '" + fileName + "'");
        }
    }
	
	public static void readFile() 
	{
        String fileName = "JavaTestQuestions.txt";
        String line = null;

        try 
        {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) 
            {
            		System.out.println(line);
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
