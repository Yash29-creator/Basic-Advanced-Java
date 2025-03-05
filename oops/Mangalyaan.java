package oops;

public class Mangalyaan extends Spacecraft{
	
	private String destination;
	private String payload;
	public Mangalyaan(String missionName, String launchDate, String destination, String payload) {
		super(missionName, launchDate);
		this.destination = destination;
		this.payload = payload;
	}
	
	public String getDestination() {
		return destination;
	}
	public String getPayload() {
		return payload;
	}
	public void land() {
		System.out.println("Mangalyaan Landed Successfully on Mars. :)");
	}
	public void collectData() {
		System.out.println("Mangalyaan Started collecting data from Mars. :)");
	}
	public void getMissionDetails() {
		System.out.println("Mission Name: "+getMissionName());
		System.out.println("Mission Launch Date: "+getLaunchDate());
		System.out.println("Mission Destination: "+destination);
		System.out.println("Mission Payload: "+payload);
	}

}
