package personTester;

import person.*;

public class PersonTester {
	public static void main(String[] args) {
		Person p1 = new Person("Arial", 37);
		Person p2 = new Person("Joseph", 15);
		
		if (p1.getPersonAge() == p2.getPersonAge()) {
			System.out.println(p1.getPersonName() + " is the same age as " + p2.getPersonName());
		} else {
			System.out.println(p1.getPersonName() + " is NOT the same age as " + p2.getPersonName());
		}
	}
}
