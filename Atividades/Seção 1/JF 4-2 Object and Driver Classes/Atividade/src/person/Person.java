package person;

public class Person {
	private String personName;
	private int personAge;
	
	public Person(String personName, int personAge) {
		this.personName = personName;
		this.personAge = personAge;
	}
	
	public String getPersonName() {
		return this.personName;
	}
	
	public int getPersonAge() {
		return this.personAge;
	}
	
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
}
