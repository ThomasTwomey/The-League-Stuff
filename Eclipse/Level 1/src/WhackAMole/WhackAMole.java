package WhackAMole;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener
{
	JFrame frame;
	JPanel panel;
	int whacked = 0;
	int missed = 0;
	Date date;

	public static void main(String[] args)
	{
		new WhackAMole();
	}

	WhackAMole()
	{
		date = new Date(System.currentTimeMillis());
		frame = new JFrame("Whack a Mole");
		panel = new JPanel();

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.add(panel);

		drawButtons();
		frame.setSize(350, 235);
	}

	void drawButtons()
	{
		panel.removeAll();
		int x = new Random().nextInt(24);

		for (int i = 0; i < 24; i++)
		{
			JButton b = new JButton();
			b.addActionListener(this);
			if (i == x)
			{
				b.setText("Mole!");
			}
			panel.add(b);
			panel.validate();
			panel.repaint();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		JButton b = (JButton) e.getSource();
		if (b.getText().equals("Mole!"))
		{
			playSound("slap.wav");
			missed = 0;
			whacked += 1;
			if (whacked == 10)
			{
				endGame(date, whacked);
				whacked = 0;
			}
			drawButtons();
		} else
		{
			missed += 1;
			speak(insult(missed));
		}
	}

	void speak(String words)
	{
		try
		{
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	String insult(int x)
	{
		x = missed;

		switch (x)
		{
		case 1:
			return "dork";
		case 2:
			return "idiot";
		case 3:
			return "moron";
		default:
			return "kill yourself";
		}
	}

	private void endGame(Date timeAtStart, int molesWhacked)
	{
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null,
				"Your whack rate is "
						+ ((timeAtEnd.getTime() - timeAtStart.getTime())
								/ 1000.00 / molesWhacked)
						+ " moles per second.");
		System.exit(0);
	}

	private void playSound(String fileName)
	{
		AudioClip sound = JApplet
				.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

}
