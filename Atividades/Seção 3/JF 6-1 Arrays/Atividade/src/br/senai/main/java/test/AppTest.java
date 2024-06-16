package br.senai.main.java.test;

import br.senai.main.java.app.App;
import br.senai.main.java.app.Deck;

import java.util.Scanner;

public class AppTest {
	public static void main(String[] args) {
		Deck d = new Deck();
		d.shuffle();
		d.print();

	}

	public static void methodOne() {
//		Declare uma pontuação do nome de array de uma dimensão do tipo int que possa conter 9 valores.
		int[] myArrayOne = new int[9];

//		Declare um array bidimensional chamado price do tipo flutuante que tenha 10 linhas e 3 colunas.
		float[][] myArrayTwo = new float[10][3];

//		Declare e inicialize um array bidimensional denominado matrix do tipo long que tenha 4 linhas e 3 colunas
//		para ter todos os valores definidos como 5.
		long[][] matrix = {{5, 5, 5}, {5, 5, 5}, {5, 5, 5}, {5, 5, 5}};

//		Declare e inicialize um array de byte unidimensional denominado values de tamanho 10 para que todas as entradas
//		contenham 1.
		byte[] values = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
	}

	public static void methodTwo() {
		double[][] noteList = App.methodOne();
		System.out.println(STR."Media da turma: \{App.methodTwo(noteList)}");
	}

	public static void methodThree() {
		Scanner in = new Scanner(System.in);

		System.out.println("Matrix A");
		int[][] matrixA = App.methodThree();

		System.out.println("Matrix B");
		int[][] matrixB = App.methodThree();

		System.out.println("Insira a operação desejada: \n 1 - Display A + B \n 2 - Display A - B \n 3 - Display A * B");
		int option = in.nextInt();

		while (option != 0) {
			switch (option) {
				case 1:
					int[][] sum = App.methodFour(matrixA, matrixB);
					for (int i = 0; i < sum.length; i++) {
						for (int j = 0; j < sum[i].length; j++) {
							System.out.println(STR."\{sum[i][j]}");
						}
					}
					option = in.nextInt();
					break;
				case 2:
					int[][] subtraction = App.methodFive(matrixA, matrixB);
					for (int i = 0; i < subtraction.length; i++) {
						for (int j = 0; j < subtraction[i].length; j++) {
							System.out.println(STR."\{subtraction[i][j]}");
						}
					}
					option = in.nextInt();
					break;
				case 3:
					int[][] multiplication = App.methodSix(matrixA, matrixB);
					for (int i = 0; i < multiplication.length; i++) {
						for (int j = 0; j < multiplication[i].length; j++) {
							System.out.println(STR."\{multiplication[i][j]}");
						}
					}
					option = in.nextInt();
					break;
				default:
					System.out.println("Opção invalida - Insira novamente:");
					option = in.nextInt();
					break;
			}
		}
		in.close();
	}
}
