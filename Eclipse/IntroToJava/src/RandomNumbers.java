import java.util.Random;

public class RandomNumbers
{
	public static void main(String[] args)
	{
		int x = new Random().nextInt(40) + 10;
		
		System.out.println(x);
	}
}
