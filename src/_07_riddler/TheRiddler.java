package _07_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String mia = JOptionPane.showInputDialog("What is as light as a feather, but even the world's strongest man couldn't hold it for more than a minute?"); 
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(mia.equals("his breath")) {
	JOptionPane.showMessageDialog(null,"coooooooooorrrrrrrreeeeeeeccccccttttttt!!!!!!!!");
 score += 1;
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
JOptionPane.showMessageDialog(null, "wrong but this is an answer");
JOptionPane.showMessageDialog(null,"the correct answer is his BREATH");
}
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "your score was "+ score + " great job");
	}


		
	}


