package StringFun;
import javax.swing.JOptionPane;

public class StringFun
{

	public static void main(String[] args)
	{
		StringFun a = new StringFun();
	}

	public StringFun()
	{
		String name = JOptionPane.showInputDialog("Enter your name:");
		JOptionPane.showMessageDialog(null, flipString(name));
	}

	public String flipString(String string)
	{
		String flipped = "";

		for (int i = string.length() - 1; i >= 0; i--)
		{
			char current = string.charAt(i);
			flipped += current;
		}

		return flipped;
	}

}
