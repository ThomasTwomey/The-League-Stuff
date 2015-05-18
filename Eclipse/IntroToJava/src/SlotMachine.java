import java.util.Random;
import javax.swing.JOptionPane;


public class SlotMachine
{
	public static void main(String[] args)
	{
		new SlotMachine();
	}
	public SlotMachine(){
		int num1 = new Random().nextInt(100);
		int num2 = new Random().nextInt(100);
		int num3 = new Random().nextInt(100);
		JOptionPane.showMessageDialog(null, "The numbers are " + num1 + " " + num2 + " " + num3);
	}
}
