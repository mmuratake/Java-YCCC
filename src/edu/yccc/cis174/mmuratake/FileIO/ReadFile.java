package edu.yccc.cis174.mmuratake.FileIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFile {
	
	// Reading from file.
	public void readFile()
	{
		try
		{
			Scanner inFile = new Scanner(new FileReader("data.txt."));
			
			while (inFile.hasNext())
			{
				System.out.println(inFile.next());
			}
			
			inFile.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	
	

}
