package edu.yccc.cis174.mmuratake.finalProject;

import java.util.Scanner;

public class AskUserQuestions {
	
	static Scanner console = new Scanner(System.in);
	
	User u = new User();
	
	public void askLikes()
	{
		System.out.println("What do you like?");
		u.setLikes(console.nextLine().toLowerCase());
		System.out.println(u.getLikes() + "");
	}
	
	public void askDislikes()
	{
		System.out.println("What do you dislike?");
		u.setDislikes(console.nextLine().toLowerCase());
		System.out.println(u.getDislikes());
		System.out.println("");
	}
	
	public void askHobbies()
	{
		System.out.println("What's one of your hobbies?");
		u.setHobbies(console.nextLine().toLowerCase());	
		System.out.println(u.getHobbies());
		System.out.println("");
	}
	
	public void askFriends()
	{
		System.out.println("What's the name of one of your friends?");
		u.setFriends(console.nextLine().toLowerCase());
		System.out.println(u.getFriends());
		System.out.println("");
	}
	
	public void askFamily()
	{
		System.out.println("Do you have any siblings or pets?");
		u.setFamily(console.nextLine().toLowerCase());
		System.out.println(u.getFamily());
		System.out.println("");
	}

}
