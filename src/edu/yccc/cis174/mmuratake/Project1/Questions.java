package edu.yccc.cis174.mmuratake.Project1;

public class Questions {
	
	String question;
	String answer;
	String choiceA;
	String choiceB;
	String choiceC;
	
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
	
}