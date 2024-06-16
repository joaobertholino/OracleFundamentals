package appTester;

import app.App;

import java.util.Scanner;

public class AppTester {
	public static void main(String[] args) {
		methodOne();
	}

	/**
	 * Grava um programa que solicita ao usuário 10 números, um de cada vez e
	 * imprime a mensagem codificada. Se o usuário informar um número que não é
	 * um daqueles já decifrados, solicite um novo número.
	 */
	public static void methodOne(){
		Scanner in = new Scanner(System.in);

		StringBuilder result = new StringBuilder();
		int limit = 10;

		System.out.println("Insira uma sequencia de 10 números de 1 a 7:");
		for (int i = 0; i < limit; i++) {
			int option = in.nextInt();
			String returnMethod = App.methodOne(option);

			if (returnMethod != null){
				result.append(returnMethod);
			} else{
				System.out.println("Numero invalido, insira novamente:");
				limit++;
			}
		}

		System.out.println("Condigo decifrado: " + result);
	}

	/**
	 * Declarando metodo que irá ler duas entradas do tipo String do usuario e
	 * armazenadas em duas variaveis que serão passadas como argumento do metodo
	 * da classe App, do qual esse metodo ira retornar um booblean.
	 */
	public static void methodTwo(){
		Scanner in = new Scanner(System.in);

		System.out.println("Insira a primeira string:");
		String stringOne = in.next();

		System.out.println("Insira a segunda string:");
		String stringTwo = in.next();

		if (App.methodTwo(stringOne, stringTwo)){
			System.out.println("A string: " + "\"" + stringOne + "\"" + " é um anagrama de: " + "\"" + stringTwo + "\"");
		} else {
			System.out.println("A string: " + "\"" + stringOne + "\"" + " não é um anagrama de: " + "\"" + stringTwo + "\"");
		}
	}
}
