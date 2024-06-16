package model;

import java.security.InvalidParameterException;

public class Product {

	// Declarações de campo de instancia.
	private int productCode;
	private String productName;
	private int productAmount;
	private double productPrice;
	private boolean isActive;
	private String productType;

	/**
	 * Declarando um bloco de inicialização de instancia onde irá inicializar a
	 * variavel de tipo boolean isActive com o valor true.
	 */
	{
		this.isActive = true;
	}

	/**
	 * Declarando construtor sem parametros onde será inicializada as variaveis com
	 * valores padrões.
	 */
	public Product() {
		this.productCode = 0000;
		this.productName = null;
		this.productAmount = 0;
		this.productPrice = 0.0;
		this.productType = null;
	}

	/**
	 * Declarando construtor com parametros que recebera por meio de argumentos, os
	 * valores para inicializar as variaveis de campo.
	 * 
	 * @param productCode
	 * @param productName
	 * @param productAmount
	 * @param productPrice
	 * @param productType
	 */
	public Product(int productCode, String productName, int productAmount, double productPrice, String productType) {
		this.productCode = productCode;
		this.productName = productName;
		this.productAmount = productAmount;
		this.productPrice = productPrice;
		this.productType = productType;
	}

	/**
	 * Método que recebe um valor inteiro como argumento, testa se este valor é
	 * maior que zero, se for, soma ao valor da variavel de instancia productAmount,
	 * se não for, é lançado uma exception que é capturada pelo bloco catch e
	 * imprime a mensagem referente ao tipo da exception.
	 * 
	 * @param amount
	 */
	public void addToInventory(int amount) {
		try {
			if (amount > 0) {
				this.productAmount += amount;
			} else {
				throw new InvalidParameterException();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * @param amount
	 */
	public void deductFromInventory(int amount) {
		if (amount > 0 && amount == this.productAmount) {
			System.out.println("Quantidade do estoque é igual ao valor fornecido: " + this.productAmount);
		} else if (amount > 0 && amount < this.productAmount) {
			System.out.println("Quantidade do estoque é maior que o valor fornecido: " + this.productAmount);
		} else if (amount > 0 && amount > this.productAmount) {
			System.out.println("Quantidade do estoque é menor que o valor fornecido: " + this.productAmount);
		} else {
			System.out.println("Valor insierido é invalido!");
		}
	}

	/**
	 * Declarando métodos Getters e Setters para cada variavel de campo.
	 */
	public int getProductCode() {
		return productCode;
	}

	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductAmount() {
		return productAmount;
	}

	public void setProductAmount(int productAmount) {
		this.productAmount = productAmount;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public boolean getActive() {
		return isActive;
	}

	public boolean getIsActive() {
		return this.isActive;
	}

	public void setActive(boolean active) {
		this.isActive = active;
	}

	public String getProductType() {
		return productType;
	}
	
	public void setProductType(String productType) {
		this.productType = productType;
	}
	
	/**
	 * Declarando metodo que retorna o produto da multiplicação entre o valor de
	 * productPrice e o valor de productAmount(valor total do inventario).
	 */
	public double valueInventory(Product product) {
		return product.getProductPrice() * product.getProductAmount();
	}

	@Override
	public String toString() {
		return "Number of product: " + this.productCode + "\n" + "Name of product: " + this.productName + "\n"
				+ "Quantity in stock: " + this.productAmount + " units" + "\n" + "Price of product: R$" + this.productPrice
				+ "\n" + "Value of Inventory: R$" + this.valueInventory(this) + "\n" + "Stats of product: "
				+ (this.isActive ? "Ativo" : "Descontinuado ");
	}

}
