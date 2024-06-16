package students;

import java.util.Date;

public class StudentTest {
	public static void main(String[] args) {
		Student myStudent = new Student("Ellen", "Sthefani", "Roveggia",
				new Date(2006, 8, 8), 23072020, 0.0, "Sciencie Of Computation",
				"Master", 2028);
		
		String[] grade = new String[] {"A", "B", "C+", "D", "A-"};
		myStudent.generalAvarageCalculate(grade);
		System.out.println(myStudent.getGeneralAverage());
		
		System.out.println(myStudent.getCarrers());
		myStudent.setNewCarrers("Software Enginner");
		System.out.println(myStudent.getCarrers());
		
		System.out.println(myStudent.getDateOfBirth());
	}

}
