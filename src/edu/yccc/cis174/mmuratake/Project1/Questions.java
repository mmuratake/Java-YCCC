package edu.yccc.cis174.mmuratake.Project1;

/**
 * 
 * @author MamiMuratake
 * February 14 2018
 * Project #1: Java Test
 *
 */

public class Questions {
	
	// The different parts of a test question.
	String question;
	String answer;
	String choices;
	Boolean correct;

	

	// Constructor to make multiple choice question.
	public Questions(String question, String answer, String choices)
	{
		this.question = question;
		this.answer = answer;
		this.choices = choices;
	}
	
	// Constructor to make "short-answer" question.
	public Questions(String question, String answer)
	{
		this.question = question;
		this.answer = answer;
	}
	

	public String getChoices() 
	{
		return choices;
	}
	public void setChoices(String choices) 
	{
		this.choices = choices;
	}
	public String getQuestion() 
	{
		return question;
	}
	public void setQuestion(String question) 
	{
		this.question = question;
	}
	public String getAnswer() 
	{
		return answer;
	}
	public void setAnswer(String answer) 
	{
		this.answer = answer;
	}
	public Boolean getCorrect() 
	{
		return correct;
	}
	public void setCorrect(Boolean correct) 
	{
		this.correct = correct;
	}

	
	// Redefining toString.
	public String toString()
	{
		return "\r\n" + question + "\r\n" + choices;
	}
	
	
	// Not part of the question, but used to determine whether user got the question right or not.
	String userAnswer;
	
	public String getUserAnswer() 
	{
		return userAnswer;
	}

	public void setUserAnswer(String userAnswer) 
	{
		this.userAnswer = userAnswer;
	}

	
}
