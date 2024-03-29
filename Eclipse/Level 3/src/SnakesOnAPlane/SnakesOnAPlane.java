package SnakesOnAPlane;

import java.util.ArrayList;
import java.util.Random;

public class SnakesOnAPlane {

	public static void main(String[] args) {
		Plane p = new Plane();
		double probOfDeath;
		int numVenomness = 0;
		int viciousness = 0;
		for (Snake s : p.getSnakes()) {
			if (s.getVenomous())
				numVenomness++;
			viciousness += s.getViciousness();
		}
		probOfDeath = (numVenomness * viciousness) / p.getNumOfPassengers();
		System.out.println("The probability of death is " + probOfDeath);
	}

}

class Randomness {
	boolean tofRand() {
		int rand = new Random().nextInt(2);
		boolean tof;
		if (rand == 0)
			tof = false;
		else
			tof = true;
		return tof;
	}

	int numRand() {
		int rand = new Random().nextInt(10) + 1;
		return rand;
	}
}

class Snake {
	int viciousness;
	boolean venomous;

	Snake() {
		Randomness r = new Randomness();
		viciousness = r.numRand();
		venomous = r.tofRand();
	}

	public int getViciousness() {
		return viciousness;
	}

	public boolean getVenomous() {
		return venomous;
	}
}

class Plane {
	private int numberOfPassengers = 190;
	private ArrayList<Snake> snakes = new ArrayList<Snake>();

	Plane() {
		for (int i = 0; i < 100; i++) {
			snakes.add(new Snake());
		}
	}

	public int getNumOfPassengers() {
		return numberOfPassengers;
	}

	public ArrayList<Snake> getSnakes() {
		return snakes;
	}
}