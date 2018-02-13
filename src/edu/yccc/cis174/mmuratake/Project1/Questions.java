package edu.yccc.cis174.mmuratake.Project1;

/**
 * 
 * @author MamiMuratake
 * February 14 2018
 * Project #1: Java Test
 *
 */

public class Questions {
	
	String question;
	String answer;
	String choiceA;
	String choiceB;
	String choiceC;
	Boolean points;
	int grade;

	public int getGrade() 
	{
		return grade;
	}

	public void setGrade(int grade) 
	{
		this.grade = grade;
	}

	public Questions(String question, String answer, String choiceA, String choiceB, String choiceC)
	{
		this.question = question;
		this.answer = answer;
		this.choiceA = choiceA;
		this.choiceB = choiceB;
		this.choiceC = choiceC;
	}
	
	public Questions(String question, String answer)
	{
		this.question = question;
		this.answer = answer;
	}
	
	public Questions()
	{
		
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
	public Boolean getPoints() 
	{
		return points;
	}

	public void setPoints(Boolean points) 
	{
		this.points = points;
	}

	
	public String toString()
	{
		return "\r\n" + question + "\r\n" + choiceA + "\r\n" + choiceB + "\r\n" + choiceC;
	}
	
	
	
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
