package CustomRobot;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.jointheleague.graphical.robot.Robot;

public class CustomRobot implements ActionListener
{
	JFrame frame;
	JPanel panel;
	JLabel sides;
	JLabel sideLength;
	JLabel penSize;
	JLabel penColor;
	JLabel speed;
	JButton generate;
	JTextField sidesTxt;
	JTextField sideLengthTxt;
	JTextField penSizeTxt;
	JTextField penColorTxt;
	JTextField speedTxt;
	Robot robot;

	public static void main(String[] args)
	{
		CustomRobot r = new CustomRobot();
	}

	public CustomRobot()
	{
		frame = new JFrame();
		panel = new JPanel();
		sides = new JLabel("Sides");
		sideLength = new JLabel("Side Length");
		penSize = new JLabel("Pen Size");
		penColor = new JLabel("Pen Color");
		speed = new JLabel("Speed");
		generate = new JButton("Generate");
		sidesTxt = new JTextField("", 100);
		sideLengthTxt = new JTextField("", 100);
		penSizeTxt = new JTextField("", 100);
		penColorTxt = new JTextField(" ", 100);
		speedTxt = new JTextField("", 100);

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.add(panel);
		panel.setLayout(null);
		panel.add(sides);
		panel.add(sideLength);
		panel.add(penSize);
		panel.add(penColor);
		panel.add(speed);
		panel.add(generate);
		panel.add(sidesTxt);
		panel.add(sideLengthTxt);
		panel.add(penSizeTxt);
		panel.add(penColorTxt);
		panel.add(speedTxt);

		sides.setBounds(20, 10, 50, 20);
		sideLength.setBounds(20, 50, 75, 20);
		penSize.setBounds(20, 90, 75, 20);
		penColor.setBounds(20, 130, 75, 20);
		speed.setBounds(20, 170, 75, 20);
		generate.setBounds(20, 220, 75, 20);
		sidesTxt.setBounds(120, 10, 100, 20);
		sideLengthTxt.setBounds(120, 50, 100, 20);
		penSizeTxt.setBounds(120, 90, 100, 20);
		penColorTxt.setBounds(120, 130, 100, 20);
		speedTxt.setBounds(120, 170, 100, 20);

		generate.addActionListener(this);

		frame.setSize(250, 280);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == generate)
		{
			int sides = 4;
			sides = Integer.parseInt(sidesTxt.getText());
			int sideLength = 50;
			sideLength = Integer.parseInt(sideLengthTxt.getText());
			int penSize = 1;
			penSize = Integer.parseInt(penSizeTxt.getText());
			String penColor = penSizeTxt.getText();
			int speed = 5;
			speed = Integer.parseInt(speedTxt.getText());

			robot = new Robot();

			robot.setPenWidth(penSize);
			robot.setSpeed(speed);
			robot.setPenColor(Color.BLACK);
			robot.move(500);

			for (int i = 0; i < sides; i++)
			{
				robot.move(sideLength);
				robot.turn(360 / sides);
			}
		}
	}
}
