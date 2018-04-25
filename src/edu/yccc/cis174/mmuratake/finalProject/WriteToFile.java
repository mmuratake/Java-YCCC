package edu.yccc.cis174.mmuratake.finalProject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	
	public void writeUserStats(String userLikes, String userDislikes, String userHobby, String userFriend, String userFamily, String userName) throws IOException
	{
		FileWriter fStream = new FileWriter("GuessingGame.txt", true);
		BufferedWriter writer = new BufferedWriter(fStream);
		writer.write(userLikes);
		writer.write(userDislikes);
		writer.write(userHobby);
		writer.write(userFriend);
		writer.write(userFamily);
		// Remember to make the name upper case.
		writer.write(userName);
		writer.write("\r\n---------------------------------------------------------\r\n");
		writer.close();
	}

}
