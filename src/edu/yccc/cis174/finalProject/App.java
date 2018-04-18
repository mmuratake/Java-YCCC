package edu.yccc.cis174.finalProject;

public class App {
	
	/**
	 * 
	 * What I want to do in a nutshell: (Summary)
	 * 
	 * Basically, you try to guess the person based on your conversation with them.
	 * They tell you some of their info and you try to guess them based on that.
	 * Maybe before they try to guess you.
	 * You ask each other at least five questions, then you try to guess each other. 
	 * You guess first. Then they do. If you both get it wrong, you're done.
	 * CAN I DO THAT!?
	 * Maybe play again.
	 * 
	 * 1. Create 5 (or so) characters.
	 * 2. Each character has a couple stats. Is that possible? Yes, if I use a list, I think.
	 * 3. Hit play.
	 * 4. Randomly generates one character.
	 * 5. This one character has randomly generated stats.
	 * 6. Character greets you. (Each character greets you differently.)
	 * 7. Character asks if you've played before?
	 * 			- If no, they tell you the rules. Then tell you to continue.
	 * 			- If yes, you continue normally.
	 * 8. Character asks you a question. You answer, it writes to file. (The questions are generated randomly.)
	 * 9. Character tells you their own answer to the question. Repeat.
	 * 10. Needs to be able to read from file and guess person.
	 * 			- If only their first name is capitalized, could it work?
	 * 
	 * 
	 * Okay let's start simple. Five acceptance criteria.
	 * 
	 * Going with what I got.
	 * 
	 * 1. Takes user input.
	 * 2. Responds to user input.
	 * 3. Writes to file.
	 * 4. Reads from file? 
	 * 5. Different experience every time you play.
	 * 
	 * Cool, except for #4. 
	 * 
	 * 
	 * Alright, backup planning. Even if something fails, I can still do what I want.
	 * 
	 *  4. If I can't read from file, I might be able to implement the interface thing. Wait just a minute.
	 *  3. If I can't read from file, there's no point writing to file. But I can still record whether you've won or lost.
	 * 
	 */
	
	public static void main(String[] args)
	{
		GuessingGame gg = new GuessingGame();
		gg.play();
	}

}
