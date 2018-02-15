package edu.yccc.cis174.mmuratake.Inheritance;


public class App {
	
	public static void main(String[] args)
	{
		Question q = new Question();
		q.setQuestion("Who invented Java?");
		q.setAnswer("James Gossling");
		
		System.out.println(q);
		
		
		MultipleChoice q2 = new MultipleChoice();
		q2.setQuestion("Is Java typed?");
		
		q2.addAnswer("Yes");
		q2.addAnswer("No");
		
		System.out.println(q2);
		
	}

}
