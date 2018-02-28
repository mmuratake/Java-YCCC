package edu.yccc.cis174.mmuratake.ExamInterface;

public class Question {
	
	String question;
	String answer;
	String userAnswer;
	String choices;


	public Question(String question, String answer) 
	{
		this.question = question;
		this.answer = answer;
	}

	public Question(String question, String answer, String choices) 
	{
		this.question = question;
		this.answer = answer;
		this.choices = choices;
	}

	public String getAnswer() 
	{
		return answer;
	}

	public void setAnswer(String answer) 
	{
		this.answer = answer;
	}

	public String getQuestion() 
	{
		return question;
	}

	public void setQuestion(String question) 
	{
		this.question = question;
	}

	public String getUserAnswer() 
	{
		return userAnswer;
	}

	public void setUserAnswer(String userAnswer) 
	{
		this.userAnswer = userAnswer;
	}
	
	public String getChoices() 
	{
		return choices;
	}

	public void setChoices(String choices) 
	{
		this.choices = choices;
	}

}
