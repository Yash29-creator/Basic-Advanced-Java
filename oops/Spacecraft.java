package oops;

public class Spacecraft {
	
	private String missionName;
	private String launchDate;
	
	public Spacecraft(String missionName, String launchDate) {
		this.missionName = missionName;
		this.launchDate = launchDate;
	}
	
	public String getMissionName() {
		return missionName;
	}
	public String getLaunchDate() {
		return launchDate;
	}
	
	public void launch() {
		System.out.println("Spacecraft Launched Successfully. :)");
	}
	public void orbit() {
		System.out.println("Spacecraft entered into the orbit. :)");
	}
	
}
