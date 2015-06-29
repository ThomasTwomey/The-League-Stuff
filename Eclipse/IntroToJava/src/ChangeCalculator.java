// Copyright The League of Amazing Programmers 2014
import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		
		String strNickle = JOptionPane.showInputDialog(null, "How many nickles do you have?");

		// Convert their answer to an int using Integer.parseInt()
		
		double nickle = Double.parseDouble(strNickle);

		// Ask the user how many dimes they have, and convert their answer
		
		String strDimes = JOptionPane.showInputDialog(null, "How many dimes do you have?");
		double dime = Double.parseDouble(strDimes);

		// Ask the user how many quarters they have, and convert their answer
		
		String strQuarters = JOptionPane.showInputDialog(null, "How many quarters do you have?");
		double quarter = Double.parseDouble(strQuarters);

		// Calculate how much money the user has and save it in a double variable
		
		double totalChange = (nickle / 100 * 5) + (dime / 100 * 10) + (quarter / 100 * 25);

		// Tell the user how much money they have
		
		JOptionPane.showMessageDialog(null, "You have $" + totalChange);

	}
}

