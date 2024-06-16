package students;

import java.util.Date;

public class Student extends Person {
	public final int studentId;
	private double generalAverage;
	private String carrers;
	private String universityDegree;
	private int yearFinal;

	public Student(String firstName, String middleName, String lastName, Date dateOfBirth, int studentId,
			double generalAvarage, String carrers, String universityDegree, int yearFinal) {
		super(firstName, middleName, lastName, dateOfBirth);
		this.studentId = studentId;
		this.generalAverage = generalAvarage;
		this.carrers = carrers;
		this.universityDegree = universityDegree;
		this.yearFinal = yearFinal;
	}

	public double getGeneralAverage() {
		return this.generalAverage;
	}

	public String getCarrers() {
		return this.carrers;
	}

	public String getUniversityDegree() {
		return this.universityDegree;
	}

	public int getYearFinal() {
		return this.yearFinal;
	}

	public void setNewCarrers(String courseName) {
		this.carrers = courseName;
	}

	public void generalAvarageCalculate(String[] grades) {
		double avarage = 0.0;
		for (int i = 0; i < grades.length; i++) {
			switch (grades[i]) {
				case "A":
					avarage += 4;
					break;
				case "A-":
					avarage += 3.67;
					break;
				case "B+":
					avarage += 3.33;
					break;
				case "B":
					avarage += 3;
					break;
				case "B-":
					avarage += 2.67;
					break;
				case "C+":
					avarage += 2.33;
					break;
				case "C":
					avarage += 2;
					break;
				case "D":
					avarage += 1;
					break;
				default:
					avarage += 0;
					break;
			}
		}
		this.generalAverage = avarage / grades.length;
	}
}
