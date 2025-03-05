package oops;

public class Booster {

	public static void main(String[] args) {
		Mangalyaan mang = new Mangalyaan("Mangalyaan", "November 5th, 2013", "Mars", "Rover");
		System.out.println(mang.getMissionName());
		mang.launch();
		mang.orbit();
		System.out.println(mang.getDestination());
		mang.land();
		mang.collectData();
		mang.getMissionDetails();
	}

}
