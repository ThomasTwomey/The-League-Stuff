package JLabelsAndFonts;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JLabelsAndFonts implements ActionListener
{
	JFrame frame;
	JPanel panel;
	JLabel label;
	Font myFont;
	JButton up;
	JButton down;
	JButton color;
	JButton sizeUp;
	JButton sizeDown;
	JButton changeFont;
	Random rand;
	Color randColor;

	public static void main(String[] args)
	{
		JLabelsAndFonts g = new JLabelsAndFonts();
	}

	public JLabelsAndFonts()
	{
		frame = new JFrame();
		panel = new JPanel();
		up = new JButton("Up");
		down = new JButton("Down");
		color = new JButton("Color");
		sizeUp = new JButton("Size Up");
		sizeDown = new JButton("Size Down");
		changeFont = new JButton("Change Font");

		label = new JLabel("1");
		myFont = new Font("Arial", Font.PLAIN, 69);

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("JLabels and Fonts");

		frame.add(panel);
		panel.add(up);
		panel.add(down);
		panel.add(color);
		panel.add(sizeUp);
		panel.add(sizeDown);
		panel.add(changeFont);
		panel.add(label);

		up.addActionListener(this);

		down.addActionListener(this);

		color.addActionListener(this);

		sizeUp.addActionListener(this);

		sizeDown.addActionListener(this);

		changeFont.addActionListener(this);

		label.setFont(myFont);
		label.setForeground(Color.BLUE);

		frame.setSize(590, 300);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		int size;

		if (e.getSource() == sizeUp)
		{
			size = myFont.getSize();
			myFont = new Font("Arial", Font.PLAIN, (size += 5));
			label.setFont(myFont);
		}

		else if (e.getSource() == sizeDown)
		{
			size = myFont.getSize();
			myFont = new Font("Arial", Font.PLAIN, (size -= 5));
			label.setFont(myFont);
		}

		else if (e.getSource() == color)
		{
			rand = new Random();
			randColor = new Color(rand.nextInt(256), rand.nextInt(256),
					rand.nextInt(256));
			label.setForeground(randColor);
		}

		else if (e.getSource() == up)
		{
			label.setText(Integer.toString(Integer.parseInt(label.getText()) + 1));
		}

		else if (e.getSource() == down)
		{
			label.setText(Integer.toString(Integer.parseInt(label.getText()) - 1));
		}

		else if (e.getSource() == changeFont)
		{
			rand = new Random();

			String[] fonts = new String[]
			{ "Arial", "TimesNewRoman" };

			myFont = new Font(fonts[rand.nextInt(1)], Font.PLAIN, 50);
			label.setFont(myFont);
		}

	}

}
