package br.senai.main.java.appTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AppTest {
	public static void main(String[] args) {
		testeDois();
	}

	public static void teste() {
		String[] nullPointer = new String[5];

		try {
			System.out.println(nullPointer[6]);
		} catch (Exception e) {
			System.out.println("Bloco catch");
			throw new ArrayIndexOutOfBoundsException();
		} finally {
			for (int i = 0; i < nullPointer.length; i--) {
				System.out.println(nullPointer[i]);
			}
		}
	}

	public static void testeDois() {
		// Exceção verificada
		try {
			File arquivo = new File("arquivo.txt");
			Scanner scanner = new Scanner(arquivo);
			while (scanner.hasNextLine()) {
				String linha = scanner.nextLine();
				System.out.println(linha);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("O arquivo não pôde ser encontrado.");
			e.printStackTrace();
		}

		// Exceção não verificada
		int[] array = {1, 2, 3};
		try {
			System.out.println(array[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Índice do array está fora dos limites.");
			e.printStackTrace();
		}
	}
}
