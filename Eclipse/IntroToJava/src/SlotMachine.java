import java.util.Random;

import javax.swing.JOptionPane;

public class SlotMachine
{
	public static void main(String[] args)
	{
		new SlotMachine();
	}

	public SlotMachine()
	{
		int numSet1 = new Random().nextInt(3);
		int numSet2 = new Random().nextInt(3);
		JOptionPane.showMessageDialog(null, "The numbers are " + numSet1 + " " + numSet2);

		if (numSet1 == numSet2)
		{
			JOptionPane.showMessageDialog(null, "Ding Ding Ding Ding");
		}
	}
}
