// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class FourSquare {
	public static void main(String[] args) {
		// 3. Make the tortoise move as fast as possible
		
		
		// 4. Set the pen width to 5
		
		
		// 5. Do steps #6 and #7 four times...
			
			// 6. Change the color of the line the Tortoise draws to a random color 
	
			// 1. Call the drawSquare() method
		
		runSettings();
		for (int i = 0; i < 4; i++)
		{
			drawSquare();
		}
			
			// 7. Turn the tortoise 90 degrees to the right
		
	}
	static void runSettings(){
		String StrSpeed = JOptionPane.showInputDialog(null,"How fast do you want it to go 1-9");
		int Speed = Integer.parseInt(StrSpeed);
		Tortoise.setSpeed(Speed);
		String StrPen = JOptionPane.showInputDialog(null,"How thick do you want it to be (in pixels)");
		int Pen = Integer.parseInt(StrPen);
		Tortoise.setPenWidth(Pen);
	}

	/* 2. Fill in the code to draw a square inside the method below. */
	static void drawSquare() {
		Tortoise.show();
		int times = 4;
		int turn = 90;
		for (int i = 0; i < times; i++)
		{
			Tortoise.setPenColor(Colors.getRandomColor());
			Tortoise.move(150);
			Tortoise.turn(turn);
		}
			Tortoise.turn(270);
		
		
	}
}




