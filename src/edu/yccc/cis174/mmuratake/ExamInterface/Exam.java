package edu.yccc.cis174.mmuratake.ExamInterface;

import java.io.IOException;
import java.util.List;

public interface Exam {
	
	public List<Question> loadQuestion();
	
	public void giveExam();
	
	public double calculateScore();
	
	public void writeExamResults(String studentName, double score) throws IOException;

}
