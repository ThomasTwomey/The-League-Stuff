package Spamalot;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Spamalot implements ActionListener
{
	static final String FAKE_USERNAME = "your-best-friend-bob@gmail.com";
	static final String FAKE_PASSWORD = "soupysoup";

	JFrame frame;
	JPanel panel;
	JTextField text;
	JButton good;
	JButton bad;

	public static void main(String[] args)
	{
		Spamalot a = new Spamalot();
	}

	public Spamalot()
	{
		frame = new JFrame();
		panel = new JPanel();
		text = new JTextField("Phone Number/Email");
		good = new JButton("Good");
		bad = new JButton("Bad");

		frame.setVisible(true);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel.setLayout(null);

		panel.add(text);
		panel.add(good);
		panel.add(bad);

		text.setBounds(0, 0, 250, 35);
		good.setBounds(270, 0, 60, 35);
		bad.setBounds(350, 0, 60, 35);

		good.addActionListener(this);
		bad.addActionListener(this);

		frame.setSize(450, 60);
	}

	private boolean sendSpam(String recipient, String subject, String content)
	{

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
				new javax.mail.Authenticator()
				{
					protected javax.mail.PasswordAuthentication getPasswordAuthentication()
					{
						return new javax.mail.PasswordAuthentication(
								FAKE_USERNAME, FAKE_PASSWORD);
					}
				});

		try
		{
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(FAKE_USERNAME));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(recipient));
			message.setSubject(subject);
			message.setText(content);
			Transport.send(message);
			return true;
		} catch (MessagingException e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == good)
		{
			if (!sendSpam(text.getText(), "Subject", "Content"))
			{
				text.setBackground(Color.RED);
			} else if (sendSpam(text.getText(), "Subject", "Content"))
			{
				text.setBackground(Color.GREEN);
			}

		}

		else if (e.getSource() == bad)
		{

		}
	}

}
