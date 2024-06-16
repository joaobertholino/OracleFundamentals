package musicInstruments;

public class StringInstrument extends Instrument {
	private int numStrings;
	
	public StringInstrument() {
		super();
		this.numStrings = 0;
	}
	
	public StringInstrument(int numString, boolean onSale, double price, int numInStock) {
		super(onSale, price, numInStock);
		this.numStrings = numString;
	}
	
	public int getNumStrings() {
		return this.numStrings;
	}
	
	public void setNumStrings(int numStrings) {
		this.numStrings = numStrings;
	}
}
