import java.util.Random;
import javax.swing.JOptionPane;

public class FortuneCookie
{
	public static void main(String[] args)
	{
		JOptionPane.showMessageDialog(null, "Guess Your Fortune");
		
		int fortuneNum = new Random().nextInt(3);
		
		if(fortuneNum == 0)
		{
			JOptionPane.showMessageDialog(null, "Money is in your future");
		}
		else if(fortuneNum == 1)
		{
			JOptionPane.showMessageDialog(null, "Death is on the horizon");
		}
		else if(fortuneNum == 2)
		{
			JOptionPane.showMessageDialog(null, "Panda express is in your future");
		}
	}
}
