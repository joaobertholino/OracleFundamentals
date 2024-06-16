package main.java.br.senai.inventario.app;

import java.util.Scanner;

import main.java.br.senai.inventario.model.Product;

// Classe referente a ProductTester
public class App {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int tempCode = in.nextInt();
		in.nextLine();
		String tempName = in.nextLine();
		int tempAmount = in.nextInt();
		double tempPrice = in.nextDouble();
		
		Product p1 = new Product(tempCode, tempName, tempAmount, tempPrice);
		System.out.println(p1.toString());
		
		tempCode = in.nextInt();
		in.nextLine();
		tempName = in.nextLine();
		tempAmount = in.nextInt();
		tempPrice = in.nextDouble();
		in.close();
		
		Product p2 = new Product(tempCode, tempName, tempAmount, tempPrice);
		System.out.println(p2.toString());
		
		Product p3 = new Product(4685, "IntelliJ IDEA", 3569, 20.00);
		System.out.println(p3.toString());
		
		Product p4 = new Product(5987, "Microsoft Visual Studio", 2548, 45.00);
		System.out.println(p4.toString());
		
		Product p5 = new Product(1651, "Eclipse IDE", 4589, 10.00);
		System.out.println(p5.toString());
		
		Product p6 = new Product(5154, "Apache NetBeans IDE", 1025, 23.00);
		p6.setActive(false);
		System.out.println(p6.toString());
	}
}
