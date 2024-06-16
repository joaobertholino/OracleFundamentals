package entities;

public class Fish {
	private String nameOfFish;
	private String typeOfFish;
	private int friendliness;

	public Fish() {
		this.nameOfFish = "Unknown";
		this.typeOfFish = "Unknown";
		this.friendliness = 3;
	}

	public Fish(String n, String t, int f) {
		this.nameOfFish = n;
		this.typeOfFish = t;
		this.friendliness = f;
	}

	public String getNameOfFish() {
		return this.nameOfFish;
	}

	public void setNameOfFish(String n) {
		this.nameOfFish = n;
	}

	public String getTypeOfFish() {
		return this.typeOfFish;
	}

	public void setTypeOfFish(String s) {
		this.typeOfFish = s;
	}

	public int getFriendliness() {
		return this.friendliness;
	}

	public void setFriendliness(int n) {
		this.friendliness = n;
	}
}
