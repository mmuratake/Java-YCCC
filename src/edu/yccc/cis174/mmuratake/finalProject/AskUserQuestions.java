package edu.yccc.cis174.mmuratake.finalProject;

import java.util.Scanner;

public class AskUserQuestions {
	
	static Scanner console = new Scanner(System.in);
	
	static User u = new User();
	
	public static void askLikes()
	{
		System.out.println("What do you like?");
		String userLikes = console.next();
		u.setLikes(userLikes.toLowerCase());
		System.out.println("");
	}
	
	public static void askDislikes()
	{
		System.out.println("What do you dislike?");
		u.setDislikes(console.next().toLowerCase());
		System.out.println("");
	}
	
	public static void askHobbies()
	{
		System.out.println("What's one of your hobbies?");
		u.setHobbies(console.next().toLowerCase());	
		System.out.println("");
	}
	
	public static void askFriends()
	{
		System.out.println("What's the name of one of your friends?");
		u.setFriends(console.next().toLowerCase());
		System.out.println("");
	}
	
	public static void askFamily()
	{
		System.out.println("Do you have any siblings or pets?");
		u.setFamily(console.next().toLowerCase());
		System.out.println("");
	}

}
