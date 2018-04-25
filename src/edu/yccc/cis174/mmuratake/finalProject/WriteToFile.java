package edu.yccc.cis174.mmuratake.finalProject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	
	public void writeUserStats(String userLikes, String userDislikes, String userHobby, String userFriend, String userFamily, String userName) throws IOException
	{
		FileWriter fStream = new FileWriter("GuessingGame.txt", true);
		BufferedWriter writer = new BufferedWriter(fStream);
		writer.write(userLikes + "\r\n");
		writer.write(userDislikes + "\r\n");
		writer.write(userHobby + "\r\n");
		writer.write(userFriend + "\r\n");
		writer.write(userFamily + "\r\n");
		writer.write(userName);
		writer.write("\r\n---------------------------------------------------------\r\n");
		writer.close();
	}

}
