package RangeFinder;

import java.util.Scanner;

public class RangeFinder {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String s = "";
		int integer = 0;
		int highest = 0;
		int lowest = 2147483647;
		while (!s.equals("0")) {
			s = keyboard.next();
			integer = Integer.parseInt(s);
			if (integer == 0) {
				break;
			}
			if (integer >= highest) {
				highest = integer;
			}
			if (integer <= lowest) {
				lowest = integer;
			}
		}
		System.out.println("Highest: " + highest);
		System.out.println("Lowest: " + lowest);
	}
}
