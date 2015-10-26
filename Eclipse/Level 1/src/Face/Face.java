package Face;

import org.jointheleague.graphical.robot.Robot;

public class Face
{
	public static void main(String[] args)
	{
		new Face();
	}

	public Face()
	{
		Robot tommy = new Robot();
		tommy.setSpeed(10);
		tommy.setPenColor(0, 255, 255);
		pupils(tommy);
		eyes(tommy);
		nose(tommy);
		mouth(tommy);
		outside(tommy);
		tommy.move(800);
	}

	void eyes(Robot r)
	{
		r.penDown();
		for (int i = 0; i < 360; i++)
		{
			r.move(1);
			r.turn(1);
		}
		for (int i = 0; i < 360; i++)
		{
			r.move(1);
			r.turn(-1);
		}
		r.penUp();
	}

	void nose(Robot r)
	{
		r.move(-40);
		r.penDown();
		r.turn(150);
		for (int i = 0; i < 3; i++)
		{
			r.move(100);
			r.turn(120);
		}
		r.penUp();
		r.turn(210);
	}

	void mouth(Robot r)
	{
		r.turn(180);
		r.move(200);
		r.turn(90);
		for (int i = 0; i < 60; i++)
		{
			r.move(2);
			r.turn(1);
		}
		r.turn(180);
		r.penDown();
		for (int i = 0; i < 120; i++)
		{
			r.move(2);
			r.turn(-1);
		}
		r.penUp();
		r.turn(180);
		for (int i = 0; i < 60; i++)
		{
			r.move(2);
			r.turn(1);
		}
		r.turn(90);
		r.move(200);
	}

	void outside(Robot r)
	{
		r.move(200);
		r.turn(90);
		r.penDown();
		for (int i = 0; i < 360; i++)
		{
			r.move(4);
			r.turn(1);
		}
		r.penUp();
		r.turn(90);
		r.move(300);
		r.turn(180);
	}

	void pupils(Robot r)
	{
		r.turn(90);
		r.move(60);
		r.penDown();
		for (int i = 0; i < 120; i++)
		{
			r.move(1);
			r.turn(3);
		}
		r.penUp();
		r.turn(180);
		r.move(120);
		r.penDown();
		for (int i = 0; i < 120; i++)
		{
			r.move(1);
			r.turn(-3);
		}
		r.penUp();
		r.turn(180);
		r.move(60);
		r.turn(-90);
	}
}