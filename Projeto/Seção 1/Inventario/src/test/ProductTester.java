package test;

import inventario.Product;

public class ProductTester {

	public static void main(String[] args) {
		Product productOne = new Product();
		System.out.println(productOne.toString());
		
		Product productTwo = new Product();
		System.out.println(productTwo.toString());
		
		Product productThree = new Product(4685, "IntelliJ IDEA", 3569, 20.00);
		System.out.println(productThree.toString());
		
		Product productFour = new Product(5987, "Microsoft Visual Studio", 2548, 45.00);
		System.out.println(productFour.toString());
		
		Product productFive = new Product(1651, "Eclipse IDE", 4589, 10.00);
		System.out.println(productFive.toString());
		
		Product productSix = new Product(5154, "Apache NetBeans IDE", 1025, 23.00);
		System.out.println(productSix.toString());
	}
}
