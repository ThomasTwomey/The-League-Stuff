package ListIterationMaster;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class ListIterationMaster {

	public static void main(String[] args) {

	}

}

class Song {
	private double duration;

	Song(double duration) {
		this.duration = duration;
	}

	public double getDuration() {
		return duration;
	}
}

class SongLibrary {
	SongLibrary(int size) {
		ArrayList<Song> cd = new ArrayList<Song>();
		for (int i = 0; i < size; i++) {
			int wholeNum = new Random().nextInt(8);
			double decNum = new Random().nextDouble();
			double rand = wholeNum + decNum;
			cd.add(new Song(rand));
		}

		double totalTime = 0;
		for (Song g : cd) {
			totalTime += g.getDuration();
		}
		DecimalFormat formatter = new DecimalFormat("#0.00");
		System.out.println("The CD will take " + formatter.format(totalTime)
				+ " to finish.");
	}

}

class Student {
	private String eyeColor;

	Student(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public String getEyeColor() {
		return eyeColor;
	}
}