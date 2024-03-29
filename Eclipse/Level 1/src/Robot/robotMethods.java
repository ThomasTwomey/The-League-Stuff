package Robot;

import org.jointheleague.graphical.robot.Robot;

public class robotMethods
{
	public static void main(String[] args)
	{
		robotMethods a = new robotMethods();
	}

	public robotMethods()
	{
		Robot tommy = new Robot();
		tommy.changeRobot("myRobot");

		tommy.setSpeed(10);
		tommy.penDown();

		drawShape(tommy, 360, 1);
	}

	public void drawSquare(Robot robot, int size)
	{
		for (int i = 0; i < 4; i++)
		{
			robot.move(size);
			robot.turn(90);
		}
	}

	public void drawShape(Robot robot, int numSides, int size)
	{
		for (int i = 1; i <= numSides; i++)
		{
			robot.move(size);
			robot.turn(360 / numSides);
		}
	}
}
