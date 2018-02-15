package edu.yccc.cis174.mmuratake.FileIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	
	// Writing to file.
		public void writeFile()
		{
			// You write this because you're catching. Don't if you're throwing.
			BufferedWriter writer = null;
			try
			{
				FileWriter fstream = new FileWriter("out.txt", true);
				writer = new BufferedWriter(fstream);
				writer.write("Hello Java, ");
				writer.write("how have you been?");
				for(int i = 0; i < 10; i++)
				{
					writer.write(String.valueOf(i));
					writer.write(",");
				}
				writer.close();
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		
		// Use this for your project #1.
		public void writeExamResults(String studentName, String score) throws IOException
		{
			FileWriter fStream = new FileWriter("examResults.txt", true);
			BufferedWriter writer = new BufferedWriter(fStream);
			writer.write(studentName);
			writer.write(score);
			writer.close();
		}

}
