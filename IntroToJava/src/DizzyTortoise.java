import javax.swing.JOptionPane;
import org.teachingextensions.logo.Tortoise;

public class DizzyTortoise {

	public static void main(String[] args) {
		//1. Use the dance method to make the Tortoise spin.
		//2. Ask the user how dizzy you want the tortoise from 1-10, then spin
		 String StrTimes = JOptionPane.showInputDialog(null,"How many times do you want the tortoise to spin (1-10)");
		 int times = Integer.parseInt(StrTimes);
		 dance(times);
		// that number of times.

	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			Tortoise.turn(360);
		}
	}
}

