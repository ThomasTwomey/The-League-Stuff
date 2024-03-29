package Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener
{
	JFrame frame;
	JPanel panel;
	JTextField input1;
	JTextField input2;
	JButton mul;
	JButton add;
	JLabel answer;
	float finalAnswer = 0;

	public static void main(String[] args)
	{
		new Calculator();
	}

	Calculator()
	{
		frame = new JFrame("Calculator");
		panel = new JPanel();
		input1 = new JTextField();
		input2 = new JTextField();
		mul = new JButton("Multiply");
		add = new JButton("Add");
		answer = new JLabel("0");

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.add(panel);

		panel.add(input1);
		panel.add(input2);
		panel.add(mul);
		panel.add(add);
		panel.add(answer);

		panel.setLayout(null);

		input1.setBounds(60, 50, 100, 30);
		input2.setBounds(180, 50, 100, 30);
		mul.setBounds(60, 100, 100, 40);
		add.setBounds(180, 100, 100, 40);
		answer.setBounds((350 / 2), 5, 100, 30);

		answer.setFont(answer.getFont().deriveFont(24.0f));

		input1.setHorizontalAlignment(JTextField.CENTER);
		input2.setHorizontalAlignment(JTextField.CENTER);

		mul.addActionListener(this);
		add.addActionListener(this);

		frame.setSize(350, 200);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == mul)
		{
			finalAnswer = getNumber(input1.getText())
					* getNumber(input2.getText());
			answer.setText(Float.toString(finalAnswer));
			finalAnswer = 0;
			input1.setText("");
			input2.setText("");
		}
		if (e.getSource() == add)
		{
			finalAnswer = getNumber(input1.getText())
					+ getNumber(input2.getText());
			answer.setText(Float.toString(finalAnswer));
			finalAnswer = 0;
			input1.setText("");
			input2.setText("");
		}
	}

	float getNumber(String input)
	{
		float num;
		try
		{
			num = Float.parseFloat(input);
		} catch (Exception e)
		{
			num = 0.0f;
		}
		return num;
	}

}
