package entities;

public class Shape {
	/** Variavel de instancia do tipo int. */
	private int numSides;

	/** Variavel de instancia do tipo boolean. */
	private boolean regular;

	/**
	 * Construtor sem parametros para inicialização das variaveis de instancia com
	 * valores padrões.
	 */
	public Shape() {
		this.numSides = 0;
		this.regular = false;
	}

	/**
	 * Construtor com parametros tipo int e boolean para receber valores como
	 * argumento a serem atribuidos as variaveis de instancia.
	 */
	public Shape(int numSides, boolean regular) {
		this.numSides = numSides;
		this.regular = regular;
	}

	/** Metodo getter que retorna o valor da variavel de instancia numSides. */
	public int getNumSides() {
		return this.numSides;
	}

	/**
	 * Metodo setter com um parametro do tipo int do qual recebe um valor como
	 * argumento a ser atribuido a variavel de instancia numSides.
	 */
	public void setNumSides(int numSides) {
		this.numSides = numSides;
	}

	/** Metodo getter que retorna o valor da variavel de instancia regular. */
	public boolean getRegular() {
		return this.regular;
	}

	/**
	 * Metodo setter com um parametro do tipo boolean do qual recebe um valor como
	 * argumento a ser atribuido a variavel de instancia regular.
	 */
	public void setRegular(boolean regular) {
		this.regular = regular;
	}
}
