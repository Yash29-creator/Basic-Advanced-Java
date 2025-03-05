package Practicals;

abstract class SocialMediaApp {
	public abstract void postPhoto(String photoUrl);
	public abstract void postStory(String storyUrl);
	public abstract void followUser(String userId);
	public abstract void unfollowUser(String userId);
	public void displayAppName() {
		System.out.println("Instagram");
	}
}
class InstagramApp extends SocialMediaApp {
	public void postPhoto(String photoUrl) {
		System.out.println("Posting photo to Instagram: " + photoUrl);
	}
	public void postStory(String storyUrl) {
		System.out.println("Posting story to Instagram: " + storyUrl);
	}
	public void followUser(String userId) {
		System.out.println("Following user on Instagram: " + userId);
	}
	public void unfollowUser(String userId) {
		System.out.println("Unfollowing user on Instagram: " + userId);
	}
}
public class InstagramAppDemo {
	public static void main(String[] args) {
		SocialMediaApp sma = new InstagramApp();
		sma.postPhoto("https://example.com/photo.jpg");
		sma.postStory("https://example.com/story.mp4");
		sma.followUser("Elon Musk");
		sma.unfollowUser("Elon Musk");
		sma.displayAppName();
	}
}