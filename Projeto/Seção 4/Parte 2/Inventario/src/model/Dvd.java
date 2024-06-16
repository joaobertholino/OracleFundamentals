package model;

// TODO: Continuar do item b
public class Dvd extends Product {
	private int durationInMinute;
	private String ageRating;
	private String nameOfStudio;

	public Dvd() {
		this.durationInMinute = 0;
		this.ageRating = null;
		this.nameOfStudio = null;
	}

	public Dvd(int productCode, String productName, int productAmount, double productPrice, int durationInMinute,
			String ageRating, String nameOfStudio, String productType) {
		super(productCode, productName, productAmount, productPrice, productType);
		this.durationInMinute = durationInMinute;
		this.ageRating = ageRating;
		this.nameOfStudio = nameOfStudio;
	}

	public int getDurationInMinute() {
		return durationInMinute;
	}

	public void setDurationInMinute(int durationInMinute) {
		this.durationInMinute = durationInMinute;
	}

	public String getAgeRating() {
		return ageRating;
	}

	public void setAgeRating(String ageRating) {
		this.ageRating = ageRating;
	}

	public String getNameOfStudio() {
		return nameOfStudio;
	}

	public void setNameOfStudio(String nameOfStudio) {
		this.nameOfStudio = nameOfStudio;
	}

	@Override
	public double valueInventory(Product products) {
		return super.valueInventory(products) + (super.valueInventory(products) * 0.5);
	}

	@Override
	public String toString() {
		return "Number of product: " + getProductCode() + "\n" + "Name of product: " + getProductName() + "\n"
				+ "Duration: " + getDurationInMinute() + " minutes" + "\n" + "Classificação etaria: " + getAgeRating() + "\n"
				+ "Name of studio: " + getNameOfStudio() + "\n" + "Amount in stock: " + getProductAmount() + "\n" + "Price: "
				+ getProductPrice() + "\n" + "Value of stock: " + valueInventory(this) + "\n" + "Product status: "
				+ (getIsActive() ? "Disponivel" : "Descontinuado");
	}
}
