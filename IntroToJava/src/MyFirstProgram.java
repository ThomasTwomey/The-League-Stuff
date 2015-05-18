import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;

public class MyFirstProgram {
	public static void main(String[] args) {
		Tortoise.show();
		Tortoise.setAnimal(Animals.Spider);
		Tortoise.setSpeed(4);
		Tortoise.move(100);
		Tortoise.turn(90);
		Tortoise.move(100);
		
		
	}
}
