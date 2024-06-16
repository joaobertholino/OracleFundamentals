package view;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.Cd;
import model.Dvd;
import model.Product;

public class ProductTester {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int maxSize;
		int menuChoice;

		maxSize = getNumProducts(in);
		if (maxSize == 0) {
			System.out.println("No products required!");
		} else {
			Product[] product = new Product[maxSize];
			product = createProducts(product);
			do {
				menuChoice = getMenuOption(in);
				executeMenuChoice(menuChoice, product, in);
			} while (menuChoice != 0);
		}
	}

	private static void executeMenuChoice(int option, Product[] products, Scanner in) {
		switch (option) {
			case 1:
				displayInventory(products);
				break;
			case 2:
				addInventory(products, in);
				break;
			case 3:
				deductInventory(products, in);
				break;
			case 4:
				discontinueInventory(products, in);
				break;
			default:
				System.out.println("Opção invalida!");
		}
	}

	private static int getNumProducts(Scanner in) {
		int maxSize = -1;
		while (maxSize < 0) {
			try {
				System.out.println("Insira o número de produtos que deseja adicionar (0 para sair):");
				maxSize = in.nextInt();
				if (maxSize < 0)
					System.out.println("Valor incorreto inserido!");
			} catch (InputMismatchException e) {
				System.out.println("Tipo de dado incorreto!");
				in.next();
			}
		}
		return maxSize;
	}

	public static int getNumberOfProducts() {
		Scanner in = new Scanner(System.in);
		return getNumProducts(in);
	}

	private static void discontinueInventory(Product[] products, Scanner in) {
		int productChoice = getProductNumber(products, in);
		products[productChoice].setActive(false);
	}

	private static void addInventory(Product[] products, Scanner in) {
		int productChoice = getProductNumber(products, in);
		int updateValue = -1;
		int productOption = 0;

		try {
			System.out.println("Escolha oque adicionar: \n 1 - CD \n 2 - DVD");
			productOption = in.nextInt();

			System.out.println("Quantos produtos deseja adicionar?");
			updateValue = in.nextInt();

			if (updateValue <= 0 || (productOption < 1 || productOption > 2)) {
				throw new InputMismatchException("Somente os números 1 ou 2 são permitidos!");
			} else if (productOption == 1 && products[productChoice].getProductType() == "CD") {
				products[productChoice].addToInventory(updateValue);
			} else if (productOption == 2 && products[productChoice].getProductType() == "DVD") {
				products[productChoice].addToInventory(updateValue);
			}
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void deductInventory(Product[] products, Scanner in) {
		int productChoice = getProductNumber(products, in);
		int updateValue = -1;

		try {
			System.out.println("Insira um valor a ser deduzido:");
			updateValue = in.nextInt();
			if (updateValue < 0 || updateValue > products[productChoice].getProductAmount())
				throw new InputMismatchException();
			products[productChoice].deductFromInventory(updateValue);
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		}
	}

	private static int getMenuOption(Scanner in) {
		int option = -1;
		while (option < 0 || option > 4) {
			System.out.println("Escolha uma das opções abaixo:");
			System.out.println("1 - Exibir inventario");
			System.out.println("2 - Adicionar estoque");
			System.out.println("3 - Deduzir estoque");
			System.out.println("4 - Descontinuar produto");
			System.out.println("0 - Sair");
			option = in.nextInt();
			if (option < 0 || option > 4)
				System.out.println("Opção invalida!");
		}
		return option;
	}

	private static int getProductNumber(Product[] products, Scanner in) {
		int productChoice = -1;
		for (int i = 0; i < products.length; i++) {
			System.out.println("Indice do produto: " + i);
			System.out.println("Nome do produto: " + products[i].getProductName());
			System.out.println();
		}

		while (productChoice < 0 || productChoice >= products.length) {
			try {
				System.out.print("Escolha qual produto queira modificar!: ");
				productChoice = in.nextInt();
				if (productChoice < 0 || productChoice >= products.length)
					System.out.println("Indice invalido!");
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				continue;
			}
		}
		return productChoice;
	}

	private static void addToInventory(Product[] products, Scanner in) {
		try {
			System.out.println("Escolha qual tipo de produto:\n1 - CD\n2 - DVD");
			int tempOption = in.nextInt();

			switch (tempOption) {
				case 1:
					addCdToInventory(products, in);
					break;
				case 2:
					addDvdToInventory(products, in);
					break;
				default:
					throw new RuntimeException("Unexpected value: " + tempOption);
			}
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}

	// Adicione outras variáveis temporárias para incluir os campos de instância
	// adicionados à classe CD.
	private static void addCdToInventory(Product[] products, Scanner in) {
		for (int i = 0; i < products.length; i++) {
			System.out.println("Digite os dados do CD " + (i + 1) + ":");
			try {
				System.out.print("Nome do CD: ");
				String tempName = in.nextLine();
				
				System.out.print("Nome do artista: ");
				String tempNameOfArtist = in.nextLine();
				
				System.out.print("Selo da gravadora: ");
				String tempSticker = in.nextLine();
				
				System.out.print("Quantidade de musicas: ");
				int tempMusicAmount = in.nextInt();

				System.out.print("Duração/Minutos: ");
				int tempDuration = in.nextInt();

				System.out.print("Quantidade de CDs: ");
				int tempAmount = in.nextInt();

				System.out.print("Preço do CD: ");
				double tempPrice = in.nextDouble();

				System.out.print("Codigo do CD: ");
				int tempCode = in.nextInt();

				System.out.print("Nome do estudio: ");
				String tempNameOfStudio = in.nextLine();
				
				System.out.print("Tipo do produto: ");
				String tempTypeOfProduct = in.next();

				if (tempCode > 0 && tempAmount > 0 && tempPrice > 0) {
					products[i] = new Cd(tempCode, tempName, tempAmount, tempPrice, tempNameOfArtist, tempMusicAmount,
							tempDuration, tempNameOfStudio, tempSticker, tempTypeOfProduct);
				} else
					throw new InputMismatchException("Tipo de dado incorreto! Insira novamente os dados do CD " + (i + 1));
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
				i--;
			}
		}
	}

	private static void addDvdToInventory(Product[] products, Scanner in) {
		for (int i = 0; i < products.length; i++) {
			System.out.println("Digite os dados do DVD " + (i + 1) + ":");
			try {
				System.out.print("Nome do DVD: ");
				String tempName = in.nextLine();

				System.out.print("Nome do estudio cinimatografico: ");
				String tempNameOfStudio = in.nextLine();

				System.out.print("Classificação etaria: ");
				String tempAgeRating = in.nextLine();

				System.out.print("Duração/Minutos: ");
				int tempDuration = in.nextInt();

				System.out.print("Quantidade de DVDs: ");
				int tempAmount = in.nextInt();

				System.out.print("Preço do DVD: ");
				double tempPrice = in.nextDouble();

				System.out.print("Codigo do DVD: ");
				int tempCode = in.nextInt();
				
				System.out.print("Tipo do produto: ");
				String tempTypeOfProduct = in.next();

				if (tempCode > 0 && tempAmount > 0 && tempPrice > 0) {
					products[i] = new Dvd(tempCode, tempName, tempAmount, tempPrice, tempDuration, tempAgeRating, tempNameOfStudio, tempTypeOfProduct);
				} else
					throw new InputMismatchException();
			} catch (RuntimeException e) {
				System.out.println("Tipo de dado incorreto! Insira novamente os dados do DVD " + (i + 1));
				i--;
			}
		}
	}

	private static Product[] createProducts(Product[] products) {
		addToInventory(products, new Scanner(System.in));
		return products;
	}

	public static void displayInventory(Product[] products) {
		if (products.length == 0) {
			System.out.println("Sem produtos no estoque!");
		} else {
			for (int i = 0; i < products.length; i++) {
				System.out.println(products[i].toString());
			}
		}
	}
}
