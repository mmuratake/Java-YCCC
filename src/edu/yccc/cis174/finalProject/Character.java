package edu.yccc.cis174.finalProject;

import java.util.List;

public class Character {
	
	String name;
	List<String> likes;
	List<String> dislikes;
	List<String> hobbies;
	
	public List<String> getLikes() 
	{
		return likes;
	}
	public void setLikes(List<String> likes) 
	{
		this.likes = likes;
	}
	public List<String> getDislikes() 
	{
		return dislikes;
	}
	public void setDislikes(List<String> dislikes) 
	{
		this.dislikes = dislikes;
	}
	public List<String> getHobbies() 
	{
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) 
	{
		this.hobbies = hobbies;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	
	

}
