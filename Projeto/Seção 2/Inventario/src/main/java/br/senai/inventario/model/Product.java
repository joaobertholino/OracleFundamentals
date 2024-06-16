package main.java.br.senai.inventario.model;


// TODO: Revisar codigo seção 5 e 4
public class Product {
	
//	Declarações de campo de instancia.
	private int productCode;
	private String productName;
	private int productAmount;
	private double productPrice;
	private boolean isActive;
	
	/**
	 * Declarando um bloco de inicialização de instancia onde irá inicializar a
	 * variavel de tipo boolean isActive com o valor true.
	 */
	{
		this.isActive = true;
	}
	
	/**
	 * Declarando construtor sem parametros onde será inicializada
	 * as variaveis com valores padrões.
	 */
	public Product() {
		this.productCode = 0000;
		this.productName = null;
		this.productAmount = 0;
		this.productPrice = 0.0;
	}
	
	/**
	 * Declarando construtor com parametros que recebera por meio
	 * de argumentos, os valores para inicializar as variaveis de campo.
	 */
	public Product(int productCode, String productName, int productAmount, double productPrice) {
		this.productCode = productCode;
		this.productName = productName;
		this.productAmount = productAmount;
		this.productPrice = productPrice;
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
	
	public void setActive(boolean active) {
		this.isActive = active;
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
		return "Number of product: " + this.productCode + "\n" 
	+ "Name of product: " + this.productName + "\n" 
				+ "Quantity in stock: " + this.productAmount + " units" + "\n" 
	+ "Price of product: R$" + this.productPrice + "\n" 
				+ "Value of Inventory: R$" + this.valueInventory(this) + "\n" 
	+ "Stats of product: " + (this.isActive ? "Ativo" : "Descontinuado");
	}
}
