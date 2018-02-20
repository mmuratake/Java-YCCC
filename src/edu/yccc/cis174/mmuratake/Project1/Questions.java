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
	String choiceA;
	String choiceB;
	String choiceC;
	Boolean correct;

	// Constructor to make multiple choice question.
	public Questions(String question, String answer, String choiceA, String choiceB, String choiceC)
	{
		this.question = question;
		this.answer = answer;
		this.choiceA = choiceA;
		this.choiceB = choiceB;
		this.choiceC = choiceC;
	}
	
	// Constructor to make "short-answer" question.
	public Questions(String question, String answer)
	{
		this.question = question;
		this.answer = answer;
	}

	public String getChoiceA() 
	{
		return choiceA;
	}
	public void setChoiceA(String choiceA) 
	{
		this.choiceA = choiceA;
	}
	public String getChoiceB() 
	{
		return choiceB;
	}
	public void setChoiceB(String choiceB) 
	{
		this.choiceB = choiceB;
	}
	public String getChoiceC() 
	{
		return choiceC;
	}
	public void setChoiceC(String choiceC) 
	{
		this.choiceC = choiceC;
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
		return "\r\n" + question + "\r\n" + choiceA + "\r\n" + choiceB + "\r\n" + choiceC;
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
