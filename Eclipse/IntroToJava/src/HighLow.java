import java.util.Random;
import javax.swing.JOptionPane;

public class HighLow
{
	public static void main(String[] args)
	{
		boolean game = true;
		
		int comNumber = new Random().nextInt(100);
		
		while(game == true)
		{
			
		
			String strUserInput = JOptionPane.showInputDialog("Guess a number between 1 and 100");
			int userInput = Integer.parseInt(strUserInput);
		
			if(userInput > comNumber)
			{
				JOptionPane.showMessageDialog(null, "Lower");
			}
			else if(userInput < comNumber)
			{
				JOptionPane.showMessageDialog(null, "Higher");
			}
			else if(userInput == comNumber)
			{
				JOptionPane.showMessageDialog(null, "You Win!");
				game = false;
			}
		}
	}
}
