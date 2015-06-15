import java.util.Random;
import javax.swing.JOptionPane;


public class AskNumbers
{
	public static void main(String[] args)
	{
		int min = Integer.parseInt(JOptionPane.showInputDialog(null, "What is the minimum number?"));
		int max = Integer.parseInt(JOptionPane.showInputDialog(null, "What is the maximum number?"));
		
		if(min>=max)
		{
			JOptionPane.showMessageDialog(null, "The minimum number is greater than or equal to the maximum number");
			System.exit(1);
		}
		
		int amount = Integer.parseInt(JOptionPane.showInputDialog(null, "How many random numbers do you want?"));
		
		for(int i = 0; i <= amount; i++)
		{
			int random = new Random().nextInt(max-min) + min;
			System.out.println(random);
		}
			
	}
}
