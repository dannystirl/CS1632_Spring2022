package edu.pitt.cs.cs1632;
public class Config {
	// Whether to intentionally inject bugs into CoffeeMakerQuest.
	private static boolean buggyRentACat = false;
	
	public static void setBuggyRentACat(boolean val) {
		buggyRentACat = val;
	}
	public static boolean getBuggyRentACat() {
		return buggyRentACat;
	}
}
