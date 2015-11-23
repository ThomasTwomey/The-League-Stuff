package PracticeTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PracticeTest implements ActionListener
{
	JFrame frame;
	JPanel panel;
	JButton random;
	JButton message;
	JButton exit;

	public static void main(String[] args)
	{
		new PracticeTest();
	}

	PracticeTest()
	{
		frame = new JFrame("Practice Test");
		panel = new JPanel();
		random = new JButton("Random");
		message = new JButton("Message");
		exit = new JButton("Exit");

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.add(panel);

		panel.add(message);
		panel.add(random);
		panel.add(exit);

		message.addActionListener(this);
		random.addActionListener(this);
		exit.addActionListener(this);

		frame.setSize(200, 150);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == message)
		{
			JOptionPane.showMessageDialog(null, "Message");
		}

		else if (e.getSource() == random)
		{
			int rand = new Random().nextInt(5);
			JOptionPane.showMessageDialog(null, rand);
		}

		else if (e.getSource() == exit)
		{
			System.exit(0);
		}

	}

}
