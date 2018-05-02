package edu.yccc.cis174.mmuratake.finalproject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	
	public void writeUserStats(String userLikes, String userDislikes, String userHobby, String userFriend, String userFamily, String userName) throws IOException
	{
		FileWriter fStream = new FileWriter("GuessingGame.txt", true);
		BufferedWriter writer = new BufferedWriter(fStream);
		writer.write("Likes: " + userLikes + "\r\n");
		writer.write("Dislikes: " + userDislikes + "\r\n");
		writer.write("Hobby: " + userHobby + "\r\n");
		writer.write("Friend: " + userFriend + "\r\n");
		writer.write("Family: " + userFamily + "\r\n");
		writer.write("Name: " + userName);
		writer.write("\r\n---------------------------------------------------------\r\n");
		writer.close();
	}
	
	public void writeUserName(String userName) throws IOException
	{
		FileWriter fStream = new FileWriter("GuessingGame.txt", true);
		BufferedWriter writer = new BufferedWriter(fStream);
		writer.write("Name: " + userName);
		writer.write("\r\n---------------------------------------------------------\r\n");
		writer.close();
	}

}
