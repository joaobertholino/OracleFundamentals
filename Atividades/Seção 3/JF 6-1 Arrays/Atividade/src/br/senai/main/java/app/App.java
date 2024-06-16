package br.senai.main.java.app;

import java.util.Scanner;

public class App {

	/**
	 * Declarando um método que retorna uma matrix bidimencional do tipo double onde primeiro é lida a entrada do usuario
	 * com os valores referentes a quantidade de alunos da turma e de provas por cada aluno, sendo instanciado uma matrix
	 * bidimencional onde o numero de alunos passado pelo usuario representara o numero de linhas da matrix e o numero de
	 * provas por alunos representara o numero de colunas da matrix.
	 * <p>
	 * Logo apos é usado um loop for aninhado que será usado para ler a entrada do usuario com o valor referente a nota de
	 * cada aluno em cada uma das avaliações e atribuido esse valor as posições da matrix.
	 * <p>
	 * Por fim, essa matrix é retornada pelo método.
	 */
	public static double[][] methodOne(){
		Scanner in = new Scanner(System.in);

		System.out.println("Insira a quantidade de alunos:");
		int lines = in.nextInt();
		System.out.println("Insira a quantidade de provas de cada aluno:");
		int colluns = in.nextInt();

		double[][] notes = new double[lines][colluns];

		for (int i = 0; i < notes.length; i++) {
			for (int j = 0; j < notes[i].length; j++) {
				System.out.println(STR."Insira a nota: \{j + 1} do aluno: \{i + 1}");
				notes[i][j] = in.nextDouble();
			}
		}
		in.close();
		return notes;
	}

	/**
	 * Declarando método que retorna um valor do tipo {@code double} e que espera uma matrix bidimencional do tipo
	 * {@code double}, onde é inicializada uma variável com seu valor padrão do tipo {@code double}.
	 * <p>
	 * Logo em seguida é declarado um loop for aninhado onde sera usado para iterar sobre cada elemento da matrix,
	 * somando seus valores ao valor da variável e atribuindo o resultado a mesma.
	 * <p>
	 * Por fim é retornado o produto da divisão da variável que armazena a soma dos elementos da matrix com o produto
	 * da multiplicação do {@code length} do array externo com o {@code length} do array interno.
	 */
	public static double methodTwo(double[][] notes){
		double sum = 0.0;
		for (int i = 0; i < notes.length; i++) {
			for (int j = 0; j < notes[i].length; j++) {
				sum += notes[i][j];
			}
		}
		return sum / (notes.length * notes[0].length);
	}

//	TODO: Estudar solução do methodThree, methodFour, methodFive e methodSix
	public static int[][] methodThree(){
		Scanner in = new Scanner(System.in);

		System.out.println("Insira o numero de linhas da matrix:");
		int lines = in.nextInt();

		System.out.println("Insira o numero de colunas da matrix:");
		int colluns = in.nextInt();
		int[][] matrix = new int[lines][colluns];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.println(STR."Insira o valor do array interno \{i} no indice \{j}:");
				matrix[i][j] = in.nextInt();
			}
		}
		return matrix;
	}

	public static int[][] methodFour(int[][] matrixOne, int[][] matrixTwo){
		int[][] sum = new int[matrixOne.length][matrixOne[0].length];
		for (int i = 0; i < matrixOne.length; i++) {
			for (int j = 0; j < matrixOne[i].length; j++) {
				sum[i][j] += matrixOne[i][j] + matrixTwo[i][j];
			}
		}
		return sum;
	}

	public static int[][] methodFive(int[][] matrixOne, int[][] matrixTwo){
		int[][] subtraction = new int[matrixOne.length][matrixTwo[0].length];
		for (int i = 0; i < matrixOne.length; i++) {
			for (int j = 0; j < matrixOne[i].length; j++) {
				subtraction[i][j] += matrixOne[i][j] - matrixTwo[i][j];
			}
		}
		return subtraction;
	}

	public static int[][] methodSix(int[][] matrixOne, int[][] matrixTwo){
		int[][] multiplication = new int[matrixOne.length][matrixTwo[0].length];

		for (int i = 0; i < matrixOne.length; i++) {
			for (int j = 0; j < matrixTwo[i].length; j++) {
				for (int k = 0; k < matrixOne[i].length; k++) {
					multiplication[i][j] += matrixOne[i][k] * matrixTwo[k][j];
				}
			}
		}
		return multiplication;
	}
}