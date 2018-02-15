package edu.yccc.cis174.mmuratake.Inheritance;

import java.util.ArrayList;
import java.util.List;

public class MultipleChoice extends Question{
	
	List<String> answers = new ArrayList<String>();

	public List<String> getAnswers() 
	{
		return answers;
	}

	public void setAnswers(List<String> answers) 
	{
		this.answers = answers;
	}
	
	public void addAnswer(String answer)
	{
		answers.add(answer);
	}
	
	public String toString()
	{
		return this.question + " " + this.answers;
	}

}
