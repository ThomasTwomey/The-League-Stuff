package PhotoBook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PhotoBook implements ActionListener
{
	JFrame frame;
	JPanel panel;
	ImagePanel img;
	ImagePanel[] imageArray;
	JButton next;
	JButton previous;

	public static void main(String[] args)
	{
		PhotoBook p = new PhotoBook();
	}

	public PhotoBook()
	{
		frame = new JFrame("Photo Book");
		panel = new JPanel();

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		next = new JButton("Next");
		previous = new JButton("Previous");

		img = new ImagePanel("theAlmightyLoaf.png");

		frame.add(img);
		frame.add(panel);

		frame.setLayout(null);

		img.setBounds(0, 0, img.imageWidth, img.imageHeight);
		panel.setBounds(img.imageWidth + 10, img.imageHeight + 30, 100, 100);

		panel.add(next);
		panel.add(previous);

		next.addActionListener(this);
		previous.addActionListener(this);

		frame.setSize(img.imageWidth + 80, img.imageHeight);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == next)
		{
			System.out.println("test");
		}

		if (e.getSource() == previous)
		{

		}

	}

}
