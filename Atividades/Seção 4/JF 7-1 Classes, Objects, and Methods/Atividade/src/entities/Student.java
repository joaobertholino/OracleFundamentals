package entities;

public class Student {
	private String name;
	private int credits;
	private double generalAverage;
	private double qualityPoints;
	
	public Student() {
		this.name = null;
		this.credits = 0;
		this.generalAverage = 0.0;
		this.qualityPoints = 0.0;
	}
	
	public Student(String name, int credits, double qualityPoints) {
		this.name = name;
		this.credits = credits;
		this.generalAverage = 0.0;
		this.qualityPoints = qualityPoints;
	}
	
	public double currentAverage() {
		return this.qualityPoints / this.credits;
	}
	
	public void updateData(int credits, double qualityPoints) {
		this.credits += credits;
		this.qualityPoints += qualityPoints;
		this.generalAverage = currentAverage();
	}
}
