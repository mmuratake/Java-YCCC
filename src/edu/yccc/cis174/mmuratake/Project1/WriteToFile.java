package edu.yccc.cis174.mmuratake.Project1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	
	public void writeExamResults(String studentName, int score) throws IOException
	{
		FileWriter fStream = new FileWriter("ExamResults.txt", true);
		BufferedWriter writer = new BufferedWriter(fStream);
		writer.write(studentName + "\r\n");
		writer.write(score + "%");
		writer.write("\r\n---------------------------------------------------------\r\n");
		writer.close();
	}

}
