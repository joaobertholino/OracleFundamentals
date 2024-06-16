package appTester;

public class AppTester {

	public static void main(String[] args) {
		// Escreva três maneiras diferentes de declarar e instanciar
		// um objeto String chamado "myString" e contendo "abc".
		String myStringOne = new String("abc");
		System.out.println(myStringOne);
		
		String myStringTwo = "abc";
		System.out.println(myStringTwo);
		
		String myStringThree = String.valueOf("abc");
		System.out.println(myStringThree);
		
		// Declare e instancie dois objetos de String separados e, em
		// seguida, concatene-os juntos e designe a eles um terceiro
		// objeto String arbitrário.
		String stringOne = new String("String one");
		String stringTwo = new String("String two");
		String stringThree = new String(stringOne + " " + stringTwo);
		System.out.println(stringThree);
	}

}
