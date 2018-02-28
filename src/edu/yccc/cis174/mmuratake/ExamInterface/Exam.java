package edu.yccc.cis174.mmuratake.ExamInterface;

import java.util.List;

public interface Exam {
	
	public List<Question> loadQuestion();
	
	public void giveExam();
	
	public double calculateScore();

}
