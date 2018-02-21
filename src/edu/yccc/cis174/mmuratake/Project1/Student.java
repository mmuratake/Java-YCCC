package edu.yccc.cis174.mmuratake.Project1;

public class Student {
	
	String name;
	int grade = 0;
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getGrade() 
	{
		return grade;
	}
	public void setGrade(int grade) 
	{
		this.grade = grade;
	}
	
	public String toString()
	{
		return name + "/r/n" + grade;
	}

}
