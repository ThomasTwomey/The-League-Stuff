import org.teachingextensions.logo.Tortoise;

public class shape
{
	public static  void main(String[] args)
	{
		new shape();
	}

	shape()
	{
		square(100);
		triangle(100);
	}

	void square(int side)
	{
		for (int i = 0; i < 4; i++)
		{
			Tortoise.show();
			Tortoise.setSpeed(10);
			Tortoise.move(side);
			Tortoise.turn(90);
		}
	}

	void triangle(int side)
	{
		for (int i = 0; i < 3; i++)
		{
			Tortoise.show();
			Tortoise.setSpeed(10);
			Tortoise.move(side);
			Tortoise.turn(120);
		}
	}
}
