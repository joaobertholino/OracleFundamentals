package musicInstruments;

public class Guitar extends StringInstrument {
	private boolean isElectric;
	
	public Guitar() {
		super();
		this.isElectric = false;
	}
	
	public Guitar(boolean isElectric, int numString, boolean onSale, double price, int numInStock) {
		super(numString, onSale, price, numInStock);
		this.isElectric = isElectric;
	}

	public boolean getIsElectric() {
		return this.isElectric;
	}
}
