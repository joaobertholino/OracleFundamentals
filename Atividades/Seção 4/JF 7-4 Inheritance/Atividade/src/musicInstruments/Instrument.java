package musicInstruments;

public class Instrument {
	private boolean onSale;
	private double price;
	private int numInStock;
	
	public Instrument() {
		this.onSale = false;
		this.price = 0.0;
		this.numInStock = 0;
	}
	
	public Instrument(boolean onSale, double price, int numInStock) {
		this.onSale = onSale;
		this.price = price;
		this.numInStock = numInStock;
	}
	
	public double applyEmployeeDiscount() {
		return this.price - this.price * 0.25;
	}
	
	public double applyOnSaleDiscount() {
		return (this.onSale == true) ? this.price - this.price * 0.15 : this.price;
	}
	
	public void setOnSale(boolean onSale) {
		this.onSale = onSale;
	}
	
	public boolean getOnSale() {
		return this.onSale;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getNumInStock() {
		return this.numInStock;
	}
	
	public void setNumInStock(int numInStock) {
		this.numInStock = numInStock;
	}
}
