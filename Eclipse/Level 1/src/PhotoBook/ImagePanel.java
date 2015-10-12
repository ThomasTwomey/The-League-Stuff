package PhotoBook;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePanel extends JPanel
{
	BufferedImage bi;
	public int imageWidth;
	public int imageHeight;

	public ImagePanel(String filename, int width, int height)
	{
		try
		{
			bi = ImageIO.read(this.getClass().getResourceAsStream(filename));
			imageWidth = width;
			imageHeight = height;

		} catch (Exception e)
		{
			System.err.println("Could not find or open file!");
		}

	}

	public ImagePanel(String filename)
	{
		try
		{
			bi = ImageIO.read(this.getClass().getResourceAsStream(filename));
			imageWidth = bi.getWidth();
			imageHeight = bi.getHeight();

		} catch (Exception e)
		{
			System.err.println("Could not find or open file!");
		}

	}

	public void paint(Graphics g)
	{
		super.paint(g);
		g.drawImage(bi, 0, 0, imageWidth, imageHeight, null);
	}
}
