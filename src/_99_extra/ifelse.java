package _99_extra;

import javax.swing.JOptionPane;

public class ifelse {
	public static void main(String[] args) {
		
	
	//1. Declare a string variable and initialize it to “yes”. If the string is equal to yes, print “happy” otherwise print
	//“sad”. Then print "Wednesday".
	String yup = "yes";
	if(yup.equals("yes")) {
	System.out.println("happy");
	
	}
	else {
		System.out.println("sad");
	
	}
	System.out.println("Wednesday");
	//What happens if you set the string variable to "no"? 
	//2. Declare an int variable to hold your age and initialize its value. If you are under 20, print “It’s so great being
//	young”, otherwise print “Don’t you wish you were young!”
	int birf = 12;
		if(birf<20){
	System.out.println("It's so great being young");
		}	
		else { 
			System.out.println("Don't u wish u were young");
		}
	//3. Make an input pop­up to ask the user which animal they like. If the user types “dog”, print “Dogs go woof”,
	//otherwise if they type “cat”, print “Cats go meow” ....and so on with other animals. If you do not have code for
	//the animal they type, print “I don’t know that animal.”
	String animal = JOptionPane.showInputDialog("what animal do u like cat or dog");
	if(animal.equals("dog")) {
		JOptionPane.showMessageDialog(null, "dogs go woof");
	
	}
	else if (animal.equals("cat")){
		
		JOptionPane.showMessageDialog(null, "cats go meow");
	}
	else { 
		JOptionPane.showMessageDialog(null, "I don't know that animal");
	}
	
	
	
	
	
	}
	
	
	
	
	}

