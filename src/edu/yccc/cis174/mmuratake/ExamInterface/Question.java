package edu.yccc.cis174.mmuratake.ExamInterface;

public class Question {
	
	String question;
	String answer;
	String userAnswer;
	String studentName;
	Boolean isCorrect = false;

	public Boolean getIsCorrect() 
	{
		return isCorrect;
	}

	public void setIsCorrect(Boolean isCorrect) 
	{
		this.isCorrect = isCorrect;
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

	public String getStudentName() 
	{
		return studentName;
	}

	public void setStudentName(String studentName) 
	{
		this.studentName = studentName;
	}
	
	

}
