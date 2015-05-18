// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;

public class SpiralMaker {

	public static void main(String[] args) {
		
		// 3. Make a variable to hold the number of sides and set it to 0
		int sides = 0;
		int going = 9;
		boolean run = true;
		
		//boolean run = true;
		// 4. Ask the user which spiral they would like (square, triangle, or pentagon)
		JOptionPane.showMessageDialog(null, "Do you want a square, triangle, or pentagon?");
		
		// 5. Set the number of sides depending on what the user entered (multiple lines of code)
		String input = JOptionPane.showInputDialog("You want a...");
		
		
			if(input.equalsIgnoreCase("square")){
				sides = sides + 90;
			}
		
			else if(input.equalsIgnoreCase("triangle")){
				sides = sides + 120;
			}
		
			else if(input.equalsIgnoreCase("pentagon")){
				sides = sides + 60;
			}
			else{
				JOptionPane.showMessageDialog(null, "That is not a shape I can draw! Knock it off!");
				going = 0;
				run = false;
				
			}

		// 6. If the user enters something else, say "Sorry, I don't know how to draw a ..."
		
		
		// 1. Make the Tortoise draw a square spiral shape. If you get stuck, use these instructions: http://bit.ly/YJUOkn

		if(run) {
			for (int i = 0; i < 150; i+=5) {
				Tortoise.setSpeed(going);
				Tortoise.move(50 + i);
				Tortoise.turn(sides);
			}
		}
		
		
		
		
		// 2. Change your code to turn the square spiral into a triangle spiral
		
	}

}


