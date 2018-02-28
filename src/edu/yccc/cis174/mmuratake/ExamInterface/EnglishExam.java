package edu.yccc.cis174.mmuratake.ExamInterface;

import java.util.List;

public class EnglishExam implements Exam{


	public List<Question> loadQuestion() 
	{
		// TODO Auto-generated method stub
		return null;
	}


	public double calculateScore() 
	{
		App.score = (App.correct / App.total) * 100;
		return App.score;
	}
	
	

}
