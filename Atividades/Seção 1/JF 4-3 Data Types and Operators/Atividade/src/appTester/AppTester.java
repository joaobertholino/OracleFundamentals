package appTester;

import java.util.Scanner;

import app.App;

public class AppTester {
	public static void main(String[] args) {
		double methodOne = App.methodOne(20, 15);
		System.out.println(methodOne);
		
		double methodTwo = App.methodTwo(5);
		System.out.println(methodTwo);
		
		double methodThree = App.methodThree(5, 10);
		System.out.println(methodThree);
		
		double methodFour = App.methodFour(5, 10);
		System.out.println(methodFour);
		
		double methodFive = App.methodFive(5, 10);
		System.out.println(methodFive);
		
		double methodSix = App.methodSix(5, 10);
		System.out.println(methodSix);
		
		double methodSeven = App.methodSeven(5);
		System.out.println(methodSeven);
		
		Scanner input = new Scanner(System.in);
		int person = input.nextInt();
		input.close();
		
		int methodEight = App.methodEight(person);
		int methodNine = App.methodNine(person);
		System.out.println("Numeros de onibus: " + methodEight + " / " + "Numero de pessoas em vans: " + methodNine);
	}
}
