package model;

import view.ProductTester;

public class Cd extends Product {
	private String nameOfArtist;
	private int musicAmount;
	private int durationInMinute;
	private String nameOfStudio;
	private String sticker;

	public Cd() {
		super();
		this.nameOfArtist = null;
		this.musicAmount = 0;
		this.durationInMinute = 0;
		this.nameOfStudio = null;
		this.sticker = null;
	}
	
	public Cd(int productCode, String productName, int productAmount,
			double productPrice, String nameOfArtist, int musicAmount,
			int durationInMinutes, String nameOfStudio, String sticker, String productType) {
		super(productCode, productName, productAmount, productPrice, productType);
		this.nameOfArtist = nameOfArtist;
		this.musicAmount = musicAmount;
		this.durationInMinute = durationInMinutes;
		this.nameOfStudio = nameOfStudio;
		this.sticker = sticker;
	}

	public int getDurationInMinute() {
		return durationInMinute;
	}

	public void setDurationInMinute(int durationInMinute) {
		this.durationInMinute = durationInMinute;
	}

	public String getNameOfStudio() {
		return nameOfStudio;
	}

	public void setNameOfStudio(String nameOfStudio) {
		this.nameOfStudio = nameOfStudio;
	}

	public String getNameOfArtist() {
		return nameOfArtist;
	}

	public void setNameOfArtist(String nameOfArtist) {
		this.nameOfArtist = nameOfArtist;
	}

	public int getMusicAmount() {
		return musicAmount;
	}

	public void setMusicAmount(int musicAmount) {
		this.musicAmount = musicAmount;
	}

	public String getSticker() {
		return sticker;
	}

	public void setSticker(String sticker) {
		this.sticker = sticker;
	}

	@Override
	public String toString() {
		return "Number of CD: " + getProductCode() + "\n" + "Name of CD: " + getProductName() + "\n" + "Artist: "
				+ getNameOfArtist() + "\n" + "Musics amount: " + getMusicAmount() + "\n" + "Sticker of production: "
				+ getSticker() + "\n" + "Amount in stock: " + getProductAmount() + "\n" + "Price: " + getProductPrice() + "\n"
				+ "Value of stock: " + valueInventory(this) + "\n" + "CD status: "
				+ (getIsActive() ? "Disponivel" : "Descontinuado");
	}
}
