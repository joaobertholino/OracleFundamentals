package main.java.br.senai.inventario.app;

import java.util.InputMismatchException;
import java.util.Scanner;

import main.java.br.senai.inventario.model.Product;

// Classe referente a ProductTester
public class App {

	public static void main(String[] args) {
		createProducts();
	}

	public static Product[] createProducts() {
		Scanner in = new Scanner(System.in);

		int numberProducts = Product.getNumberOfProducts();
		if (numberProducts == 0) {
			System.out.println("Não há produtos!");
			return null;
		}

		Product[] products = new Product[numberProducts];

		for (int i = 0; i < products.length; i++) {
			System.out.println("Digite os dados do produto " + (i + 1) + ":");
			try {
				int tempCode = in.nextInt();
				in.nextLine();
				String tempName = in.nextLine();
				int tempAmount = in.nextInt();
				double tempPrice = in.nextDouble();

				products[i] = new Product(tempCode, tempName, tempAmount, tempPrice);
			} catch (InputMismatchException e) {
				System.out.println("Tipo de dado incorreto! Insira novamente os dados do produto " + (i + 1));
				in.nextLine();
				i--;
			}
		}

		in.close();
		return products;
	}
}
